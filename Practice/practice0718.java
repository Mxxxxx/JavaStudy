package JavaStudy.Practice;

import java.util.Scanner;

/**
 * @Author Meng Xin
 * @Date 2020/7/18 21:38
 */
public class practice0718 {
    public static int getSumDays(int year, int month, int day) {
        int num = 0;
        for (int x = 1; x < month; x++) {
            num += getMonthDays(year, x);
        }
        num += day;
        return num;
    }

    public static int getMonthDays(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }
        }
        return 0;
    }

    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int mouth = in.nextInt();
        int dat = in.nextInt();
        int sum = getSumDays(year, mouth, dat);
        System.out.println(sum);
    }

    public static char encryption(char c) {
        if (c >= 'a' && c < 'z')
            return (char) (c + 1 - 32);
        else if (c == 'z')
            return 'A';
        else if (c >= 'A' && c < 'Z')
            return (char) (c + 1 + 32);
        else if (c == 'Z')
            return 'a';
        else if (c >= '0' && c < '9')
            return (char) (c + 1);
        else if (c == '9')
            return '0';
        else
            return c;
    }

    public static char decryption(char c) {
        if (c > 'a' && c <= 'z')
            return (char) (c - 1 - 32);
        else if (c == 'a')
            return 'Z';
        else if (c > 'A' && c <= 'Z')
            return (char) (c - 1 + 32);
        else if (c == 'A')
            return 'z';
        else if (c > '0' && c <= '9')
            return (char) (c - 1);
        else if (c == '0')
            return '9';
        else
            return c;
    }

    public static String enCryption(String s) {
        char[] cs = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < cs.length; i++) {
            sb.append(encryption(cs[i]));
        }
        return sb.toString();
    }

    public static String deCryption(String s) {
        char[] cs = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < cs.length; i++) {
            sb.append(decryption(cs[i]));
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(enCryption(s1));
            System.out.println(deCryption(s2));
        }
        sc.close();
    }
}
