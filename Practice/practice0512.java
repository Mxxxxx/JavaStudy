package JavaStudy.Practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-12 15:04
 **/
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};

public class practice0512 {
    //给定一个保存员工信息的数据结构，它包含了员工唯一的id，重要度 和 直系下属的id。
    //
    //比如，员工1是员工2的领导，员工2是员工3的领导。他们相应的重要度为15, 10, 5。那么员工1的数据结构是[1, 15, [2]]，员工2的数据结构是[2, 10, [3]]，员工3的数据结构是[3, 5, []]。注意虽然员工3也是员工1的一个下属，但是由于并不是直系下属，因此没有体现在员工1的数据结构中。
    //
    //现在输入一个公司的所有员工信息，以及单个员工id，返回这个员工和他所有下属的重要度之和。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/employee-importance
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public int getImportance(List<Employee> employees, int id) {
        if (employees.size() == 0) {
            return 0;
        }
        for (Employee e : employees) {
            if (e.id == id) {
                if (e.subordinates.size() == 0) {
                    return e.importance;
                }
                for (int subId : e.subordinates) {
                    e.importance += getImportance(employees, subId);//使用递归
                }
                return e.importance;
            }

        }
        return 0;
    }


    //在一个小镇里，按从 1 到 N 标记了 N 个人。传言称，这些人中有一个是小镇上的秘密法官。
    //
    //如果小镇的法官真的存在，那么：
    //
    //小镇的法官不相信任何人。
    //每个人（除了小镇法官外）都信任小镇的法官。
    //只有一个人同时满足属性 1 和属性 2 。
    //给定数组 trust，该数组由信任对 trust[i] = [a, b] 组成，表示标记为 a 的人信任标记为 b 的人。
    //
    //如果小镇存在秘密法官并且可以确定他的身份，请返回该法官的标记。否则，返回 -1。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/find-the-town-judge
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    /*public int findJudge(int N, int[][] trust) {
        List<Integer> list = new ArrayList<>();
        if (N == 1) {
            return 1;
        }
        for (int i = 0; i < trust.length; i++) {
            list.add(trust[i][]);
        }


    }*/

    //给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
    //
    //形式上，如果可以找出索引 i+1 < j 且满足 (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1]) 就可以将数组三等分。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        boolean a = false;
        boolean b = false;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        if (sum % 3 != 0) {
            return false;
        }
        int tmp = 0;
        int tmp1 = 0;
        int sum1 = sum / 3;

        int i = 0;
        for (; i < A.length; i++) {
            tmp += A[i];
            if (tmp == sum1) {
                a = true;
                break;
            }
        }
        for (i = i + 1; i < A.length; i++) {
            tmp1 += A[i];
            if (tmp1 == sum1) {
                b = true;
                break;
            }
        }
        return a && b && i < A.length - 1;
    }

    //给你一个 m 行 n 列的二维网格 grid 和一个整数 k。你需要将 grid 迁移 k 次。
    //
    //每次「迁移」操作将会引发下述活动：
    //
    //位于 grid[i][j] 的元素将会移动到 grid[i][j + 1]。
    //位于 grid[i][n - 1] 的元素将会移动到 grid[i + 1][0]。
    //位于 grid[m - 1][n - 1] 的元素将会移动到 grid[0][0]。
    //请你返回 k 次迁移操作后最终得到的 二维网格。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/shift-2d-grid
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
   /* public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        for (int i = 0; i < k; i++) {


        }
        return
    }*/

}
