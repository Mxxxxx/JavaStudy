package JavaStudy.Study;

import java.util.*;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-14 21:09
 **/
class NodeTree {
    //孩子兄弟表示法
    public char val;
    public NodeTree left;//左子树
    public NodeTree right;//右子数

    //NodeTree parent; 孩子双亲表示法多一个表示
    public NodeTree(char val) {
        this.val = val;
    }
}

//遍历方式
//1.前序遍历  根-左-右
//2.中序遍历  左-根-右
//3.后序遍历  左-右-根

//二叉树
public class MyTree {
    public NodeTree buildTree() {
        NodeTree A = new NodeTree('A');
        NodeTree B = new NodeTree('B');
        NodeTree C = new NodeTree('C');
        NodeTree D = new NodeTree('D');
        NodeTree E = new NodeTree('E');
        NodeTree F = new NodeTree('F');
        NodeTree G = new NodeTree('G');
        NodeTree H = new NodeTree('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;
    }

    //前序遍历
    void preOrderTraversal(NodeTree root) {

        if (root == null) {
            return;
        }
        //如果根节点不为空，先打印根，然后遍历左，再去遍历右
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);//利用递归
        preOrderTraversal(root.right);
    }


    //中序遍历
    void inOrderTraversal(NodeTree root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    //后序遍历
    void postOrderTraversal(NodeTree root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    // 遍历思路-求结点个数
    static int size = 0;

    int getSize1(NodeTree root) {
        if (root == null) {
            return size;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);
        return size;
    }

    // 子问题思路-求结点个数
    int getSize2(NodeTree root) {
        if (root == null) {
            return 0;
        }
        return getSize1(root.right) + getSize1(root.left) + 1;
    }

    // 遍历思路-求叶子结点个数
    static int leafSize = 0;

    void getLeafSize1(NodeTree root) {
        if (root == null) {
            return;
        }
        if (root.right == null && root.left == null) {//判断是否是叶子节点
            leafSize++;
        }
        getSize1(root.right);
        getSize1(root.left);
    }

    // 子问题思路-求叶子结点个数
    int getLeafSize2(NodeTree root) {
        if (root.right == null && root.left == null) {
            return 1;
        }
        return getSize1(root.right) + getSize1(root.left);
    }

    // 子问题思路-求第 k 层结点个数
    int getKLevelSize(NodeTree root, int k) {
        if (root == null) {
            return 0;
        } else if (k == 1) {
            return 1;
        } else {
            return getKLevelSize(root.left, k - 1) + getKLevelSize(root.right, k - 1);
        }
    }

    // 获取二叉树的高度
    //找到当前树的左右两棵树的高度
    //取最大值+1
    int getHeight(NodeTree root) {
        int ret = 0;
        if (root == null) {
            return 0;
        } else {
            ret = Math.max(getHeight(root.right), getHeight(root.left));
        }
        return ret + 1;
    }

    // 查找 val 所在结点，没有找到返回 null
// 按照 根 -> 左子树 -> 右子树的顺序进行查找
// 一旦找到，立即返回，不需要继续在其他位置查找
    NodeTree find(NodeTree root, char val) {
        if (root == null) {
            return null;
        }
        //判断根节点是否是查找的值
        if (root.val == val) {
            return root;
        }
        //左树
        NodeTree nodeTreeLeft = find(root.left, val);
        if (nodeTreeLeft != null) {
            return nodeTreeLeft;
        }
        //右树
        NodeTree nodeTreeRight = find(root.right, val);//减少递归次数
        if (nodeTreeRight != null) {
            return nodeTreeRight;
        }
        return null;
    }

    //给定两个二叉树，编写一个函数来检验它们是否相同。
//如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的
    public boolean isSameTree(NodeTree p, NodeTree q) {
        //只要有一个不为空就为假
        //同时为空为真
        if (p == null && q != null || q != null && q == null) {
            return false;
        }
        if (p == null && q == null) {
            return true;
        }
        if (p.val != q.val) {
            //左右树是否相同
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(q.right, p.right);
    }

    //给定一个二叉树，判断它是否是高度平衡的二叉树。

    public boolean isBalanced(NodeTree root) {
        //先判断根节点左右两个数的高度差是否 <= 1
        //递归--》左树是不是平衡 && 右树
        int left, right;
        if (root == null) {
            return false;
        }
        left = getHeight(root.left);
        right = getHeight(root.right);
        if (left - right <= 1) {
            if (isBalanced(root.left) && isBalanced(root.right)) {
                return true;
            }
        }
        return false;
    }

    //给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。
    // s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
    public boolean isSubtree(NodeTree s, NodeTree t) {
        if (s == null || t == null) {
            return false;
        }
        //1.判断t是不是s的本身
        if (isSameTree(s, t)) {
            return true;
        }
        //2.判断t是不是s的左、右
        if (isSameTree(s.left, t)) {
            return true;
        }
        if (isSameTree(s.right, t)) {
            return true;
        }
        return false;
    }


    //给定一个二叉树，检查它是否是镜像对称的。
    public boolean isSymmetric(NodeTree root) {
        //判断根节点是不是对称
        //左树、右树是不是对称
        if (root == null) {
            return true;
        }
        return isSymmetricChild(root.left, root.right);
    }

    public boolean isSymmetricChild(NodeTree leftTree, NodeTree rightTree) {
        if ((leftTree != null && rightTree == null) || (leftTree == null && rightTree != null)) {
            return false;
        }
        if (leftTree == null && rightTree == null) {
            return true;
        }
        //值是不是相同、左树的左，右树的右是不是相同；左树的右，右树的左想不想同
        if (leftTree.val == rightTree.val) {
            return isSymmetricChild(leftTree.left, rightTree.right) && isSymmetricChild(leftTree.right, rightTree.left);
        }
        return false;
    }


    //层序遍历
    public void levelOrderTraversal(NodeTree root) {
        //利用队列
        //队列为空，根节点入队列
        if (root == null) {
            return;
        }
        Queue<NodeTree> queue = new LinkedList<>();
        queue.offer(root);
        //不为空，弹出队头元素，并且打印
        while (!queue.isEmpty()) {
            NodeTree cur = queue.poll();
            System.out.print(cur.val);
            //队列不为空，放左右,先左
            if (cur.left != null) {
                levelOrderTraversal(root.left);
            }
            if (cur.right != null) {
                levelOrderTraversal(root.right);
            }
        }
    }


    //层序遍历一层的节点
    public List<List<Character>> levelOrder(NodeTree root) {
        List<List<Character>> ret = new LinkedList<>();
        if (root == null) return ret;
        Queue<NodeTree> queue = new LinkedList<>();//队列，先进先出
        queue.offer(root);

        while (!queue.isEmpty()) {
            //1、求当前队列的大小  size
            int size = queue.size();
            List<Character> list = new ArrayList<>();
            //2、while(size > 0)  -->控制当前每一层的数据个数
            while (size > 0) {//循环每一层的进入列表
                NodeTree cur = queue.poll();
                if (cur != null) {
                    list.add(cur.val);
                    if (cur.left != null) {
                        queue.offer(cur.left);
                    }
                    if (cur.right != null) {
                        queue.offer(cur.right);
                    }
                }
                size--;
            }
            ret.add(list);
        }
        return ret;
    }

    //判断完全二叉树
    public boolean isCompleteTree(NodeTree root) {
        if (root == null) return true;
        //利用队列存储
        Queue<NodeTree> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            NodeTree cur = queue.poll();//弹出根节点
            if (cur != null) {
                queue.offer(cur.left);//左
                queue.offer(cur.right);//右
            } else {
                break;
            }
        }
        //遇到空  看队列里面是否都是空
        while (!queue.isEmpty()) {
            NodeTree cur2 = queue.peek();
            if (cur2 != null) {
                return false;
            } else {
                queue.poll();//弹出前面的null
            }
        }
        return true;
    }


    // 前序遍历(非递归)
    void preOrderTraversalNor(NodeTree root) {
        //利用栈
        if (root == null) {
            return;
        }
        Stack<NodeTree> stack = new Stack<>();
        NodeTree cur = root;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                System.out.println(cur.val);
                cur = cur.left;//左
            }
            NodeTree top = stack.pop();
            cur = top.right;//右
        }
    }

