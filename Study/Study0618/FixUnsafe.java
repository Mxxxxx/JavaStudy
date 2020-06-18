package JavaStudy.Study.Study0618;

public class FixUnsafe {
    private static final long N = 100_0000_0000L;
    private static long v = 0;

    static class Add extends Thread {
        @Override
        public void run() {
            synchronized (FixUnsafe.class) {
                for (long i = 0; i < N; i++) {
                    v++;
                }
            }
        }
    }

    static class Sub extends Thread {
        @Override
        public void run() {
            synchronized (FixUnsafe.class) {
                for (long i = 0; i < N; i++) {
                    v--;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Add a = new Add();
        Sub s = new Sub();

        a.start();
        s.start();

        // 为什么这里需要 join？
        a.join();
        s.join();

        System.out.println(v);
    }
}
