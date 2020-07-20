package JavaStudy.Practice;

import java.util.*;

/**
 * @Author Meng Xin
 * @Date 2020/7/20 9:42
 */
public class practice0720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        List<Integer> list = new ArrayList<>();
        // 1.首先判断，如果n>m，则n中大于m的数不可能参与组合，此时置n = m;
        int up = n > m ? m : n;

        printList(m, up, list);
    }

    /**
     * @param m    要求满足的和sum
     * @param n    取数的范围scope
     * @param list 每一种满足条件的组合
     */
    public static void printList(int m, int n, List<Integer> list) {
        // m=0时，即背包刚好装满，打印并退出
        if (m == 0) {
            System.out.println(list);
            return;
        }

        // 根据题意，可知m和n必须为正整数，所以m和n为负数，或n=0时，直接退出
        if (n <= 0 || m < 0) {
            return;
        }

        // 拿到上一次计算的结果list
        List<Integer> list1 = new ArrayList<Integer>(list);

        // n没有加入
        printList(m, n - 1, list);

        // n加入
        list1.add(n);
        printList(m - n, n - 1, list1);
    }


    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] map = {"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "22233344455566677778889999"};
        while (sc.hasNext()) {
            int n = sc.nextInt();
            Set<String> set = new TreeSet<>();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i ++ ) {
                char[] ch = sc.next().replace("-", "").toCharArray();
                for (int j = 0; j < ch.length; j ++ ) {
                    if(j == 3) sb.append("-");
                    if(Character.isLetter(ch[j])) sb.append(map[1].charAt(map[0].indexOf(ch[j])));
                    else sb.append(ch[j]);
                }
                set.add(sb.toString());
                sb.delete(0, sb.length());
            }
            for (String s:set)
                System.out.println(s);
            System.out.println();
        }
    }
}
