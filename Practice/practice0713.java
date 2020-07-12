package JavaStudy.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author Meng Xin
 * @Date 2020/7/13 7:16
 */
public class practice0713 {
    //有一个由很多木棒构成的集合，每个木棒有对应的长度，请问能否用集合中的这些木棒以某个顺序首尾相连构成一个面积大于 0 的简单多边形且所有木棒都要用上，简单多边形即不会自交的多边形。
    //
    //初始集合是空的，有两种操作，要么给集合添加一个长度为 L 的木棒，要么删去集合中已经有的某个木棒。每次操作结束后你都需要告知是否能用集合中的这些木棒构成一个简单多边形。
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int I = in.nextInt();
            int L = in.nextInt();
            if (I == 1) {
                list.add(L);
                sum += L;
            }
            if (I == 2) {
                int i1 = list.indexOf(L);
                list.remove(i1);
                sum -= L;
            }
            list.sort((o1, o2) -> o1 - o2);
            int max = list.get(list.size() - 1);
            if (sum - max > max) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    //小青蛙有一天不小心落入了一个地下迷宫,小青蛙希望用自己仅剩的体力值P跳出这个地下迷宫。
    // 为了让问题简单,假设这是一个n*m的格子迷宫,迷宫每个位置为0或者1,0代表这个位置有障碍物,小青蛙达到不了这个位置;1代表小青蛙可以达到的位置。小青蛙初始在(0,0)位置,地下迷宫的出口在(0,m-1)(保证这两个位置都是1,并且保证一定有起点到终点可达的路径),
    // 小青蛙在迷宫中水平移动一个单位距离需要消耗1点体力值,向上爬一个单位距离需要消耗3个单位的体力值,
    // 向下移动不消耗体力值,当小青蛙的体力值等于0的时候还没有到达出口,小青蛙将无法逃离迷宫。
    // 现在需要你帮助小青蛙计算出能否用仅剩的体力值跳出迷宫(即达到(0,m-1)位置)。

    public static String path = "";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int p = in.nextInt();
        int[][] grid = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = in.nextInt();
            }
        }
        Helper(grid, 0, 0, visited, "", p);
        System.out.println(path);
    }

    public static void Helper(int[][] grid, int i, int j, boolean[][] visited, String res, int p) {
        if (i == 0 && j == grid[0].length - 1 && grid[i][j] == 1) {
            if (p >= 0) {
                path = res + "[" + i + "," + j + "]";
            } else {
                path = "Can not escape!";
            }
            return;
        }
        if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] == 1 && !visited[i][j]) {
            visited[i][j] = true;
            res += "[" + i + "," + j + "],";
            Helper(grid, i, j + 1, visited, res, p - 1);//向右
            Helper(grid, i + 1, j, visited, res, p);//向下
            Helper(grid, i, j - 1, visited, res, p - 1);//向左
            Helper(grid, i - 1, j, visited, res, p - 3);//向上
        }
    }
}
