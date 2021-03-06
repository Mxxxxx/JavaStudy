package JavaStudy.Study.Study0621;

import java.util.concurrent.*;

public class JavaThreadPoolMain {
    static class MyThreadFactory implements ThreadFactory {
        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "我随便起的名字");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(3);

        // 创建线程池
        ExecutorService threadPool = new ThreadPoolExecutor(
                10,//正式线程数量
                10,//总线程数量
                0,//临时线线程时间
                TimeUnit.SECONDS,//临时线程允许摸鱼时间单位
                queue,//线程队列
                new MyThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        for (int i = 0; true; i++) {
            // 线程池执行的任务
            Runnable target = new Runnable() {
                @Override
                public void run() {
                    try {
                        TimeUnit.MINUTES.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

            // 等同于把任务提交给线程池
            // 线程池内部会选择一个空闲的线程去执行该任务
            System.out.println("提交第 " + i + " 个任务");
            System.out.println(queue.size());
            threadPool.execute(target);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
