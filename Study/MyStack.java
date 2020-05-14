package JavaStudy.Study;

import java.util.Arrays;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-13 18:34
 **/
public class MyStack {
    public int top;//当前可以【存放数据】元素的下标，即下一个空栈区域
    public int[] elem;

    public MyStack() {
        this.elem = new int[10];
    }

    //入栈
    private boolean isFull(int top) {
        return top == this.elem.length;
    }

    public void push(int num) {
        if (isFull(this.top)) {
            this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);//数组扩容
        }
        this.elem[top] = num;
        top++;//指向下一个空的区域，表示可以存放
    }

    //拿到栈定元素，且删除
    public int pop() {
        if (empty()) {
            throw new RuntimeException("栈空");
        }
        int data = this.elem[this.top - 1];
        this.top--;
        return data;
    }

    //拿栈定元素
    public int peek() {
        if (empty()) {
            throw new RuntimeException("栈空");
        }
        int data = this.elem[this.top - 1];
        return data;
    }

    //判断空栈
    public boolean empty() {
        return this.top == 0;
    }


    //计算栈长
    public int size() {
        return this.top;
    }
}
