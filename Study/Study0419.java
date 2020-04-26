package JavaStudy.Study;

/**
 * @program: Java
 * @description:顺序表
 * @author: Mx
 * @create: 2020-04-19 15:18
 **/
public class Study0419 {
    public static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList();
        MyArrayList myArrayList2 = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            myArrayList1.add(i,i);
        }
        System.out.println("打印顺序表");
        myArrayList1.display();
        System.out.println("在位置2，插入顺序表元素112");
        myArrayList1.add(2,112);
        myArrayList1.display();
        System.out.println("查找顺序表中是否有某元素6");
        System.out.println(myArrayList1.contains(6));
        System.out.println("查找顺序表8对应的位置");
        System.out.println(myArrayList1.search(8));
        System.out.println("获取2 pos位置的元素");
        System.out.println(myArrayList1.getPos(2));
        System.out.println("获取顺序表长度");
        System.out.println(myArrayList1.size());
        System.out.println("删除第一次出现的数字122");
        myArrayList1.remove(112);
        myArrayList1.display();
        System.out.println("更新位置元素");
        myArrayList1.setPos(2,80);
        myArrayList1.display();
        System.out.println("清除");
        myArrayList1.clear();
        myArrayList1.display();
    }
}
