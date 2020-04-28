package JavaStudy.Practice;

/**
 * Java
 * 链表力扣练习
 * <p>
 * 2020-04-27 10:28
 **/
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class LeetCodeLinkedList {

    //  给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
            } else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        newHead = newHead.next;
        tmp.next = null;
        return newHead;
    }

    //给定一个链表，判断链表中是否有环。
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if (head == null) { //判断链表是否为空
            return false;
        }
        if (head.next == null) { //判断链表是否只有一个节点
            return false;
        }
        //判断有没有环
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    //删除单向链表中间的某个节点（除了第一个和最后一个节点，不一定是中间节点）
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    //实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
//    private int size(ListNode head) {
//        //计算长度
//        int count = 0;
//        ListNode cur = head;
//        while (cur != null) {
//            count++;
//            cur = cur.next;
//        }
//        return count;
//    }

    public int kthToLast(ListNode head, int k) {
        ListNode cur = head;
        if (cur.next == null) {
            return cur.val;
        }
        if (cur == null) {
            return -1;
        }
        //计算长度
        int count = 0;
        ListNode cur1 = head;
        while (cur1 != null) {
            count++;
            cur1 = cur1.next;
        }
        int size = count - k;

        while (size > 0) {
            cur = cur.next;
            size--;
        }
        return cur.val;
    }

    //给定两个用链表表示的整数，每个节点包含一个数位。编写函数对这两个整数求和，并用链表形式返回结果。
   // public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //    return
    }
//}
