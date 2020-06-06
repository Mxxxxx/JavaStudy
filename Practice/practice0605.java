package JavaStudy.Practice;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-05 09:25
 **/
public class practice0605 {
    public static int func(int n) {
        if (n % 2 == 1) {
            return -1;
        }
        int a = 0;
        int b = 0;
        for (int i = n / 8; i >= 0; i--) {
            if ((n - 8 * i) % 6 == 0) {
                a = i;
                b = (n - 8 * i) / 6;
                break;
            }
        }
        return a + b;
    }

    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            System.out.println(func(n));
        }
    }

    public static String func(String str1, String str2) {
        StringBuilder stringBuilder1 = new StringBuilder();
        String[] a = str1.split("");
        for (int i = 0; i < a.length; i++) {
            if (!str2.contains(a[i])) {
                stringBuilder1.append(a[i]);
            }
        }
        return stringBuilder1.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = null;
        String str2 = null;
        while (in.hasNext()) {
            str1 = in.nextLine();
            str2 = in.nextLine();
            System.out.println(func(str1, str2));
        }
    }
}
