package JavaStudy.Practice;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-07-01 16:19
 **/
public class practice0703 {

    public static int func(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = in.nextInt();
        }
        int x = in.nextInt();
        System.out.println(func(array, x));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ip = scanner.nextLine();
            String ip10 = scanner.nextLine();
            convertToIp10(ip);
            convertToIp(ip10);
        }
    }

    //ip地址转为十进制IP地址
    //1. 按.分割，得到4个字符串 -> 整数
    //2.通过Integer.toBinaryString(Integer.parseInt(s[i])) 得到每个整数对应的二进制序列，如果长度不为8需要自行在前面加0
    //3.组合每个数的二进制序列，然后通过Long.parseLong(sb.toString(), 2)得到此二进制对应的十进制数
    private static void convertToIp10(String ip) {
        String[] s = ip.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            String t = Integer.toBinaryString(Integer.parseInt(s[i])); //整型整数转为二进制
            if (t.length() < 8) { //由于如果高位为0，会缺省，所以需要自行补充高位缺失的0
                int diff = 8 - t.length();
                StringBuilder sx = new StringBuilder();
                for (int j = 0; j < diff; j++) {
                    sx.append("0");
                }
                t = sx.toString() + t;
            }
            sb.append(t);
        }
        long res = Long.parseLong(sb.toString(), 2);
        System.out.println(res);
    }

    //十进制IP地址转为IP地址
    //1.通过Long.toBinaryString(Long.parseLong(ip10))得到此十进制IP地址对应的二进制序列，不足32时需要自行在高位补0
    //2.每隔8个比特位进行划分，共得到4部分
    //3.每部分分别通过Integer.parseInt(four[i], 2)得到对应十进制数，然后用.连接得到最终的IP地址
    private static void convertToIp(String ip10) {
        String bin = Long.toBinaryString(Long.parseLong(ip10)); //长整型整数转为二进制
        if (bin.length() < 32) {
            int diff = 32 - bin.length();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < diff; i++) {
                sb.append("0");
            }
            bin = sb.toString() + bin;
        }
        String[] four = new String[4];
        four[0] = bin.substring(0, 8);  //取得每个部分
        four[1] = bin.substring(8, 16);
        four[2] = bin.substring(16, 24);
        four[3] = bin.substring(24, 32);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            s.append(Integer.parseInt(four[i], 2));
            if (i != 3) {
                s.append(".");
            }
        }
        System.out.println(s.toString());
    }

}
