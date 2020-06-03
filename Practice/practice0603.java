package JavaStudy.Practice;

import java.util.Scanner;
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

    public static void main(String[] args) {
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
}
