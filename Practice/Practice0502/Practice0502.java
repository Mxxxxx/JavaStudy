package JavaStudy.Practice.Practice0502;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-02 15:40
 **/
//编写一个函数，检查输入的链表是否是回文的。
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Practice0502 {

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode cur = head;
        //链表为空的情况
        if (head == null) {
            return false;
        }
        //判断只有一个节点情况
        if (head.next == null) {
            return true;
        }
        //找中间
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //跳到最后一个节点,将其反转
        ListNode cur2 = slow.next;
        while (cur2 != null) {
            ListNode cur3 = cur2.next;//先找后一个，否则无法连接
            cur2.next = slow;
            slow = cur2;
            cur2 = cur3;
        }
        //判断回文
        while (cur != slow) {
            if (cur.val != slow.val) {
                return false;
            }
            if (cur.next == slow) {//偶数链表
                return true;
            }
            cur = cur.next;
            slow = slow.next;
        }
        return true;
    }


    //给定两个用链表表示的整数，每个节点包含一个数位。这些数位是反向存放的，也就是个位排在链表首部。
    //编写函数对这两个整数求和，并用链表形式返回结果。
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(-1);
        ListNode cur = listNode;

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        int jinwei = 0;
        //链表不等长的，一个还有就继续执行
        while (l1 != null || l2 != null) {
            //这样可以计算不等长的链表情况
            int a = l1 == null ? 0 : l1.val;//判断链表值
            int b = l2 == null ? 0 : l2.val;
            int tmp = (a + b + jinwei) % 10;
            jinwei = (a + b + jinwei) / 10;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

            cur.next = new ListNode(tmp);
            cur = cur.next;
        }
        //只有一个节点情况
        if (jinwei != 0) {
            cur.next = new ListNode(jinwei);
        }
        return listNode.next;
    }


    //给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //反转链表
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pur = null;
        ListNode tmp = null;
        while (cur != null) {
            tmp = cur.next;
            cur.next = pur;
            pur = cur;
            cur = tmp;
        }
        return pur;
    }

    //输出该链表中倒数第k个节点
    public ListNode getKthFromEnd(ListNode head, int k) {
        int count = 0;
        ListNode cur1 = head;
        //计算链表节点个数
        while (cur1 != null) {
            count++;
            cur1 = cur1.next;
        }
        int ret = count - k;//正向走的次数
        ListNode cur2 = head;
        while (ret > 0) {
            cur2 = cur2.next;
            ret--;
        }
        return cur2;
    }
}
