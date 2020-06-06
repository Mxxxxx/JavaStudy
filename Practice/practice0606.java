package JavaStudy.Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-06 13:48
 **/
public class practice0606 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            int num3 = in.nextInt();
            int num4 = in.nextInt();
            int A = (num1 + num3) / 2;
            int B = num3 - A;
            int C = num4 - B;
            if (A - (num1 + num3) / 2 != 0) {
                System.out.println("No");
                return;
            }
            if ((B - ((num3 - num1) / 2) != 0) || (B != ((num2 + num4) / 2))) {
                System.out.print("No");
                return;
            }
            if ((C - ((num4 - num2) / 2)) != 0) {
                System.out.print("No");
                return;
            }
            int[] array = {A, B, C};
            for (int a : array) {
                System.out.print(a + " ");
            }

        }
    }


//    public static void main(String[] args) {
//        List<Integer> list=Arrays.asList(arr);
//        Scanner in = new Scanner(System.in);
//        int i = 0;
//        int a = 1;
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        while (in.hasNextInt()) {
//            i++;
//            int num = in.nextInt();
//            if (!hashMap.containsKey(num)) {
//                hashMap.put(num, a);
//            } else {
//                hashMap.put(num, a++);
//            }
//        }

}
