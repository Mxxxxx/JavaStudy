package JavaStudy.Practice;

import java.util.HashMap;

/**
 * @Author Meng Xin
 * @Date 2020/7/14 7:27
 */
public class practice0714 {
    public int getLCA(int a, int b) {
        while (a != b) {
            if (a > b)
                a /= 2;
            else
                b /= 2;
        }
        return a;
    }

    public static String replaceSpace(String iniString, int length) {
        String replace = iniString.replace(" ", "%20");
        return replace;
    }

    public static void main(String[] args) {
        String a = "a b c";
        System.out.println(replaceSpace(a, a.length()));
        
    }
}
