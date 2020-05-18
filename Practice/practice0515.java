package JavaStudy.Practice;

import sun.font.StrikeCache;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-15 15:02
 **/
public class practice0515 {
    //根据逆波兰表示法，求表达式的值。
    //
    //有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
    //
    //说明：
    //
    //整数除法只保留整数部分。
    //给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/evaluate-reverse-polish-notation
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public int evalRPN(String[] tokens) {
        if (tokens.length == 0) {
            return -1;
        }
        Integer num2;
        Integer num1;
        Stack<Integer> stack1 = new Stack<>();//存放数字
        for (String s : tokens) {
            switch (s) {
                case "+":
                    num2 = stack1.pop();
                    num1 = stack1.pop();
                    stack1.push(num1 + num2);
                    break;
                case "-":
                    num2 = stack1.pop();
                    num1 = stack1.pop();
                    stack1.push(num1 - num2);
                    break;

                case "*":
                    num2 = stack1.pop();
                    num1 = stack1.pop();
                    stack1.push(num1 * num2);
                    break;

                case "/":
                    num2 = stack1.pop();
                    num1 = stack1.pop();
                    stack1.push(num1 / num2);
                    break;

                default:
                    stack1.push(Integer.valueOf(s));
                    break;

            }
        }
        return stack1.pop();
    }


    //输入两个整数序列，第一个序列表示栈的压入顺序，
    // 请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。
    // 例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列
    // ，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        if (pushA.length == 0) {
            return false;
        }
        int tmp = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);//入栈
            while (!stack.isEmpty() && stack.peek() == popA[tmp]) {//如果栈不为空，且栈顶元素等于假设出栈列的首元素
                //那么连续开始出栈，直到不是为止
                stack.pop();
                tmp++;
            }
        }
        return stack.empty();
    }


    //你现在是棒球比赛记录员。
    //给定一个字符串列表，每个字符串可以是以下四种类型之一：
    //1.整数（一轮的得分）：直接表示您在本轮中获得的积分数。
    //2. "+"（一轮的得分）：表示本轮获得的得分是前两轮有效 回合得分的总和。
    //3. "D"（一轮的得分）：表示本轮获得的得分是前一轮有效 回合得分的两倍。
    //4. "C"（一个操作，这不是一个回合的分数）：表示您获得的最后一个有效 回合的分数是无效的，应该被移除。
    //
    //每一轮的操作都是永久性的，可能会对前一轮和后一轮产生影响。
    //你需要返回你在所有回合中得分的总和。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/baseball-game
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public int calPoints(String[] ops) {
        if (ops.length == 0) {
            return -1;
        }
        Integer a, b;
        Stack<Integer> stack = new Stack<>();
        for (String s : ops) {
            switch (s) {
                case "+":
                    b = stack.pop();
                    a = stack.peek();//根据题意，不会弹出b，只能显示倒数第二个后再次添加
                    stack.push(b);
                    stack.push(a + b);
                    break;
                case "D":
                    b = stack.peek();
                    stack.push(b * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.valueOf(s));
                    break;
            }
        }
        int sum = 0;
        while (!stack.empty()) {
            sum += stack.pop();
        }
        return sum;
    }

    //给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
    //
    //注意：如果对空文本输入退格字符，文本继续为空。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/backspace-string-compare
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            stackS.push(S.charAt(i));
            if (S.charAt(i) == '#') {
                stackS.pop();
                if (stackS.size() != 0) {
                    stackS.pop();
                }
            }
        }
        for (int i = 0; i < T.length(); i++) {
            stackT.push(T.charAt(i));
            if (T.charAt(i) == '#') {
                stackT.pop();
                if (stackT.size() != 0) {
                    stackT.pop();
                }
            }
        }
//        for (int i = 0; i < stackS.size(); i++) {
//            if (stackS.pop() != stackT.pop()) {
//                return false;
//            }
//        }
        return stackS.equals(stackT);
    }
}
