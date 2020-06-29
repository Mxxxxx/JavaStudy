package JavaStudy.Practice;

import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-28 09:26
 **/
public class practice0628 {
    public static int getGCD(int num1, int num2) {
        // 先获得绝对值，保证负数也可以求
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        // 先求余数，假定第一个数较大；如果第二个较大，在第二轮调用时会颠倒过来
        int remainder = num1 % num2;
        // 如果为 0，则直接得出
        if (remainder == 0) {
            return num2;
        }
        // 递归调用
        return getGCD(num2, remainder);
    }

    public static int func(int nenli, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (nenli >= array[i]) {
                nenli += array[i];
            } else {
                nenli += getGCD(nenli, array[i]);
            }
        }
        return nenli;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
        int num = in.nextInt();
        int nenli = in.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(func(nenli, array));
    }
    }
}
