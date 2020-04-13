import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

import java.util.Scanner;

//idea自动创建类注释
public class demo01 {
    //方法
    /*
    因为main是public static所以方法就要写
    采用小驼峰的形式

    public static 返回值 方法名（形参）{
           方法体
    }



    //方法重载
     /*
     1.方法名相同
     2.返回值不要求
     3.参数列表不同（参数个数，参数类型不同）
     4.必须在同一个类中
     重载 和 重写 的区别
      */

    public static void main7(String[] args) {

    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static int sum(int x, int y, int z) {
        return x + y + z;
    }

    public static double sum(int x, int y, int z, int o) {
        return x + y + z + o;
    }

    //    public static int maxNum(int num1, int num2) {
//        return num1 > num2 ? num1 : num2;
//    }
//
//    public static int maxThreeNum(int num1, int num2, int num3) {
//        return maxNum(maxNum(num1, num2), num3);
//    }
//
//    public static int sum(int a, int b) {
//        return a + b;
//    }
    public static int factor(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int ret = 1;
            for (int j = 1; j <= i; j++) {
                ret *= j;
            }
            sum += ret;
        }
        return sum;
    }

    public static void swap(int x, int y) {
        int tmp = x;
        x = y;
        y = tmp;
    }

    public static void main6(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
    }


    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
    }

//    public static void main4(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//        int ret = maxThreeNum(num1, num2, num3);
//        System.out.println(ret);
//    }


    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 31; i >= 1; i -= 2) {
            System.out.print(((num >> i) & 1) + " ");
        }
        System.out.println();
        for (int i = 30; i >= 0; i -= 2) {
            System.out.print(((num >> i) & 1) + " ");
        }
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            num = num & (num - 1);
            count++;
        }
        System.out.println(count);
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //0000 1111   15
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> i;
        }
        System.out.println("结果：" + count);
    }

    //递归 n的阶乘
    public static int fac(int num){
        int ret=0;
        if (num==0){
             return 1;
        }
        return num*fac(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fac(num));
    }
}


