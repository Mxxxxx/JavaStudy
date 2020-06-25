package JavaStudy.Practice;

import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-24 07:43
 **/
public class practice0624 {
    public static int func(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return func(num - 1) + func(num - 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(func(num));

    }

}
