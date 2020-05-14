package JavaStudy.Study;

import java.util.Stack;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-14 20:18
 **/
//保存栈内最小值
public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> stackMin;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (stackMin.empty()) { //最小栈内没有元素
            stackMin.push(x);//首次添加，即最小
        } else {
            int top = stackMin.peek();//之后入栈元素
            if (x <= top) {//如果小于等于
                stackMin.push(x);//入栈
            }
        }
    }

    public void pop() {
        if (!stack.empty()) {
            int tmp = stack.pop();
            if (tmp == stackMin.peek()) {
                stackMin.pop();
            }
        }
    }

    public int top() {
        if (stack.empty()) {
            return -1;
        }
        return stack.peek();
    }

    public int getMin() {
        if (stackMin.empty()) {
            return -1;
        }
        return stackMin.peek();
    }
}
