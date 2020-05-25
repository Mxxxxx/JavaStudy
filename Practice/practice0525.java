package JavaStudy.Practice;

import java.util.*;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-25 10:33
 **/
public class practice0525 {
    //给定两个以升序排列的整形数组 nums1 和 nums2, 以及一个整数 k。
    //
    //定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自 nums2。
    //
    //找到和最小的 k 对数字 (u1,v1), (u2,v2) ... (uk,vk)。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int n1 = nums1.length, n2 = nums2.length;
        List<List<Integer>> result = new ArrayList<>();


        if (n1 == 0 || n2 == 0 || k == 0) return result;

        int[][] arr = new int[n1 * n2][2];
        int idx = 0;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr[idx][0] = nums1[i];
                arr[idx][1] = nums2[j];
                idx++;
            }
        }

        Arrays.sort(arr, Comparator.comparingInt(o -> (o[0] + o[1])));
        for (int i = 0; i < Math.min(k, arr.length); i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(arr[i][0]);
            temp.add(arr[i][1]);
            result.add(temp);
        }

        return result;
    }

    //有一堆石头，每块石头的重量都是正整数。
    //
    //每一回合，从中选出两块 最重的 石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
    //
    //如果 x == y，那么两块石头都会被完全粉碎；
    //如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
    //最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/last-stone-weight
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        int index = stones.length - 1;//最后一个
        Arrays.sort(stones);//由小到大排序
        while (stones[index - 1] != 0) {
            int x = stones[index];//最重的
            int y = stones[index - 1];//第二重的
            if (x == y) {//两个全都置为0
                stones[index] = 0;
                stones[index - 1] = 0;
            } else {
                stones[index - 1] = stones[index] - stones[index - 1];
                stones[index] = 0;
            }
            Arrays.sort(stones);
        }
        return stones[index];
    }


}
