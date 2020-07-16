package JavaStudy.Practice;

import java.util.Scanner;

/**
 * @Author Meng Xin
 * @Date 2020/7/16 7:35
 */
public class practice0716 {
    public static String func(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (!(b.contains(a.charAt(i) + ""))) {
                stringBuilder.append(a.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.println(func(a, b));
    }

    public static void func(String a) {
        String[] s = a.split(" ");
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        char[] chars = {'a', 'b'};
        new String( "utf-8");
        func(a);
    }
}
