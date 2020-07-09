package JavaStudy.Practice;

import java.util.Scanner;

/**
 * @Author Meng Xin
 * @Date 2020/7/9 7:30
 */
public class practice0709 {

    //坏键盘
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine().toUpperCase();
        String str2 = in.nextLine().toUpperCase();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str1.length(); i++) {
            if (!str2.contains(String.valueOf(str1.charAt(i)))) {
                if (!stringBuffer.toString().contains(String.valueOf(str1.charAt(i)))) {
                    stringBuffer.append(str1.charAt(i));
                }
            }
        }
        System.out.println(stringBuffer);
    }

    //输入坐标求半径，体积

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] c = s.split(" ");
            double[] b = new double[6];
            for (int i = 0; i < 6; i++) {              //本题意在考察库函数基本用法
                b[i] = Double.parseDouble(c[i]);
            }
            double r = Math.pow(Math.pow((b[3] - b[0]), 2) + Math.pow((b[4] - b[1]), 2) + Math.pow((b[5] - b[2]), 2), 0.5);
            System.out.printf("%.3f %.3f\n", r, 4 * Math.acos(-1) * r * r * r / 3);
        }     //注意此处输出三位小数的写法，与c相同，此方法比较简单
    }
}
