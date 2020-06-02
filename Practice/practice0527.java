package JavaStudy.Practice;

import JavaStudy.Study.MyArrayList;

import java.util.*;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-27 15:14
 **/
public class practice0527 {
    //比较两个版本号 version1 和 version2。
    //如果 version1 > version2 返回 1，如果 version1 < version2 返回 -1， 除此之外返回 0。
    //
    //你可以假设版本字符串非空，并且只包含数字和 . 字符。
    //
    // . 字符不代表小数点，而是用于分隔数字序列。
    //
    //例如，2.5 不是“两个半”，也不是“差一半到三”，而是第二版中的第五个小版本。
    //
    //你可以假设版本号的每一级的默认修订版号为 0。例如，版本号 3.4 的第一级（大版本）和第二级（小版本）修订号分别为 3 和 4。其第三级和第四级修订号均为 0。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/compare-version-numbers
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public int compareVersion(String version1, String version2) {
        String[] num1 = version1.split("\\.");
        String[] num2 = version2.split("\\.");//将其按 . 一次分开
        for (int i = 0, j = 0; i < num1.length || j < num2.length; i++, j++) {
            //用i,j分别代表第一个和第二个字符串数组元素下标，逐个比较大小。若两数组长度不同
            //较短的在比较完已有的值后，将后面的默认为0继续与长的比较。
            int i1 = i < num1.length ? Integer.parseInt(num1[i]) : 0;//Integer.parseInt()将元素001变为1的方法
            int j1 = j < num2.length ? Integer.parseInt(num2[j]) : 0;
            //得到数组内容开始比较
            if (i1 != j1) {
                return i1 > j1 ? 1 : -1;
            }
        }
        return 0;//相等的情况
    }

    //给定一个排序好的数组，两个整数 k 和 x，从数组中找到最靠近 x（两数之差最小）的 k 个数。
    // 返回的结果必须要是按升序排好的。如果有两个数与 x 的差值一样，优先选择数值较小的那个数。
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/find-k-closest-elements
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if (arr.length == 0 || arr == null) {
            return null;
        }
        List<Integer> list1 = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();//k v
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i] - x;
            int val = arr[i];
            map.put(key, val);
        }
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            i++;
            set.add(entry.getValue());
            if (i == k) {
                break;
            }
        }
        set.toArray();
        return list1;
    }

    //给一非空的单词列表，返回前 k 个出现次数最多的单词。
    //
    //返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
    class Solution {
        public List<String> topKFrequent(String[] words, int k) {
            LinkedList<String> res = new LinkedList<>();
            //单词和次数对应
            Map<String, Integer> map = new HashMap<>();
            //先将数组当中的每个单词存放至map当中
            for (String s : words) {
                if (map.get(s) == null) {
                    map.put(s, 1);
                } else {
                    map.put(s, map.get(s) + 1);
                }
            }

            PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(k, new Comparator<Map.Entry<String, Integer>>() {
                //这个方法的作用是：放入元素之后，进行调整的。
                public int compare(Map.Entry<String, Integer> x, Map.Entry<String, Integer> y) {
                    //频率相同：如果是小堆的形式是：i  love   出的时间就是love i 了
                    if (x.getValue() == y.getValue()) {

                        return y.getKey().compareTo(x.getKey());
                        //return x.getKey().compareTo(y.getKey());
                    }
                    return x.getValue() - y.getValue();
                }
            });


            //每次添加的时候  触发上面的排序
            for (Map.Entry<String, Integer> i : map.entrySet()) {
                if (minHeap.size() < k) { // 未达到最大容量，直接添加
                    minHeap.add(i);
                } else { // 队列已满
                    Map.Entry<String, Integer> top = minHeap.peek();
                    if (top.getValue() == i.getValue()) {
                        //相等之后，字母顺序小的入队
                        if (top.getKey().compareTo(i.getKey()) > 0) {
                            minHeap.poll();
                            minHeap.add(i);
                        }
                    } else {
                        if (top.getValue() < i.getValue()) {
                            minHeap.poll();
                            minHeap.add(i);
                        }
                    }
                }
            }
            System.out.println(minHeap);//可以看到结果和我们想要的是反着的。

            for (int i = 0; i < k; ++i) {
                String temp = minHeap.peek().getKey();
                res.add(0, temp);
                minHeap.poll();
            }
            return res;
        }
    }
}