    // 中序遍历
    void inOrderTraversalNor(NodeTree root) {
        //利用栈
        if (root == null) {
            return;
        }
        Stack<NodeTree> stack = new Stack<>();
        NodeTree cur = root;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;//左
            }
            NodeTree top = stack.pop();
            System.out.println(top.val);
            cur = top.right;//右
        }
    }

    // 后序遍历
    void postOrderTraversalNor(NodeTree root) {
        if (root == null) {
            return;
        }
        Stack<NodeTree> stack = new Stack<>();
        NodeTree cur = root;
        NodeTree prev = null;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if (cur.right == null || cur.right == prev) {
                System.out.println(cur.val);
                stack.pop();
                prev = cur;
                cur = null;
            } else {
                cur = cur.right;
            }
        }
    }


    //

    public NodeTree buildTree(String str) {
        NodeTree root = null;
        int i = 0;
        if (str.charAt(i) == '#') {
            root = new NodeTree(str.charAt(i));
            i++;
            root.left = buildTree(str);
            root.right = buildTree(str);
        } else {
            i++;
        }
        return root;
    }


    public NodeTree lowestCommonAncestor(NodeTree root, NodeTree p, NodeTree q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }
        NodeTree left = lowestCommonAncestor(root.left, p, q);
        NodeTree right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            //左右都找到了
            return root;
        } else if (left != null) {
            return left;
        } else {
            return right;
        }
    }

    //输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
    //要排好序，则中序遍历
    public NodeTree prev = null;//

    public void ConvertChild(NodeTree pRootOfTree) {
        if (pRootOfTree == null) {
            return;
        }
        ConvertChild(pRootOfTree.left);
        //System.out.println(pRootOfTree.val);

        //左树
        pRootOfTree.left = prev;//头一个指向空
        if (prev != null) {
            prev.right = pRootOfTree;
        }
        prev = pRootOfTree;// prev指向了下一个节点  双向链表

        ConvertChild(pRootOfTree.right);
    }

    public NodeTree Convert(NodeTree pRootOfTree) {
        //在中序遍历的过程中，修改二叉树的结构
        if (pRootOfTree == null) {
            return null;
        }
        ConvertChild(pRootOfTree);
        NodeTree head = null;
        while (pRootOfTree.left != null) {
            head = pRootOfTree.left;
        }
        return head;
    }



}
