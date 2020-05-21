package JavaStudy.Practice;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-21 08:54
 **/

class TreeNode2 {
    int val;
    TreeNode2 left;
    TreeNode2 right;

    TreeNode2(int x) {
        val = x;
    }
}

public class practice0521 {

    //给定一个二叉树，编写一个函数来获取这个树的最大宽度。树的宽度是所有层中的最大宽度。这个二叉树与满二叉树（full binary tree）结构相同，但一些节点为空。
    //
    //每一层的宽度被定义为两个端点（该层最左和最右的非空节点，两端点间的null节点也计入长度）之间的长度。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/maximum-width-of-binary-tree
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


    //给定一个二叉树，确定它是否是一个完全二叉树。
    //
    //百度百科中对完全二叉树的定义如下：
    //
    //若设二叉树的深度为 h，除第 h 层外，其它各层 (1～h-1) 的结点数都达到最大个数，第 h 层所有的结点都连续集中在最左边，这就是完全二叉树。（注：第 h 层可能包含 1~ 2h 个节点。）
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/check-completeness-of-a-binary-tree
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


    //给你一个树，请你 按中序遍历 重新排列树，使树中最左边的结点现在是树的根，
    // 并且每个结点没有左子结点，只有一个右子结点。

    public void ZHONGXU(TreeNode2 root, List<Integer> queue) {
        if (root == null) {
            return;
        }

        ZHONGXU(root.left, queue);
        queue.add(root.val);
        ZHONGXU(root.right, queue);
    }

    public TreeNode2 increasingBST(TreeNode2 root) {
        List<Integer> queue = new ArrayList<>();
        ZHONGXU(root, queue);
        TreeNode2 treeNode2 = new TreeNode2(0);//第一个
        TreeNode2 cur = treeNode2;
        for (int a : queue) {
            cur.right = new TreeNode2(a);
            cur = cur.right;
        }
        return treeNode2.right;
    }

}
