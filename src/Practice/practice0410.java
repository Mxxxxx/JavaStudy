package JavaStudy.Practice;


import java.util.Scanner;

public class practice0410 {
    public static void main(String[] args) {

//   判断年龄
//        System.out.println("输入你的年龄");
//        Scanner sc = new Scanner(System.in);
//        int year=sc.nextInt();
//        if (year<=18){
//            System.out.println("少年");
//        }else if (year>18&&year<=28){
//            System.out.println("青年");
//        }else if (year>28&&year<=55){
//            System.out.println("中年");
//        }else if (year>55){
//            System.out.println("老年");
//        }

        //判断素数
//        System.out.println("输入一个数字");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int flg = 0;
//        for (int i = 2; i < num - 1; i++) {
//            if (num % i == 0) {
//                System.out.println("不是素数");
//                flg = 1;
//                break;
//            }
//        }
//        if (flg == 0) {
//            System.out.println("是素数");
//        }


//   打印1~100间所有素数
//        int flg = 0;
//        int j = 2;
//        for (int i = 2; i <= 100; i++) {
//            while (i % j == 0 && j <= i - 1) {
//                flg = 1;
//                j++;
//            }
//            if (flg == 0) {
//                System.out.println(i);
//            }
//        }


        //输出闰年        for (int i = 1000; i <= 2000; i++) {
        ////            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
        ////                System.out.println(i+"是闰年");
        ////            }
        ////        }
//


        //乘法口诀表
//        System.out.println("输入要打印的行:");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for (int i = 1; i <= num; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.printf("%d*%d=%-2d ",i,j,i*j);
//            }
//            System.out.printf("\n");
//        }


        //计算公约数
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = 0;
//        while (a % b != 0) {
//            c = a % b;
//            a = b;
//            b = c;
//        }
//        System.out.println(c);


        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
//        double sum = 0.0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 != 0) {
//                sum += (double) 1 / i;
//            } else if (i % 2 == 0) {
//                sum -= (double) 1 / i;
//            }
//        }
//        System.out.println(sum);


//. 编写程序数一下 1到 100 的所有整数中出现多少个数字9
//        int count = 11;
//        for (int i = 1; i < 90; i++) {
//            if (i % 10 == 9) {
//                count++;
//            }
//        }
//        System.out.println(count);

//求出0～999之间的所有“水仙花数”并输出。
// (“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数”。)

//        for (int i = 100; i <= 999; i++) {
//            boolean flg = true;
//            int tmp=i;
//            int sum = 0;
//            while (flg) {
//                sum += (tmp % 10) * (tmp % 10) * (tmp % 10);
//                tmp = tmp / 10;
//                if (tmp == 0) {
//                    flg = false;
//                }
//            }
//            if (i == sum) {
//                System.out.println(i);
//            }
//        }


//        int count = 3;
//        while (count != 0) {
//            System.out.println("输入密码：");
//            Scanner sc = new Scanner(System.in);
//            String password = sc.nextLine();
//            if (password.equals("123456")){
//                System.out.println("密码正确");
//                break;
//            }else {
//                count--;
//                System.out.println("密码错误，还可以输入"+count+"次");
//
//            }
//        }

        System.out.println("输入一个数字:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num % 10 != 0) {
            System.out.println(num % 10);
            num = num / 10;
        }


//        System.out.println("输入一个数字:");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println("偶数：");
//        for (int i = 0; i < 32; i += 2) {
//            System.out.print((num >> i) & 1);
//        }
//        System.out.printf("\n");
//        System.out.println("奇数：");
//        for (int i = 1; i < 32; i += 2) {
//            System.out.print((num >> i) & 1);
//        }

//        System.out.println("输入一个数字:");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int count=0;
//        while(num!=0){
//            if((num&1)==1){
//                count++;
//            }
//            num=num>>1;
//        }
//        System.out.println(num);
    }
}