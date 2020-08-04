package JavaStudy.Practice;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author Meng Xin
 * @Date 2020/8/3 19:52
 */
public class practice0803 {
    // Atomic integer containing the next thread ID to be assigned
    private static final AtomicInteger nextId = new AtomicInteger(0);

    // Thread local variable containing each thread's ID
    private static final ThreadLocal<Integer> threadId = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return nextId.getAndIncrement();
        }
    };

    // Returns the current thread's unique ID, assigning it if necessary
    public static int get() {
        return threadId.get();
    }

    public static void main(String[] args) {
        System.out.println(get());
    }
}
