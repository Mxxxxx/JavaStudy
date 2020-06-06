package JavaStudy.Practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-03 15:35
 **/
public class practice0603 {
    //输出最长的数字串


    //判断括号字符串
    public static boolean chkParenthesis(String A, int n) {
        if (n == 0) {
            return false;
        }
        int l = 0;
        for (int i = 0; i < n; i++) {
            char ch = A.charAt(i);
            if (ch == '(') {
                l++;
            } else if (ch == ')') {
                if (l > 0) {
                    l--;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return l == 0;
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String ressult = "";
        int count = 0;
        char[] arr = string.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if ('0' <= arr[i] && '9' >= arr[i]) {//当前的是数字
                count = 1;//初始化计算器
                int index = i;//在后面的循环存储截至索引
                for (int j = i + 1; j < arr.length; j++) {
                    if ('0' <= arr[j] && '9' >= arr[j]) {
                        count++;
                        index = j;
                    } else {
                        break;
                    }
                }
                if (count > ressult.length()) {
                    ressult = string.substring(i, index + 1);
                }
            } else {
                continue;
            }

        }
        System.out.println(ressult);
    }

    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();
        while (in.hasNext()) {
            hashSet.add(in.next());
        }
        int num = hashSet.size();
        System.out.println(hashSet.size());
    }

    public static int fib(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        } else return fib(num - 1) + fib(num - 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int left = 0;
        int right = 0;
        while (in.hasNextInt()) {
            int num = in.nextInt();
            while (true) {
                if (fib(n) < num) {
                    left = num - fib(n);
                } else {
                    right = fib(n) - num;
                    break;
                }
                n++;
            }
            if (left < right) {
                System.out.println(left);
            } else {
                System.out.println(right);
            }
        }
    }
}
