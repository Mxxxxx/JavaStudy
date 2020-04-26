package JavaStudy.Practice;


import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-04-20 14:11
 **/
public class practice0420 {
    /**一只青蛙一次可以跳上1级台阶，也可以跳上2级。
     *求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
     */
    /*public static int fog(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return fog(n - 1) + fog(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println(fog(target));
    }*/

    /**
     * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
     * <p>
     * 逻辑与有个短路特点，前面为假，后面不计算
     */

    public int Sum_Solution(int n) {
        boolean a = ((n != 0) && (n += Sum_Solution(n - 1)) != 0);
        return n;
    }

    public static void main(String[] args) {
        practice0420 pr=new practice0420();
        System.out.println(pr.Sum_Solution(2));
    }
}
