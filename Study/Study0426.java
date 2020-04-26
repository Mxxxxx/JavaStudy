package JavaStudy.Study;


/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-04-26 18:59
 **/
public class Study0426 {
    public static void main(String[] args) {
        MyDoubleLinkedList myDoubleLinkedList = new MyDoubleLinkedList();
        myDoubleLinkedList.addFirst(1);
        myDoubleLinkedList.addFirst(2);
        myDoubleLinkedList.addFirst(3);
        myDoubleLinkedList.addFirst(4);

        System.out.println("头插法打印");
        myDoubleLinkedList.display();
        System.out.println();

        MyDoubleLinkedList myDoubleLinkedList1 = new MyDoubleLinkedList();
        System.out.println("尾插法打印");
        myDoubleLinkedList1.addLast(1);
        myDoubleLinkedList1.addLast(2);
        myDoubleLinkedList1.addLast(3);
        myDoubleLinkedList1.addLast(4);
        myDoubleLinkedList1.display();

        System.out.println();
        System.out.println("查找给定值");
        System.out.println(myDoubleLinkedList1.contains(4));

        System.out.println("计算链表长度");
        System.out.println(myDoubleLinkedList1.size());


        System.out.println("下标插入");
        myDoubleLinkedList1.index(4,6);
        myDoubleLinkedList1.display();

        System.out.println();
        System.out.println("删除关键字节点");
        myDoubleLinkedList1.remove(3);
        myDoubleLinkedList1.display();

        System.out.println();
        System.out.println("删除所有");
        myDoubleLinkedList.clear();
        myDoubleLinkedList.display();
    }
}
