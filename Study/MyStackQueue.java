package JavaStudy.Study;

import java.util.Queue;
import java.util.Stack;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-14 19:53
 **/
public class MyStackQueue {
    //用两个栈实现
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    /**
     * Initialize your data structure here.
     */
    public MyStackQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     * 出栈
     */
    public int pop() {
        if (empty()) {
            return -1;
        }
        //判断s2是否有元素
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());//将s1的元素全部给s2
            }
        }
        int data = stack2.pop();//出并且删除
        return data;//出的是s1的第一个进栈的元素  即队列的先进先出
        //不能直接return stack.pop() 会有可能返回空

    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (empty()) {
            return -1;
        }
        //判断s2是否有元素
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());//将s1的元素全部给s2
            }
        }
        int data = stack2.peek();//出但不删除
        return data;//出的是s1的第一个进栈的元素  即队列的先进先出
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        if (stack1.empty() && stack2.empty()) {
            return true;
        }
        return false;
    }
}
