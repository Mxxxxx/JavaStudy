package JavaStudy.Practice;

import java.util.Arrays;

/**
 * @Author Meng Xin
 * @Date 2020/7/10 16:33
 */
public class practice0710 {
    //链接：https://www.nowcoder.com/questionTerminal/fbcf95ed620f42a88be24eb2cd57ec54
    //来源：牛客网
    //
    //春节期间小明使用微信收到很多个红包，非常开心。在查看领取红包记录时发现，某个红包金额出现的次数超过了红包总数的一半。请帮小明找到该红包金额。写出具体算法思路和代码实现，要求算法尽可能高效。
    //
    //给定一个红包的金额数组gifts及它的大小n，请返回所求红包的金额。
    //
    //若没有金额超过总数的一半，返回0。
    public int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);//数组排序，采用Arrays的sort方法
        int ans = gifts[n / 2];//理论上超过半数的数字
        int num = 0;
//遍历数组，进行统计
        for (int i = 0; i < gifts.length; i++) {
            if (gifts[i] == ans) {
                num++;
            }
        }
        return num <= n / 2 ? 0 : ans;
    }

//    public ListNode partition(ListNode pHead, int x) {
//        // write code here
//        if(pHead == null || pHead.next == null)
//        {
//            return pHead;
//        }
//        ListNode cur = pHead;
//        ListNode Shead = new ListNode(-1);
//        ListNode Bhead = new ListNode(-1);
//        ListNode Stmp = Shead;
//        ListNode Btmp = Bhead;
//        while(cur != null){
//            if(cur.val < x){
//                Stmp.next = new ListNode(cur.val);
//                Stmp = Stmp.next;
//            }else{
//                Btmp.next = new ListNode(cur.val);
//                Btmp = Btmp.next;
//            }
//            cur = cur.next;
//        }
//        cur = Shead;
//        while(cur.next != null && cur.next.val != -1){
//            cur = cur.next;
//        }
//        cur.next = Bhead.next;
//        return Shead.next;
//    }
}
