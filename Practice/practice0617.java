package JavaStudy.Practice;

import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-17 21:22
 **/
public class practice0617 {
    public static int addAB(int A, int B) {
        // write code here
        return Math.addExact(A, B);
    }

    public static void main1(String[] args) {
        System.out.println(addAB(1, 2));
    }

    private static int func(int num) {
        if (num == 1000000007) {
            return 0;
        }
        int count = 0;
        while (num != 0 && count < 300000) {
            num = ((num * 2) + 1) % 1000000007;
            count++;
        }
        if (count / 3 > 100000) {
            return -1;
        }
        if (count % 3 == 2) {
            return count / 3 + 1;
        } else {
            return count / 3;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(func(num));
    }
}
