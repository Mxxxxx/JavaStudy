package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-04-14 14:15
 **/
public class homework0414 {

    //方法计算数组平均数
//    public static int arg(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        return sum / (arr.length);
//    }
//
//    public static void main(String[] args) {
//        int[] array=new int[3];
//        Scanner sc=new Scanner(System.in);
//        for (int i = 0; i < array.length; i++) {
//            array[i]=sc.nextInt();
//        }
//        System.out.println("输入数组的平均数是："+arg(array));
//    }

    //数组合
//    public static int sum(int[] array) {
//        int sum = 0;
//        for (int val:array) {
//            sum+=val;
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int[] array = new int[5];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < array.length; i++) {
//            array[i] = sc.nextInt();
//        }
//        System.out.println(sum(array));
//    }
//    public static void transform(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            array[i] = array[i] * 2;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] array = new int[3];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < array.length; i++) {
//            array[i] = sc.nextInt();
//        }
//        transform(array);
//        System.out.println(Arrays.toString(array));
//    }
//    public static void printArray(int[] array) {
//        for (int i : array) {
//            System.out.print(i+" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] array = new int[3];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < array.length; i++) {
//            array[i] = sc.nextInt();
//        }
//        printArray(array);
//    }
//    public static void giveNum(int[] array) {
//        int j = 1;
//        for (int i = 0; i < array.length; i++) {
//            array[i] =j++;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] array = new int[100];
//        giveNum(array);
//        for (int i : array) {
//            System.out.println(i);
//        }
//    }

    //找出数组重复数字
//    public static void findSameNum(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    System.out.println("数组中有重复的数字是："+array[i]);
//                    break;
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] array = new int[10];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < array.length; i++) {
//            array[i] = sc.nextInt();
//        }
//        findSameNum(array);
//    }

    //斐波那契输列 迭代
//    public static int fib(int num) {
//        int a = 1;
//        int b = 1;
//        int ret = 0;
//        for (int i = 3; i <= num; i++) {
//            ret = a + b;
//            a = b;
//            b = ret;
//        }
//        return ret;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("输入想求的斐波那契的第几位：");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println("第" + num + "位的值是：" + fib(num));
//    }


//    public static int jieCheng(int num) {
//        int sum = 0;
//        int ret = 0;
//        for () {
//            for (int i = 1; i <= num; i++) {
//                ret *= i;
//            }
//        }
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
   //     System.out.println(jieCheng(num));
    }
}
