package JavaStudy.Practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-18 09:24
 **/
class TreeNode {
    //孩子兄弟表示法
    public char val;
    public TreeNode left;//左子树
    public TreeNode right;//右子数

    //NodeTree parent; 孩子双亲表示法多一个表示
    public TreeNode(char val) {
        this.val = val;
    }
}

public class practice0518 {
    //求二叉树长度
    int getHeight(TreeNode root) {
        int ret = 0;
        if (root == null) {
            return 0;
        } else {
            ret = Math.max(getHeight(root.right), getHeight(root.left));
        }
        return ret + 1;
    }

    //实现一个函数，检查二叉树是否平衡。
    // 在这个问题中，平衡树的定义如下：任意一个节点，其两棵子树的高度差不超过 1。
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if (Math.abs(left - right) <= 1) {
            return true;
        }
        return isBalanced(root.right) && isBalanced(root.left);
    }

    //统计一个数字在排序数组中出现的次数。
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int n : nums) {
            if (n == target) {
                i++;
            }
        }
        return i;
    }

    //请完成一个函数，输入一个二叉树，该函数输出它的镜像。
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;
    }

    //给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/two-sum
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                return null;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}









