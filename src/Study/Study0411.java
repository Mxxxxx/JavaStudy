package basic.JavaStudy.src.basic;

import java.util.Random;
import java.util.Scanner;

public class Study0411 {
    public static void main(String[] args) {
//        for (int num = 100; num <= 200; num++) {
//            if (num % 15 == 0) {
//                System.out.println(num);
////                break;
//                continue;  //不执行下面的
//            }
//            System.out.println("*****");
//        }

//        for (byte i = 120; i < 130; i++) {
//            System.out.println(i);
//        }


//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= num; i++) {
//            int ret = 1;
//            for (int j = 1; j <= i; j++) {
//                ret *= j;
//            }
//            sum += ret;
//        }
//        System.out.println(sum);

//猜数字
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randNum = random.nextInt(100);  //[0,100)
        while (true) {
            System.out.println("猜测一个数字：");
            int num = sc.nextInt();
            if (num>randNum){
                System.out.println("输入数字过大");
            }else if (num<randNum){
                System.out.println("输入数字过小");
            }else {
                System.out.println("猜对了");
                break;
            }
        }
        sc.close();
    }
}
