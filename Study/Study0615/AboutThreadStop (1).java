package JavaStudy.Study.Study0615;

import java.util.Scanner;

/**
 * 主线程中创建新的线程（B）
 * <p>
 * 主线程负责通知让（B）停止运行
 */
class AboutThreadStop {
    static class B extends Thread {
        B() {
            super("B");
        }

        @Override
        public void run() {
            Thread t = Thread.currentThread();
            while (true) {
                try {
                    System.out.println("我正在挖煤");//此时停止，正常退出
                    Thread.sleep(1000);//在此时停止，执行异常退出
                    boolean interrupted = Thread.interrupted();//是否有人让你停止
                    //boolean interrupted = t.isInterrupted();
                    /*
                   1. Thread.interrupted();
                    返回当前线程的 isInterrupted();
                    isInterrupted=false

                    给线程自己用
                    如果调用了Thread.interrupted(); ，代表线程以及知道了，所以可以把中断标志清理成 false
                   2. t.isInterrupted();
                   return isInterrupted()

                   非该线程本身的线程，看是否有人让本线程停止，
                   只能看，不能修改
                     */
                    System.out.println("是否有人让我停止运行: " + interrupted);
                    if (interrupted == true) {
                        break;
                    }
                } catch (InterruptedException e) {//正在sleep时，接收停止消息，以异常形式停止
                    System.out.println("有人让我停止运行，但因为我正在 sleep，所以我收到了这个异常，异常退出");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        B b = new B();
        b.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("准备通知 B 线程停止运行");
        b.interrupt();  // 通知 B 停止运行
        System.out.println("已经通知 B 线程停止运行");
    }
}
