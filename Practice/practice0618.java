package JavaStudy.Practice;

import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-18 07:36
 **/
public class practice0618 {
    private static int func(int[] array, int a) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            int tmp = num;
            int[] array = new int[num];
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
            }
            int a = in.nextInt();
            System.out.println(func(array, a));
        }
    }
}
