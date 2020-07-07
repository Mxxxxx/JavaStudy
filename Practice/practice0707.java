package JavaStudy.Practice;

import java.util.Scanner;

/**
 * @Author Meng Xin
 * @Date 2020/7/7 7:27
 */
public class practice0707 {

    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String needPayStr = scan.next();
            String actualPayStr = scan.next();
            String[] needStrArr = needPayStr.split("[.]");
            String[] actualStrArr = actualPayStr.split("[.]");
            int needPay = Integer.parseInt(needStrArr[0]) * 17 * 29 + Integer.parseInt(needStrArr[1]) * 29 + Integer.parseInt(needStrArr[2]);
            int actualPay = Integer.parseInt(actualStrArr[0]) * 17 * 29 + Integer.parseInt(actualStrArr[1]) * 29 + Integer.parseInt(actualStrArr[2]);
            int surplus = actualPay - needPay;
            if (surplus < 0) {
                System.out.print("-");
                surplus = 0 - surplus;
            }
            int knut = surplus % 29;
            int sickle = (surplus / 29) % 17;
            int galleon = (surplus / 29) / 17;
            System.out.println(galleon + "." + sickle + "." + knut);
        }
    }

    public static int countNumberOf2s(int n) {
        // write code here
        int count = 0;
        for (int i = 0; i <= n; i++) {
            String s = Integer.toString(i);//Integer.toString()，返回一个 String指定整数的 String对象
            for (char ch : s.toCharArray()) {
                if (ch == '2') {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while (input.hasNext()) {
            System.out.println(countNumberOf2s(n));
        }
    }

}
