package JavaStudy.Practice;

import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-07-02 07:19
 **/
public class practice0702 {
    public static void func(int num) {
        int num2 = num * num;
        int num1 = num;
        if (num1 % 10 == 0) {
            System.out.printf("No!");
            return;
        }
        while (num1 % 10 != 0) {
            int num11 = num1 % 10;
            int num22 = num2 % 10;
            if (num11 != num22) {
                System.out.printf("No!");
                return;
            }
            num1 /= 10;
            num2 /= 10;
        }
        System.out.printf("Yes!");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            func(num);
        }
    }
}
