package JavaStudy.Practice;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-16 07:40
 **/
public class practice0616 {
    public static void main1(String[] args) {
        //读取输入
        Scanner sc = new Scanner(System.in);
        //存放数字出现的次数
        int[] numbers = new int[10];
        //赋值
        for (int x = 0; x < 10; x++) {
            numbers[x] = sc.nextInt();
        }
        //寻找除0外个数不为零的最小数字 跳过0的个数
        for (int x = 1; x < numbers.length; x++) {
            if (numbers[x] != 0) {
                //仅仅输出一次即可 将其作为最大位上的数字
                System.out.print(x);
                numbers[x]--;
                //输出一次后跳出循环
                break;
            }
        }
        //此时按照数字大小和出现次数打印结果
        for (int x = 0; x < numbers.length; x++) {
            //出现次数
            for (int y = 0; y < numbers[x]; y++) {
                System.out.print(x);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            StringBuilder stringBuilder = new StringBuilder();
            int num = sc.nextInt();
            int n = num * (num - 1) + 1;
            for (int i = 0; i < num; i++) {
                if (i == num - 1) {
//                System.out.print(n);
                    stringBuilder.append(n);
                    break;
                }
                stringBuilder.append(n);
                stringBuilder.append("+");
                n += 2;
            }
            System.out.println(stringBuilder.toString());
        }
    }
}