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

    public static void main2(String[] args) {
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

    //哦，不！你不小心把一个长篇文章中的空格、标点都删掉了，并且大写也弄成了小写。
    // 像句子"I reset the computer. It still didn’t boot!"已经变成了"iresetthecomputeritstilldidntboot"。
    // 在处理标点符号和大小写之前，你得先把它断成词语。当然了，你有一本厚厚的词典dictionary，不过，有些词没在词典里。
    // 假设文章用sentence表示，设计一个算法，把文章断开，要求未识别的字符最少，返回未识别的字符数。
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/re-space-lcci
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


}
