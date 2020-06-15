package JavaStudy.Practice;

import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-15 09:02
 **/
public class practice0615 {
    public static void func(int num, String c) {
        for (int i = 0; i < Math.ceil((double) num / 2); i++) {
            if (i == 0 || i == Math.ceil((double) num / 2) - 1) {
                for (int j = 0; j < num; j++) {
                    System.out.print(c);
                }
            } else {
                System.out.print(c);
                for (int k = 1; k < num - 1; k++) {
                    System.out.print(" ");
                }
                System.out.print(c);
            }
            if (i == Math.ceil((double) num / 2) - 1) {
                break;
            }
            System.out.println();
        }
    }

    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String c = in.next();
        func(num, c);
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//
//        String c = sc.next();
//
//        for (int i = 1; i <= N; i++) {
//
//            System.out.print(c);
//
//        }
//
//        System.out.println();
//
//        for (int i = 1; i <= Math.ceil((double) N / 2) - 2; i++) {
//
//            System.out.print(c);
//
//            for (int j = 2; j <= N - 1; j++) {
//
//                System.out.print(" ");
//
//            }
//
//            System.out.println(c);
//
//        }
//
//        for (int i = 1; i <= N; i++) {
//
//            System.out.print(c);
//
//        }
//
//    }

    public static String AddLongInteger(String addend, String augend) {
        char[] charsA = new StringBuffer(addend).reverse().toString().toCharArray();
        char[] charsB = new StringBuffer(augend).reverse().toString().toCharArray();

        //2.构建result数组，数组长度等于较大整数位数+1
        int maxLength = charsA.length > charsB.length ? charsA.length : charsB.length;
        int[] result = new int[maxLength + 1];
        //3.遍历数组，按位相加
        for (int i = 0; i < result.length; i++) {
            int temp = result[i];
            if (i < charsA.length) {
                temp += charsA[i] - '0';
            }
            if (i < charsB.length) {
                temp += charsB[i] - '0';
            }

            //判断是否进位
            if (temp >= 10) {
                temp = temp - 10;
                result[i + 1] = 1;
            }
            result[i] = temp;
        }

        //4.把result数组再次逆序并转成String
        StringBuilder sb = new StringBuilder();
        // 判断最后一位是否发生了进位
        int head = result.length - 1;
        if (result[result.length - 1] == 0)
            head = result.length - 2;
        for (int i = head; i >= 0; i--)
            sb.append(result[i]);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        System.out.println(AddLongInteger(num1, num2));
    }
}
