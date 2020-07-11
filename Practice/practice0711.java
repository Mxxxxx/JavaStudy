package JavaStudy.Practice;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Author Meng Xin
 * @Date 2020/7/11 9:24
 */
public class practice0711 {
    public static void main(String[] args) {
        System.out.print(10 * 30);

        int a = 0;
        for (long i = 0; i < 30; i++) {
            a = (int) (a + Math.pow(2, i));
        }
        System.out.print(" " + a);
    }
}
