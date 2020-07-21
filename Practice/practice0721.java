package JavaStudy.Practice;

import java.util.*;

/**
 * @Author Meng Xin
 * @Date 2020/7/21 7:36
 */
public class practice0721 {
    public static void func(int[] array) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            a ^= array[i];
        }
        int c = a & (~a + 1);
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & c) != 0)
                b ^= array[i];
        }
        int[] array1 = new int[2];
        array1[0] = b;
        array1[1] = a ^ b;
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }

    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        func(array);
    }

    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        int[] left = new int[len];
        int[] right = new int[len];
        Arrays.fill(right, -1);
        Arrays.fill(left, -1);
        method(len, left, right, arr);
        for (int i = 0; i < len; i++) {
            System.out.printf("%d %d\n", left[i], right[i]);
        }
    }

    public static void method(int len, int[] left, int[] right, int[] arr) {
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                right[stack.pop()] = i;
            }
            int top = stack.isEmpty() ? -1 : stack.peek();
            if (stack.isEmpty()) {
            } else if (arr[stack.peek()] != arr[i]) {
                left[i] = top;
            } else {
                left[i] = left[top];
            }
            stack.push(i);
        }
    }

    public static void func(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] s = str.split("_");
        for (int i = 0; i < s.length; i++) {
            if (i == 0) {
                stringBuilder.append(s[i]);
            } else {
                stringBuilder.append(s[i].toUpperCase().substring(0, 1));
                stringBuilder.append(s[i].substring(1));
            }
        }
        System.out.println(stringBuilder.toString());
    }

    public static void main3(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            func(str);
        }
    }

    public static void func1(String str) {
        String[] s = str.split(" ");
        for (int i = s.length - 1; i >= 0; i--) {
            if (s[i] != " ") {
                System.out.print(s[i] + " ");
            }
        }
    }

    public static void main5(String[] args) {
        System.out.println(1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            func1(str);
        }
    }

}
