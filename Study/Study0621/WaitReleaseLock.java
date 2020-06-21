package JavaStudy.Study.Study0621;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-21 09:06
 **/
public class WaitReleaseLock {
    static Object o1 = new Object();
    static Object o2 = new Object();

    static class SubThread extends Thread {
        @Override
        public void run() {
            synchronized (o1) {
                synchronized (o2) {
                    try {
                        o2.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SubThread subThread = new SubThread();
        subThread.start();

        //让主线程主动放弃CPU，保证子线程运行起来
        Thread.sleep(1000);

        /*
        sleep（毫秒）和 wait（毫秒）有什么区别？
        1.相同：都会主动放弃CPU，并且在一段时间内不再继续调度CPU
        TIMED_WATING
        2.不同：
        {sleep}
        是线程休眠一段时间。
        属于 static Thread.sleep
        {wait}
        等待被其他线程唤醒，这里带了一个超时时间
        属于 Object.wait
        {notify} 随机唤醒该等待集上的一个线程
        {notifyAll}  唤醒该等待集上的所有线程
         */

        synchronized (o2) {
            System.out.println("o2成功");
            o2.notify();
        }
        synchronized (o1) {
            System.out.println("o1成功");
            o1.notify();
        }
    }
}
