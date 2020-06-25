package JavaStudy.Practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-23 07:49
 **/
class ListNode1 {
    int val;
    ListNode1 next = null;

    ListNode1(int val) {
        this.val = val;
    }
}

public class practice0623 {
    public ListNode1 partition(ListNode1 pHead, int x) {
        ListNode1 listNode1 = new ListNode1(-1);
        ListNode1 listNode2 = new ListNode1(-1);
        ListNode1 cur = pHead;
        while (cur.next != null) {
            if (pHead.val < x) {
                listNode1.next = cur;
                cur = cur.next;
            } else {
                listNode2.next = cur;
                cur = cur.next;
            }
        }
        ListNode1 cur2 = listNode1;
        while (cur2.next != null) {
            cur2 = cur2.next;
        }
        cur2.next = listNode2.next;
        return listNode1.next;
    }

    //给你两个二进制字符串，返回它们的和（用二进制表示）。
    //
    //输入为 非空 字符串且只包含数字 1 和 0。
    public String addBinary(String a, String b) {
        StringBuffer ans = new StringBuffer();

        int n = Math.max(a.length(), b.length()), carry = 0;
        for (int i = 0; i < n; ++i) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }

        if (carry > 0) {
            ans.append('1');
        }
        ans.reverse();

        return ans.toString();
    }

    //给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
    //
    //请返回 nums 的动态和。
    //
    // 
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/running-sum-of-1d-array
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public int[] runningSum(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                array[i] += nums[j];
            }
        }
        return array;
    }

    //给你两个整数，n 和 start 。
    //
    //数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
    //
    //请返回 nums 中所有元素按位异或（XOR）后得到的结果。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/xor-operation-in-an-array
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public int xorOperation(int n, int start) {
        //int[] array = new int[n];
        int ret = 0;
        for (int i = 0; i < n; i++) {
            //array[i] = start + i * 2;
            ret ^= (start + i * 2);
        }
        return ret;

    }

}
