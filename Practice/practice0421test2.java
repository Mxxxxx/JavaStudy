package JavaStudy.Practice;


/**
 * program: Java
 * description:
 * author: Mx
 * create: 2020-04-21 21:51
 **/
public class practice0421test2 {
    //找两个链表相遇的节点
    //1.求单链表长度
    //2.计算差值  让长的单链表先走差值步
    //3.然后同时开始走

    public static Node getIntersectionNode(Node nodeA, Node nodeB) {
        //求长度
        Node pl = nodeA;
        Node ps = nodeB;
        int countA = 0;
        int countB = 0;
        while (pl != null) {
            countA++;
            pl = pl.next;
        }
        while (ps != null) {
            countB++;
            ps = ps.next;
        }
        int len = countA - countB;
        if (len < 0) {//说明B长
            pl = nodeB; //交换
            ps = nodeA;
            len = countB - countA;
        }
        for (int i = 0; i < len; i++) {
            pl = pl.next;//长的先走
        }
        while (ps != pl && pl != null && ps != null) {
            ps = ps.next;//同步走
            pl = pl.next;
        }//pl==ps 退出循环
        if (pl == ps && pl != null) {
            return pl;
        }
        return null;
    }

    public static void createCut(Node nodeA, Node nodeB) {
        nodeA.next = nodeB.next.next;
    }

    public static void main(String[] args) {
        //MyLinkList0421 myLinkList04211 = new MyLinkList0421();
        MyLinkList0421 myLinkList1 = new MyLinkList0421();
        MyLinkList0421 myLinkList2 = new MyLinkList0421();
//        myLinkList04211.addLast(1);
//        myLinkList04211.addLast(2);
//        myLinkList04211.addLast(3);
//        myLinkList04211.display();
        //   System.out.println();
        myLinkList1.addLast(1);
        myLinkList1.addLast(2);
        myLinkList1.addLast(2);
        myLinkList1.addLast(8);
        myLinkList1.addLast(3);
        myLinkList1.addLast(4);
        myLinkList1.addLast(5);
        System.out.println();
        myLinkList2.addLast(5);
        myLinkList2.addLast(6);
        myLinkList2.addLast(4);
        myLinkList2.addLast(2);
        myLinkList2.addLast(7);
        myLinkList2.addLast(8);
        createCut(myLinkList1.head, myLinkList2.head);
        System.out.println(getIntersectionNode(myLinkList1.head, myLinkList2.head).data);
//        System.out.println();
//        System.out.println("以给定值x为基准将链表分割成两部分");
//        Node ret = myLinkList.partition(5);
//        myLinkList.display2(ret);
//        System.out.println();
//        System.out.println("存在重复的结点，请删除该链表中重复的结点");
//        myLinkList.deleteDuplication();
//        myLinkList.display2(ret);
//        System.out.println("判断是否是回文结构");
//        System.out.println(myLinkList.chkPalindrome());

        //        myLinkList0421.addFirst(1);
//        myLinkList0421.addFirst(2);
//        myLinkList0421.addFirst(3);
//        myLinkList0421.addFirst(4);
//        System.out.println("头插法");
//        myLinkList0421.display();
//        System.out.println();
//        System.out.println("尾插法");
//        myLinkList04212.addLast(1);
//        myLinkList04212.addLast(2);
//        myLinkList04212.addLast(3);
//        myLinkList04212.addLast(4);
//        myLinkList04212.display();
//        System.out.println();
//        System.out.println("计算单链表长度");
//        System.out.println(myLinkList04212.size());
//        System.out.println("查找是否包含某个关键字.4.key");
//        System.out.println(myLinkList04212.keyFind(4));
//        System.out.println("任意位置插入");
//        myLinkList04212.addIndex(2, 6);
//        myLinkList04212.display();
//        System.out.println();
        //   System.out.println("删除第一次出现关键字(3)key的节点");
        // myLinkList04212.findKey(3);
        //myLinkList04212.display();
        //  System.out.println();
        // System.out.println("删除所有关键字为key（4）的节点");
        // myLinkList04212.deleteKey(4);
        // myLinkList04212.display();
        //  System.out.println();
        // System.out.println("反转单链表");
        //myLinkList04212.display2(myLinkList04212.reverse());
//        System.out.println();
//        System.out.println("查找中间节点值");
//        System.out.println(myLinkList04212.returnMid());
//        System.out.println("查找倒数第k个");
//        System.out.println(myLinkList04212.findReverseKey(3));
//        System.out.println("清除单链表，回收内存");
//        myLinkList04212.clear();
//        myLinkList04212.display();
    }
}
