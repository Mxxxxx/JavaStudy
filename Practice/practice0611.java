package JavaStudy.Practice;

import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-11 14:11
 **/
public class practice0611 {
    //判断成为斐波那契数的最小步数
    public static int fib(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return fib(num - 1) + fib(num - 2);
    }

    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int left = 0;
        int right = 0;
        int i = 0;
        while (true) {
            left = fib(i++);
            right = fib(i);
            if (num >= left && num <= right) {
                break;
            }
        }
        int ret = num - left > right - num ? right - num : num - left;
        System.out.println(ret);
    }

    //XxY网格，机器人走路
    public static int countWays(int x, int y) {
//        if (x + y > 12) {
//            return -1;
//        }
        if (x == 1 || y == 1) {
            return 1;
        }
        return countWays(x - 1, y) + countWays(x, y - 1);
    }
}
