package JavaStudy.Practice;


import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-04-17 15:08
 **/
public class practice0418 {
    /**
     * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号
     * 两个数异或：   相当于每一位相加，而不考虑进位；
     * 两个数相与，并左移一位：  相当于求得进位；
     **/
    /*public static int Add(int num1, int num2) {
        while (num2 != 0) {
            int tmp = num1 ^ num2; //计算个位
            num2 = (num1 & num2) << 1;  //计算十位
            num1 = tmp;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(Add(num1, num2));
    }*/

    /**
     * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
     * 最优解：
     *          while (n != 0) {
     *             count++;
     *             n = n & (n-1);
     *         }
     *         return count;
     *     }
     */
//    public static int NumberOf1(int n) {
//        int count = 0;
//        for (int i = 0; i < 32; i++) {
//            if ((n & 1) == 1) {
//                count++;
//            }
//            n = n >> 1;
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(NumberOf1(-1));
//    }


    /**
     *在一个长度为n的数组里的所有数字都在0到n-1的范围内。
     * 数组中某些数字是重复的，但不知道有几个数字是重复的。
     * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
     * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
     */
//    public boolean duplicate(int numbers[],int length,int [] duplication) {
//        for (int i = 0; i < length-1; i++) {
//            if(numbers[i]==duplication[i])
//        }
//    }
}

