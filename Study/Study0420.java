package JavaStudy.Study;


/**
 * Program: Java
 * description:单链表
 * 单链表由节点组成
 * 1.不带头节点的单向非循环链表/循环链表
 * 2.带头节点的单向非循环链表/循环链表
 *
 * 每个节点都是对象
 * int data
 * Node next
 * author: Mx
 * create: 2020-04-20 18:30
 **/
public class Study0420 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList1=new MyLinkedList();
        System.out.println("头插法");
        myLinkedList1.addFirst(10);
        myLinkedList1.addFirst(11);
        myLinkedList1.addFirst(12);
        myLinkedList1.addFirst(13);
        myLinkedList1.display();
        System.out.println();
        System.out.println("尾插法");
        MyLinkedList myLinkedList2=new MyLinkedList();
        myLinkedList2.addLast(10);
        myLinkedList2.addLast(11);
        myLinkedList2.addLast(12);
        myLinkedList2.addLast(13);
        myLinkedList2.display();
        System.out.println();
        System.out.println("计算单链表长度");
        System.out.println(myLinkedList2.size());
        System.out.println("查找关键字，是否在单链表");
        System.out.println(myLinkedList2.contains(11));
    }
}
