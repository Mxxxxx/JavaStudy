package JavaStudy.Study;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-14 18:44
 **/
//用队列模拟栈
public class MyQueueStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    /**
     * Initialize your data structure here.
     */
    public MyQueueStack(Queue<Integer> queue) {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     * 用两个队列实现栈
     */
    public void push(int x) {
        //先判断哪个队列为空
        //哪个队列不为空，就将元素放到那个队列
        //如果都为空，则放到第一个
        Queue<Integer> cur = new LinkedList<>();
        if (queue1.isEmpty() && queue2.isEmpty()) {
            queue1.offer(x);
        } else {
            cur = queue1.isEmpty() ? queue2 : queue1;
            cur.offer(x);
        }

//        if (queue1.isEmpty()) {
//            queue2.offer(x);
//        } else if (queue2.isEmpty()) {
//            queue1.offer(x);
//        } else {
//            queue1.offer(x);
//        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     * 删除栈顶元素，并给出其值
     */
    //出不为空的队列
    //出n-1个  最后一个就是出栈的元素
    public int pop() {
        //Queue<Integer> cur1 = new LinkedList<>();
        //Queue<Integer> cur2 = new LinkedList<>();
        //判断栈是否为空
        if (empty()) {
            throw new RuntimeException("当前为空栈");
        }
        //出不为空的栈
        Queue<Integer> cur1 = queue1.isEmpty() ? queue2 : queue1;//不为空的队列
        Queue<Integer> cur2 = queue1.isEmpty() ? queue1 : queue2;//为空的队列
        int size = cur1.size();
        while (size != 1) {
            cur2.offer(cur1.poll());
            size--;
        }
        int data = cur1.poll();
        return data;
    }

    /**
     * Get the top element.
     */
    //栈顶元素
    public int top() {
        if (empty()) {
            return -1;
        }
        int queue1s = queue1.size();
        int queue2s = queue2.size();
        return -1;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            return true;
        }
        return false;
    }
}
