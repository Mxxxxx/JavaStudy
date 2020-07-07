package JavaStudy.Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author Meng Xin
 * @Date 2020/7/8 7:30
 */
public class practice0708 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //记录A赢时所出手势
        Map<String, Integer> aWin = new HashMap<>(16);
        //记录A赢时所出手势
        Map<String, Integer> bWin = new HashMap<>(16);
        //记录A赢的次数、也是B输的次数
        int win = 0;
        //记录平局的次数
        int equal = 0;
        //记录A输的次数、也是B赢的次数
        int lose = 0;
        //先读入一空行
        sc.nextLine();
        while (number-- != 0) {
            char[] chars = sc.nextLine().replace(" ", "").toCharArray();
            int check = check(chars[0], chars[1]);
            if (check == 1) {
                win++;
                aWin.putIfAbsent(chars[0] + "", 0);
                aWin.put(chars[0] + "", aWin.get(chars[0] + "") + 1);
            } else if (check == -1) {
                lose++;
                bWin.putIfAbsent(chars[1] + "", 0);
                bWin.put(chars[1] + "", bWin.get(chars[1] + "") + 1);
            } else {
                equal++;
            }
        }
        int max = 0;
        String c = "B";
        //按照格式输出
        System.out.printf("%d %d %d\n", win, equal, lose);
        System.out.printf("%d %d %d\n", lose, equal, win);
        //输出获胜次数最多的手势
        for (String key : aWin.keySet()) {
            if (aWin.get(key) > max) {
                max = aWin.get(key);
                c = key;
            }
            if (aWin.get(key) == max) {
                if (key.compareTo(c) < 0) {
                    max = aWin.get(key);
                    c = key;
                }
            }
        }
        System.out.print(c + " ");
        max = 0;
        c = "B";
        for (String key : bWin.keySet()) {
            if (bWin.get(key) > max) {
                max = bWin.get(key);
                c = key;
            }
            if (bWin.get(key) == max) {
                if (key.compareTo(c) < 0) {
                    max = bWin.get(key);
                    c = key;
                }
            }
        }
        System.out.print(c);
    }

    //A赢返回1 平 返回0 A输返回-1
    public static int check(char a, char b) {
        if (a == b) {
            return 0;
        }
        if (a == 'C') {
            if (b == 'J') {
                return 1;
            }
            if (b == 'B') {
                return -1;
            }
        } else if (a == 'J') {
            if (b == 'C') {
                return -1;
            }
            if (b == 'B') {
                return 1;
            }
        } else {
            if (b == 'C') {
                return 1;
            }
            if (b == 'J') {
                return -1;
            }
        }
        return 0;
    }

}
