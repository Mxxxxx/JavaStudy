package JavaStudy.Practice;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-19 19:48
 **/

public class practice0519 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //根据一棵树的前序遍历与中序遍历构造二叉树。
    public int preIndex = 0;

    public TreeNode buildTreeChild(int[] preorder, int[] inorder, int inbegin, int inend) {

        if (inbegin > inend) return null;//没有节点了

        TreeNode root = new TreeNode(preorder[preIndex]);
        //2、找到当前根节点，在中序遍历当中的位置
        int rootIndex = findIndexOfInorder(inorder, inbegin, inend, preorder[preIndex]);
        preIndex++;

        if (rootIndex == -1) return null;

        root.left = buildTreeChild(preorder, inorder, inbegin, rootIndex - 1);

        root.right = buildTreeChild(preorder, inorder, rootIndex + 1, inend);

        return root;
    }

    public int findIndexOfInorder(int[] inorder, int inbegin, int inend, int val) {
        for (int i = inbegin; i <= inend; i++) {
            if (inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) return null;
        if (preorder.length <= 0 || inorder.length <= 0) return null;
        return buildTreeChild(preorder, inorder, 0, inorder.length - 1);
    }




    //

}
