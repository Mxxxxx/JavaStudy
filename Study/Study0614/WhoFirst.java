package JavaStudy.Study.Study0614;

public class WhoFirst {
    //结果不固定
    //加入就绪队列的时机是确定的，但什么时候调度到cpu不确定，什么时候被从cpu调度下列也不确定
    //主线程现在能创建A/B两个线程，代表现在主线程占据这cpu
    static class PrintA extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("A");
            }
        }
    }

    static class PrintB extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("B");
            }
        }
    }

    public static void main(String[] args) {
        PrintA a = new PrintA();
        PrintB b = new PrintB();
        a.start();
        b.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main");
        }
    }
}
