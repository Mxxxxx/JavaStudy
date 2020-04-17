package Study;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-04-13 18:18
 **/
public class Study0413 {
//    /**
//     *   n盘子个数
//     * @param pos1  起始
//     * @param pos2  中途
//     *  pos3  最终
//     */
    //汉诺塔问题
    /*public static void move(char pos1, char pos2) {
        System.out.println(pos1+"->"+pos2+" ");
    }
    public static void hanoi(int n,char pos1,char pos2,char pos3){
        if (n==1){
            move(pos1,pos3);
        }else {
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }
    }
    public static void main(String[] args) {
        //2^1-1      2^2-1   2^3-1Scanner sc = new Scanner(System.in);
    hanoi(1,'A','B','C');
    hanoi(2,'A','B','C');
    hanoi(3,'A','B','C');

    }*/


    //数组
    /*
    在堆中
    new： 关键字 实例化对象
     */
    // public static void main(String[] args) {

        /*
        array在栈上开辟内存||后面的在堆里面
        array引用类型，————》存放地址
        不能拿到栈上地址，实际上是拿到堆上地址。---堆上地址是经过哈希的
        */

//        int[] array = {1, 2, 3, 4};
//        System.out.println(array);
//        int[] array2 = new int[]{11, 22, 33, 44};
//        int[] array3 = new int[10];        //默认随机值是0   c中为随机值
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }


//    public static void main(String[] args) {
//        int[] array={1,2,3,4,5,6};
//        System.out.println(array.length);
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+" ");
//        }
//        System.out.printf("\n");
//        System.out.println("****");
//        //
//        for (int val:array) {
//            //单纯遍历数组
//            System.out.print(val);
//        }
//    }

    //数组作为参数传递
//    public static void printArray(int[] array) {
//        for (int x : array) {
//            System.out.println(x + " ");
//        }
//    }
//
//    public static void swapArray(int[] array) {
//        int tmp = array[0];
//        array[0] = array[1];
//        array[1] = tmp;
//    }
//
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
//        printArray(array);
//        int[] array2 = {10, 20};
//        System.out.println(array2[0] + " " + array2[1]);
//        swapArray(array2);
//        System.out.println(array2[0] + " " + array2[1]);
//    }

//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6, 7};
//        //将数组以 字符串 形式输出
//        String ret = Arrays.toString(array);
//        System.out.println(ret);
//    }
//    public static void arrayy(int[] array){
//        array[0]=10;
//        System.out.println(array[0]);
//    }
//    public static void main(String[] args) {
//        int[] array={1,2,3};
//        System.out.println(array[0]);
//        arrayy(array);
//        System.out.println(array[0]);
//    }

//    public static int[] func(int[] array) {
//        int tmp[] = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            tmp[i] = array[i] * 2;
//        }
//        return tmp;
//    }

    //    public static void main(String[] args) {
//        /*
//        array不引用任何对象，空对象
//         */
//        //  int[] array=null;  //不是0地址  就是空对象
//        // System.out.println(array);
//        int[] array = {1, 2, 3};
//        System.out.println(array);
//        int[] ret = func(array);
//        System.out.println(Arrays.toString(ret));

    public static String myToString(int[] array) {
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if (i != array.length - 1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 3, 4};
        System.out.println(myToString(array));
    }
}

