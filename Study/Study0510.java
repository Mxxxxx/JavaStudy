package JavaStudy.Study;

import java.util.Scanner;

/**
 * @program: Java
 * @description:异常 1.运行时异常（非受查异常）  在运行时抛出的异常
 * 2.编译时异常（受查异常）    在编译时的异常
 * <p>
 * 处理异常方法
 * try{
 * //存放可能出现异常的代码
 * }catch（参数：异常的类型  参数）{
 * <p>
 * }
 * <p>
 * 注意：1.catch一定要捕获抛出的异常，如果抛出的异常不能被捕获，那么就会交给JVM，程序就会终止
 * @author: Mx
 * @create: 2020-05-10 08:51
 **/
public class Study0510 {


    public static void main(String[] args) {

    }

    public static int func1() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[4]); //异常
            System.out.println("4");//不会被执行
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(); //打印栈的追踪信息
            System.out.println("数组越界异常");
            return 1;//不建议出现return
        } finally {
            return 2;
        }
    }


    //抛出异常
    //throw 一般抛出你想抛出的异常（自定义异常）
    public static void main3(String[] args) {
        int x = 0;
        if (x == 0) {
            throw new UnsupportedOperationException("x==0");
        }
    }

    public static void main2(String[] args) {
        //System.out.println(func1());
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            System.out.println(10 / n);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

    public static void main1(String[] args) {

        int[] array = {1, 2, 3};
        try {
            System.out.println("2");
            System.out.println(array[4]); //异常
            System.out.println("4");//不会被执行
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(); //打印栈的追踪信息
            System.out.println("数组越界异常");
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } finally {
            System.out.println("finally块的代码肯定永远会被执行"); //善后工作:关闭资源
            System.out.println("和萨");
        }


        System.out.println("hello");
    }
}
