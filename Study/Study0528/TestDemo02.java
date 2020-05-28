package JavaStudy.Study.Study0528;

/**
 * @program: Java
 * @description:二叉搜索树
 * @author: Mx
 * @create: 2020-05-28 19:42
 **/
public class TestDemo02 {
    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node root = null;

    public boolean insert(int val) {
        //每次比较的时候，cur.val 需要和插入的元素进行比较
        //小 cur=cur.left
        //大 cur=cur.right
        //插入时间 cur==null时
        Node node = new Node(val);
        if (root == null) {
            root = node;
            return true;
        }
        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if (cur.val == val) {
                return false;
            } else if (cur.val < val) {//节点小于插入值，放右
                parent = cur;
                cur = cur.right;
            } else {//节点大于插入值，放左
                parent = cur;//记录前一个
                cur = cur.left;
            }
        }
        //cur为空 parent为cur前一个
        //插入
        if (parent.val < val) {
            //右
            parent.right = node;
        } else {
            //左
            parent.left = node;
        }
        return true;
    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        preOrder(root.left);
        System.out.print(root.val + " ");
        preOrder(root.right);
    }

    public Node search(int val) {
        Node cur = root;
        while (cur != null) {
            if (cur.val == val) {
                return cur;
            } else if (cur.val < val) {
                cur = cur.right;
            } else {
                cur = cur.left;
            }
        }
        return null;
    }

    public void removNode(Node parent, Node cur) {
        //cur.left=null
        if (cur.left == null) {
            if (cur == root) {
                root = cur.right;
            } else {
                if (cur == parent.left) {
                    parent.left = cur.right;
                } else {
                    parent.right = cur.right;
                }
            }
            //cur.right=null
        } else if (cur.right == null) {
            if (cur == root) {
                root = cur.left;
            } else {
                if (cur == parent.left) {
                    parent.left = cur.left;
                } else {
                    parent.right = cur.left;
                }
            }
            //cur.left!=null && cur.right!=null
        } else {
            Node targetParent = cur;
            Node target = cur.right;
            while (target.left != null) {
                targetParent = target;
                target = target.left;
            }
            cur.val = target.val;
            if (target == targetParent.left) {
                targetParent.left = target.right;
            } else {
                targetParent.right = target.right;
            }
        }
    }

    public boolean remove(int key) {
        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if (cur.val == key) {
                //删除
                removNode(parent, cur);
                return true;
            } else if (key < cur.val) {
                parent = cur;
                cur = cur.left;
            } else {
                parent = cur;
                cur = cur.right;
            }
        }
        return false;
    }
}
