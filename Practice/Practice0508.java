package JavaStudy.Practice;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;

/**
 * @program: Java
 * @description: 字符串
 * @author: Mx
 * @create: 2020-05-08 13:59
 **/
public class Practice0508 {
    //字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
// 请定义一个函数实现字符串左旋转操作的功能。
// 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof
    public String reverseLeftWords(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static String reverseLeftWords1(String s, int n) {
        reverseWords(s, 0, n - 1);
        reverseWords(s, n, s.length() - 1);
        s = reverseWords(s, 0, s.length() - 1);
        return s;
    }

    //不用任何字符串库函数实现无冗余地接受两个字符串，然后把它们无冗余的连接起来。
    public static String func(String str) {
        String[] str1 = str.split(" ");
        String ret = "";
        for (int i = 0; i < str1.length; i++) {
            ret += str1[i];
        }
        return ret;
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String ret = func(s);
            System.out.println(ret);
        }
    }

    //将字符串逆置
    public static String reverseWords(String s, int begin, int end) {
        char[] ch = s.toCharArray();
        while (begin < end) {
            char tmp = ch[begin];
            ch[begin] = ch[end];
            ch[end] = tmp;
            begin++;
            end--;
        }

        return String.copyValueOf(ch);
    }

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(reverseLeftWords1(s, 2));
    }
}
