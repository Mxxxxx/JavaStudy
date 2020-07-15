package JavaStudy.Practice;

import java.util.Scanner;

/**
 * @Author Meng Xin
 * @Date 2020/7/15 10:14
 */
public class practice0715 {
    public static int[] arrayPrint(int[][] arr, int n) {
        int x = 0;
        int y = n - 1;
        int[] array = new int[arr.length * arr[0].length];
        while (x != n) {
            for (int i = x, j = y, a = 0; i <= n - 1 && j <= n - 1; i++, y++, a++) {
                array[a] = arr[i][j];
            }
            if (y > 0) {
                y--;
            } else {
                x++;
            }
        }
        return array;
    }

    private static final int[][] DATA = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main1(String[] args) {
        System.out.println(arrayPrint(DATA, 4).toString());
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            int i = 0;//左指针
            int j = str.length() - 1;//右指针
            int flag = 0;
            while (i <= j) {
                if (str.charAt(i) != str.charAt(j)) {
                    if (str.charAt(i) == str.charAt(j - 1) && i <= j - 1) {
                        flag++;
                        j--;
                    } else if (str.charAt(i + 1) == str.charAt(j) && i + 1 <= j) {
                        flag++;
                        i++;
                    } else {
                        flag = flag + 2;
                        break;
                    }
                } else {
                    i++;
                    j--;
                }
            }
            if (flag < 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
