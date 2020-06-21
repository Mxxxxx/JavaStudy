package JavaStudy.Study.Study0621;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class JavaBlockingQueueMain {
    static BlockingQueue<Integer> q1 = new ArrayBlockingQueue<>(16);//循环数组实现，指定容量上线
    static BlockingQueue<Integer> q2 = new LinkedBlockingQueue<>();//链表实现  无容量上限
    static BlockingQueue<Integer> q3 = new PriorityBlockingQueue<>();//堆实现   优先级阻塞队列

    static class Producer extends Thread {
        @Override
        public void run() {
            try {
                for (int i = 0; true; i++) {
                    q1.put(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            new Producer().start();
        }

        while (true) {
            Integer take = q1.take();
            System.out.println(take);
        }
    }
}
