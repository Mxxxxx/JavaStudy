package JavaStudy.Study.Study0618;

/**
 * 演示 synchronized 关键字的语法
 * <p>
 * synchronized的作用
 * 1.预备知识
 * 引用指向对象。没有指向引用，对象也不能指向任何东西
 * 引用和对象都是内存中的一段空间
 * 通过引用这块空间存储的值，可以找到内存中的另一块位置（对象）
 *
 *
 */
public class SynchronizedSyntaxDemo {
    /**
     * 修饰方法
     */
    public synchronized void method() {
    }

    public static synchronized void staticMethod() {
    }

    /**
     * 修饰代码块
     */
    public void otherMethod() {
        // 括号里跟着指向对象的引用，引用不能是 null
        Object o = new Object();
        synchronized (o) {
        }

        synchronized (this) {
        }

        // 反射中，指向当前类对象
        synchronized (SynchronizedSyntaxDemo.class) {
        }
    }
}
