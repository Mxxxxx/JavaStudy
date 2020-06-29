package JavaStudy.Practice;

import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-29 08:10
 **/
public class practice0629 {
    private static double func2(int[] classScore, int[] realScore) {
        double sum = 0;
        double a = 0;
        int b = 0;
        for (int i = 0; i < realScore.length; i++) {
            if (realScore[i] >= 90 && realScore[i] <= 100) {
                a = 4.0;
            } else if (realScore[i] >= 85 && realScore[i] <= 89) {
                a = 3.7;
            } else if (realScore[i] >= 82 && realScore[i] <= 84) {
                a = 3.3;
            } else if (realScore[i] >= 78 && realScore[i] <= 81) {
                a = 3.0;
            } else if (realScore[i] >= 75 && realScore[i] <= 77) {
                a = 2.7;
            } else if (realScore[i] >= 72 && realScore[i] <= 74) {
                a = 2.3;
            } else if (realScore[i] >= 68 && realScore[i] <= 71) {
                a = 2.0;
            } else if (realScore[i] >= 64 && realScore[i] <= 67) {
                a = 1.5;
            } else if (realScore[i] >= 60 && realScore[i] <= 63) {
                a = 1.0;
            } else if (realScore[i] < 60) {
                a = 0.0;
            }
            b += classScore[i];
            sum += a * classScore[i];
        }
        return sum / b;
    }

    public static double func1(int classNum, int[] classScore, int[] realScore) {
        double sum = func2(classScore, realScore);
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int classNum = in.nextInt();
        int[] classScore = new int[classNum];
        for (int i = 0; i < classNum; i++) {
            classScore[i] = in.nextInt();
        }
        int[] realScore = new int[classNum];
        for (int i = 0; i < classNum; i++) {
            realScore[i] = in.nextInt();
        }
        double a = func1(classNum, classScore, realScore);
        System.out.printf("%.2f", a);
    }
}
