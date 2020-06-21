package JavaStudy.Study.Study0621;

import java.util.concurrent.*;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-21 14:23
 **/
public class test {
    //线程工厂
    static class MyThreadFactory implements ThreadFactory {
        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "我随便起的名字");
        }
    }

    public static void main(String[] args) {
        //创建队列
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(10);

        //创建线程池
        //创建线程的过程再线程池代码内部，无法控制，如果想改名字没有机会
        ExecutorService executorService = new ThreadPoolExecutor(10,
                10,
                0,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),
                new MyThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );

        //创建线程任务
        for (int i = 0; true; i++) {
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


            //把线程任务交给线程池子
            //线程池子随机选择空闲线程去执行
            System.out.println("第" + i + "个任务");
            executorService.execute(target);
        }
    }
}
