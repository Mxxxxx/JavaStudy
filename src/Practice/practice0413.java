package Practice;

import java.util.Scanner;
public class practice0413 {
// n的阶乘递归
    /* public static int fac(int num){
         if (num==1){
             return 1;
         }
         return num*fac(num-1);
     }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         System.out.println(fac(num));
     }
 }



    //      递归打印数字123. 打出1 2 3
 /*   public static void print(int num) {
        if (num > 9) {
            print(num / 10);
        }
        System.out.println(num % 10);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        print(num);
    }
}*/

    //递归求 1 + 2 + 3 + ... + 10
   /* public static int sum(int num) {
        if (num == 1) {
            return 1;
        }
        return num+sum(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
*/

    //输入一个非负整数，返回组成它的数字之和
  /*  public static int sum(int num) {
        if (num<10){
            return num;
        }
        return num%10+sum(num/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));
    }*/

    //青蛙跳台阶问题
//    public static int fog(int num) {
//        if (num == 0) {
//            return 0;
//        }
//        if (num == 1) {
//            return 1;
//        }else if (num==2){
//            return 2;
//        }
//        return fog(num - 1) + fog(num - 2);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println("青蛙跳上" + num + "个台阶，共有的方法是：");
//        System.out.println(fog(num));
//    }
}


