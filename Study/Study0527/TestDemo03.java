package JavaStudy.Study.Study0527;

import java.util.ArrayList;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * 打印集合当中的所有元素
 * @create: 2020-05-26 19:33
 **/
class GenericList {
    public static <T> void printList(ArrayList<T> list) {
        for (T val : list) {
            System.out.print(val + " ");
        }
    }

    //通配符打印 ?
    //一般用于读取
    //既有上界也有下届
    //  extends   super
    public static void printList2(ArrayList<?> list) {
        for (Object val : list) {

            System.out.print(val + " ");
        }
    }
}

public class TestDemo03 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        GenericList.printList(arrayList);
    }
}
