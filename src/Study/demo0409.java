package basic.JavaStudy.src.basic;

import java.util.Scanner;

public class demo0409 {
    public static void main(String[] args) {

//        System.out.println("输入数字:");
//
//        Scanner scan=new Scanner(System.in);
//        int a=scan.nextInt();
//
//        System.out.println(a);
//        int a=10;
//        if (a==10)   //只能是布尔表达式
//        {
//            System.out.println(a);
//        }

//        System.out.println("输入数字:");
//        Scanner scan = new Scanner(System.in);
//        while (scan.hasNextInt()){
//            int year = scan.nextInt();
//            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//                System.out.println("是闰年");
//            }else {
//                System.out.println("不是闰年");
//            }
//        }

//        int a=1;
//        switch (a){
//            case 1:
//                System.out.println("fd");
//                break;
//        }

//        int a=0;
//        while (a<=10){
//            System.out.println(a);
//            a++;
//        }


        //Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();

        int num = 5;
        int sum = 0;
        while (num >= 1) {
            int ret = 1;
            int n = 1;
            while (n <= num) {
                ret *= n;
                n++;
            }
            sum += ret;
            num--;
        }
        System.out.println(sum);
    }
}
