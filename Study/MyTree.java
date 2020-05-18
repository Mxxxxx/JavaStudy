package JavaStudy.Study;

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
        getSize1(root.left);
        getSize1(root.right);
        size++;
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
        if (root.right == null && root.left == null) {
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

}
