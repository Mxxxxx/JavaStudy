package JavaStudy.Study.Study0616;

/**
 * 线程安全：运行结果完全符合预期---消除随机性并正确
 * 线程不安全：
 * 1.Java中的一条语句，对应不一定是一条字节码，更不一定是一条CPU指令
 * 2.线程调度中有随机性存在。什么时候从CPU上被调度下来，以及什么时候被调度回CPU
 * <p>
 * 什么时候会出现线程不安全？
 * 1.线程之间有共享的数据。若线程之间不存在共享，天生线程就是安全的
 * 2.即使线程直接有共享，但没有线程修改共享数据，则天生线程是安全的
 * <p>
 * JVM中运行时内存区域中，哪些位置时共享的？哪些是线程内部私有的？
 * 1.nextPC值---PC区域  私有
 * 2.栈区（Java栈/native栈）  私有
 * 3.堆区   共享
 * 4.方法去   共享
 * 5.运行时常量池  共享
 * <p>
 * 启动两个线程，同时操作一个变量 v = 0
 * 一个线程对该变量执行 N 次 v++
 * 另一个线程对该变量执行 N 次 v--
 * 问，当两个线程都执行结束时，v 的值是多少？
 * <p>
 * 期望值：0
 * 实际值：随机 （N值较小时，出现随机的情况较少，N较大时，出现情况较多）
 */
public class ThreadUnsafeDemo {
    private static final int N = 100_0000;
    private static int v = 0;

    static class Add extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < N; i++) {
                v++;
            }
        }
    }

    static class Sub extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < N; i++) {
                v--;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Add a = new Add();
        Sub s = new Sub();
        a.start();
        s.start();

        a.join();
        s.join();
        // 这里时，a 和 s 都结束了
        System.out.println(v);
    }
}
