package JavaStudy.Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Author Meng Xin
 * @Date 2020/7/24 7:29
 */
public class practice0724 {


    /* public static int func(int n, int[] power, int k, int d) {
         if (n <= d) {
             Arrays.sort(power);
         }
         int i = power.length - 1;
         int sum = 1;
         while (k > 0) {
             sum *= power[i];
             i--;
             k--;
         }
         return sum;
     }

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int[] power = new int[n];
         for (int i = 0; i < n; i++) {
             power[i] = in.nextInt();
         }
         int k = in.nextInt();
         int d = in.nextInt();
         System.out.println(func(n, power, k, d));
     }*/
    static class People {
        int height;
        int weight;

        public People(int weight, int height) {
            this.height = height;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            People[] array = new People[n];
            for (int i = 0; i < n; ++i) {
                int index = scan.nextInt();
                array[index - 1] = new People(scan.nextInt(), scan.nextInt());
            }

            Arrays.sort(array, new Comparator<People>() {
                public int compare(People p1, People p2) {
                    int result = Integer.compare(p1.height, p2.height);
                    if (result != 0)
                        return result;
                    else
                        return Integer.compare(p1.weight, p2.weight);
                }
            });

            int[] dp = new int[n];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < dp.length; ++i) {
                dp[i] = 1;
                for (int j = i - 1; j >= 0; --j) {
                    if (array[i].weight > array[j].weight
                            || (array[i].weight == array[j].weight && array[i].height == array[j].height)) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
                max = Math.max(dp[i], max);
            }
            System.out.println(max);
        }
    }

    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            num[i] = in.nextInt();
        }
        int K = in.nextInt();
        int D = in.nextInt();
        long[][] dpm = new long[K + 1][n + 1];//dpm[i][j]表示选中了i个人，以第j个人结尾的能力最大乘积
        long[][] dpn = new long[K + 1][n + 1];//dpn[i][j]表示选中了i个人，以第j个人结尾的能力最小乘积
        for (int j = 1; j < n + 1; j++) {//初始
            dpm[1][j] = num[j];
            dpn[1][j] = num[j];
        }
        for (int i = 1; i < K + 1; i++) {//初始
            dpm[i][1] = num[1];
            dpn[i][1] = num[1];
        }
        for (int i = 2; i < K + 1; i++) {
            for (int j = 2; j < n + 1; j++) {
                for (int k = Math.max(1, j - D); k < j; k++) {
                    dpm[i][j] = Math.max(dpm[i][j], Math.max(dpm[i - 1][k] * num[j], dpn[i - 1][k] * num[j]));
                    dpn[i][j] = Math.min(dpn[i][j], Math.min(dpm[i - 1][k] * num[j], dpn[i - 1][k] * num[j]));
                }
            }
        }
        long max = Math.max(dpm[K][1], dpn[K][1]);
        for (int j = 2; j < n + 1; j++) {
            max = Math.max(Math.max(dpm[K][j], dpn[K][j]), max);
        }
        System.out.println(max);
    }

}
