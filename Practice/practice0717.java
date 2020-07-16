package JavaStudy.Practice;

import java.util.Scanner;

/**
 * @Author Meng Xin
 * @Date 2020/7/17 7:29
 */
public class practice0717 {
    public static int funnc(int[] array, int num) {
        if (array == null) {
            return 0;
        }
        if (num == 1) {
            return array[0];
        }
        int sum = array[0];
        int tmo = 0;
        for (int i = 0; i < num; i++) {
            tmo = array[i];
            for (int j = i + 1; j < num; j++) {
                tmo += array[j];
                if (sum < tmo) {
                    sum = tmo;
                }
            }
        }
        return sum;
    }

    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num == 0) {
            return;
        }
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(funnc(array, num));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            //以 “；”为界分割字符串
            String[] strings = str.split(";");
            int x = 0, y = 0;
            for (String string : strings) {
                if (string.length() > 0) {
                    char char1 = string.charAt(0);
                    //判断输入的第一个字母是否为 W S  A D
                    if (char1 != 'W' && char1 != 'S' && char1 != 'A' && char1 != 'D') {
                        continue;
                    }
                    String str2 = string.substring(1, string.length());//字母的后面部分
                    char[] chars2 = str2.toCharArray();

                    boolean judge = true;
                    //判断除首字母外的是否为数字
                    for (char aChars2 : chars2) {
                        if (aChars2 < 48 || aChars2 > 57) {
                            judge = false;
                        }
                    }
                    if (!judge) {
                        continue;
                    }
                    //判断命令
                    switch (char1) {
                        case 'W':
                            y += Integer.parseInt(str2);
                            break;
                        case 'S':
                            y -= Integer.parseInt(str2);
                            break;
                        case 'A':
                            x -= Integer.parseInt(str2);
                            break;
                        case 'D':
                            x += Integer.parseInt(str2);
                            break;
                        default:
                            break;
                    }
                }
            }
            System.out.println(x + "," + y);
        }
    }
}
