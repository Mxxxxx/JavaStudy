package JavaStudy.HomeWork;

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

// n的阶乘
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


    ///调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
//    public static void change(int[] array) {
//        int tmp = 0;
//        for (int i = 0; i < array.length; i += 2) {
//            tmp = array[i];
//            array[i] = array[i + 1];
//            array[i + 1] = tmp;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] array = new int[4];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < array.length; i++) {
//            array[i] = sc.nextInt();
//        }
//        change(array);
//        System.out.println(Arrays.toString(array));
//    }


    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
//    public static int max2(int x, int y) {
//        int ret = 0;
//        ret = x + y;
//        return ret;
//    }
//
//    public static int max3(int x, int y, int z) {
//        int ret = 0;
//        ret = max2(x, y) + z;
//        return ret;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int z = sc.nextInt();
//        System.out.println(x+"+"+y+"="+max2(x, y));
//        System.out.println(x+"+"+y+"+"+z+"="+max3(x, y, z));
//    }

    //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，
    // 还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
//    public static int max(int x, int y) {
//        return x > y ? x : y;
//    }
//
//    public static double max(double x, double y) {
//        return x > y ? x : y;
//    }
//
//    public static double max(int x, double y, double z) {
//        return x > max(y, z) ? x : max(y, z);
//
//    }
//
//    public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    int x=sc.nextInt();
//    int i=sc.nextInt();
//    double y=sc.nextDouble();
//    double z=sc.nextDouble();
//        System.out.println("两个整数"+max(x, i));
//        System.out.println("两个小数"+max(y, z));
//        System.out.println("三个数"+max(x, y, z));
//    }

    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
//    public static int sum(int x, int y) {
//        return x + y;
//    }
//
//    public static double sum(double x, double y, double z) {
//        return x + y + z;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int x=sc.nextInt();
//        int y=sc.nextInt();
//        double a=sc.nextDouble();
//        double b=sc.nextDouble();
//        double c=sc.nextDouble();
//        System.out.println(sum(x, y));
//        System.out.println(sum(a, b, c));
//    }

    //递归求斐波那契数列的第 N 项
//    public static int fib(int num) {
//        if (num == 1 || num == 2){
//            return 1;
//        }
//        return fib(num-1)+fib(num-2);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入第几项：");
//        int num = sc.nextInt();
//        System.out.println(fib(num));
//    }

    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
//    public static int sum(int num){
//        if (num<9){
//            return num%9;
//        }
//        return num%10+sum(num/10);
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        System.out.println(sum(num));
//    }

    //求1！+2！+3！+4！+........+n!的和
    public static int sum(int num){
        int ret=1;
        int sum=0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                ret*=j;
            }
            sum+=ret;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(sum(num));
    }
}
