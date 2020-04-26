package JavaStudy.Practice;


/**
 * program: Java
 * description:
 * author: Mx
 * create: 2020-04-21 09:27
 **/
public class practice0421 {
    public static void main(String[] args) {
        MyArrayList0421 myArrayList0421 = new MyArrayList0421(); //构造对象   也调用了构造方法
        for (int i = 0; i < 10; i++) {
            myArrayList0421.add(i, i);
        }
        System.out.println("打印顺序表");
        myArrayList0421.display();
        System.out.println();
        System.out.println("在二号位置插入22");
        myArrayList0421.add(1, 22);
        myArrayList0421.display();
        System.out.println();
        System.out.println("判断是否包含某元素.22,65");
        System.out.println(myArrayList0421.contains(22));
        System.out.println(myArrayList0421.contains(65));
        System.out.println("查找元素下标位置");
        System.out.println(myArrayList0421.search(5));
        System.out.println(myArrayList0421.search(65));
        System.out.println("获取下标位置的元素.1");
        System.out.println(myArrayList0421.getPos(1));
        System.out.println("更改下标位置的元素.2号位-》6");
        myArrayList0421.setPos(2,6);
        myArrayList0421.display();
        System.out.println();
        System.out.println("获取顺序表长度");
        System.out.println(myArrayList0421.size());
        System.out.println("删除第一次的关键字");

        System.out.println("清空顺序表");
        myArrayList0421.clear();
        myArrayList0421.display();
    }
}
