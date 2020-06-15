package JavaStudy.Study.Study0615;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-15 18:52
 **/
public class PrintThreadFields {
    static class SubThread extends Thread {
        @Override
        public void run() {
            printfFields();
            try {
                Thread.sleep(100*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new SubThread();
        thread.start();

        printfFields();
        Thread.sleep(100*1000);
        System.out.println("=========");
    }

    //多个线程随机交叉是正确的，但一个线程内的顺序是有序的
    private static void printfFields() {
        Thread t = Thread.currentThread();//返回当前正在执行的线程的引用
        long id = t.getId();
        System.out.println("线程名字" + id + ":" + t.getName());
        System.out.println("线程的优先级" + id + ":" + t.getPriority());
        System.out.println("线程的状态" + id + ":" + t.getState());
        System.out.println("线程是否存活" + id + ":" + t.isAlive());
        System.out.println("线程是否连接后台线程" + id + ":" + t.isDaemon());
    }
}
