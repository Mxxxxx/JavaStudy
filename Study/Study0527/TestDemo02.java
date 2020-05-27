package JavaStudy.Study.Study0527;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * 写一个泛型类，包含一个方法，找到数组当中的最大值
 * T extends Comparable<T> 上界   T一定是实现了Comparable接口
 * 没有下届
 * @create: 2020-05-26 19:02
 **/
class Generic<T extends Comparable<T>> {
    public T maxNum(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}

//类型的推到,根据实参的类型推导出形参的类型
class Generic2 {
    public static <T extends Comparable<T>> T maxNum(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}

public class TestDemo02 {
    public static void main(String[] args) {
        Integer[] array = {12, 4, 2, 8, 7, 19};
        System.out.println(Generic2.maxNum(array));
        String[] array2 = {"j", "c"};
        System.out.println(Generic2.maxNum(array2));
    }

    public static void main1(String[] args) {
        Generic<Integer> generic = new Generic<>();
        Integer[] array = {12, 4, 2, 8, 7, 19};
        System.out.println(generic.maxNum(array));

        Generic<String> generic2 = new Generic<>();
        String[] array2 = {"j", "c"};
        System.out.println(generic2.maxNum(array2));
    }
}
