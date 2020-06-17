package JavaStudy.Study.Study0616;

/**
 * 两个线程同时打印
 */
public class YieldDemo {
    static class A extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("A");
            }
        }
    }

    static class B extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("B");
                Thread.yield();//放弃抢占cpu，但没有有放弃抢cpu的资格
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}
