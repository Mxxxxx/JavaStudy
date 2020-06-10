package JavaStudy.Practice;

import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-10 08:27
 **/
public class practice0610 {
    public static int func(int num) {
        if (num == 1) {
            return 1;
        }
        return num * func(num - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        while (in.hasNextInt()) {
        int num = in.nextInt();
        int n = func(num);
        if (n >= 1 && n <= 1000) {
            int count = 0;
            while (n % 10 == 0) {
                count++;
                n = n / 10;
            }
            System.out.println(count);
        }
    }


    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        StringBuilder stringBuilder = new StringBuilder(num);
        stringBuilder.reverse();

        System.out.println(stringBuilder.toString());
    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            n /= 5;
            cnt += n;
        }
        System.out.println(cnt);
    }
}
