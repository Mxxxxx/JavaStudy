package JavaStudy.Study;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-19 20:59
 **/
class st {
    public String name;
}

public class Study0519 {
    //优先级队列
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue();
        //Queue<Integer> queue1 = new PriorityQueue<>();//默认容量11
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        //放入的元素必须可以比较大小
        //不能插入null
    }
}
