package JavaStudy.Study.Study0527;

import JavaStudy.Study.MyArrayList;

/**
 * @program: Java
 * @description: 泛型
 * @author: Mx
 * @create: 2020-05-26 18:45
 * 1.<T> 占位符 表示当前类是泛型类
 * 2.放数据时候，可以自动进行类型的检查
 * 3.取数据的时候，可以自动进行类型转换
 * 4.泛型是如何编译
 * 泛型是在编译时期的一种机制-》擦除机制，编译时，按照Object进行编译
 * 不是替换成Object
 * 5.泛型类参数不参与编译
 * <p>
 * 注意：
 * 1.不能new泛型类型的数组
 * 2.简单类型不能作为泛型类型的参数，封装类型
 * 3.泛型类型的参数，不参与泛型的组成
 **/
class MyStack<T> {
    public T[] elem;
    public int top;

    public MyStack() {
        this.elem = (T[]) new Object[10];
    }

    public void push(T val) {
        this.elem[this.top] = val;
        this.top++;
    }

    public Object peek() {
        return this.elem[this.top - 1];
    }
}

public class TestDemo01 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push("hello");
    }
}
