package JavaStudy.Study;

/**
 * @program: Java
 * @description: 泛型
 * @author: Mx
 * @create: 2020-05-11 08:32
 *
 * 意义：
 * 1.可以自动进行类型的检查
 * 2.可以自动进行类型的转换
 *
 * <T> 只是一个占位符号  表示当前类是一个泛型类
 *
 * 注意：
 * 1.不能new泛型类型的数组
 * 2.简单类型不能作为泛型类型的参数
 * 3.泛型类型参数 不参与类型的组成
 *
 * 泛型到底是怎么编译的？
 * 擦除机制，只是在编译时期的一种机制，运行时不存在泛型说法。
 * 所有的处理均在编译阶段已经处理
 *
 * 擦除机制：在编译时，泛型类型被擦除为Objecct，不是替换
 **/
public class Study051003<T, E, V, K> {
    public T[] elem;
    public int usedSize;

    public Study051003() {
        this.elem = (T[]) new Object[10];
        this.usedSize = usedSize;
    }
}
