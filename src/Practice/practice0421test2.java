package Practice;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-04-21 21:51
 **/
public class practice0421test2 {
    public static void main(String[] args) {
        MyLinkList0421 myLinkList0421 = new MyLinkList0421();
        MyLinkList0421 myLinkList04212 = new MyLinkList0421();
        myLinkList0421.addFirst(1);
        myLinkList0421.addFirst(2);
        myLinkList0421.addFirst(3);
        myLinkList0421.addFirst(4);
        System.out.println("头插法");
        myLinkList0421.display();
        System.out.println();
        System.out.println("尾插法");
        myLinkList04212.addLast(1);
        myLinkList04212.addLast(2);
        myLinkList04212.addLast(3);
        myLinkList04212.addLast(4);
        myLinkList04212.display();
        System.out.println();
        System.out.println("计算单链表长度");
        System.out.println(myLinkList04212.size());
        System.out.println("查找是否包含某个关键字.4.key");
        System.out.println(myLinkList04212.keyFind(4));
        System.out.println("任意位置插入");
        myLinkList04212.addIndex(2,6);
        myLinkList04212.display();
    }
}
