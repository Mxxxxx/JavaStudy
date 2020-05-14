package JavaStudy.Study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @program: Java
 * @description:栈 先进后出
 * @author: Mx
 * @create: 2020-05-13 18:31
 **/
public class study0513 {
    //队列
    //从尾巴进，从头出
    //先进先出
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
    }

    public static void main1(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //入栈
        //先进后出
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //stack.peek()//拿栈定元素
        System.out.println(stack.peek());//显示栈顶元素

        stack.pop();//出栈并且删除栈顶元素
        System.out.println(stack.peek());

        System.out.println(stack.empty());//判断栈是否空

        System.out.println(stack.search(1));//从栈顶开始找1开始
    }
}
