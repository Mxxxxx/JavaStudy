package JavaStudy.Study.Study0526;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-26 10:41
 **/

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;//大堆
    }
}

public class TopK {

    public static Integer[] topk(int[] array, int k) {
        MyComparator myComparator = new MyComparator();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            //匿名内部类
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });


        for (int i = 0; i < array.length; i++) {
            if (maxHeap.size() < k) {//放k个
                maxHeap.offer(array[i]);//建立一个k个的大根堆
            } else {//后面的逐个比较  从第k+1开始
                Integer val = maxHeap.peek();//第k个
                if (val != null && val > array[i]) {//k与第k+1比较大小
                    maxHeap.poll();//如果第k+1个大于k个，弹出第k个
                    maxHeap.offer(array[i]);//将第k+1放入
                }
            }
        }
        //将前k最小打印
        Integer[] ret = new Integer[k];
        for (int i = 0; i < k; i++) {
            int v = maxHeap.poll();
            ret[i] = v;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arrat = {13, 1, 7, 8, 20, 15};
        Integer[] ret = topk(arrat, 4);
        System.out.println(Arrays.toString(ret));
    }
}
