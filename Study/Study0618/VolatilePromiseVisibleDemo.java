package JavaStudy.Study.Study0618;

/*
内存可见性：
被v修饰的变量：任何的读取都必须从主内存读取
任何的修改都必须同步到主内存中
 */
public class VolatilePromiseVisibleDemo {
    //变成易失的
    //不加volatile ，子线程很可能看不到
    private static volatile boolean run = true;

    static class Runner extends Thread {
        @Override
        public void run() {
            // run 变成 false 才会退出
            while (run) {
            }
            System.out.println("Runner 退出了");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();
        runner.start();

        Thread.sleep(2000); // 主线程放弃 2s CPU，保证后边的代码执行时，子线程已经运行起来了

        System.out.println("2s 已到");
        run = false;
        // 正确的情况下，主线程就到这里就退出了
        // 随后，因为 run == false，所以，子线程也回退出
        // 进而 JVM 运行结束
    }
}
