package JavaStudy.HomeWork;

import java.util.Arrays;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-04-19 14:47
 **/
public class homework0419 {
    public static void func(int[] array1, int[] array2) {
        int tmp = 0;
        for (int i = 0; i < array1.length; i++) {
            tmp = array1[i];
            array1[i] = array2[i];
            array2[i] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        func(array1, array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
