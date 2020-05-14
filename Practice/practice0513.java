package JavaStudy.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-13 15:48
 **/
public class practice0513 {
    //给你一个整数 n，请你返回一个含 n 个字符的字符串，其中每种字符在该字符串中都恰好出现 奇数次 。
    //
    //返回的字符串必须只含小写英文字母。如果存在多个满足题目要求的字符串，则返回其中任意一个即可。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/generate-a-string-with-characters-that-have-odd-counts
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public String generateTheString(int n) {
        //相当于判断n是奇数还是偶数
        //奇数 返回奇数个相同的值
        //偶数 返回 n-
        StringBuilder stringBuilder = new StringBuilder();
        if (n == 0) {
            return null;
        }
        if (n % 2 == 0) {  //偶数
            for (int i = 0; i < n - 1; i++) {
                stringBuilder.append('a');
            }
            stringBuilder.append('b');
        } else {
            for (int i = 0; i < n; i++) {
                stringBuilder.append('a');
            }
        }
        return stringBuilder.toString();
    }

    //URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。（注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/string-to-url-lcci
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public String replaceSpaces(String S, int length) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == ' ') {
                stringBuilder.append("20%");
            } else {
                stringBuilder.append(S.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    //给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
    //
    //对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有 最多 的糖果。注意，允许有多个孩子同时拥有 最多 的糖果数目。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;//最多的糖果
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(candies[i], max);//找出糖果最多的人
        }
        List<Boolean> list = new ArrayList();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {   //每个人都和给的糖果相加，结果大于等于之前最多拥有糖果的为真
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }


    //给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
//有效字符串需满足：
//
//左括号必须用相同类型的右括号闭合。
//左括号必须以正确的顺序闭合。
//注意空字符串可被认为是有效字符串。
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/valid-parentheses
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public boolean isValid(String s) {
        //栈来存放左括号
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);//栈存放左括号
            } else {
                //遇到右括号
                if (stack.empty()) {
                    System.out.println("右括号多");
                    return false;
                }

                char ch2 = stack.peek();//先拿到栈定元素的括号 判断与右括号是否匹配
                if (ch2 == '(' && ch == ')' || ch2 == '[' && ch == ']' || ch2 == '{' && ch == '}') {
                    stack.pop();//出栈一个左括号
                } else {
                    //第一个就不匹配
                    System.out.println("左右括号不匹配");
                    return false;
                }
            }
        }
        //左括号多到 匹配的取完后还有的情况
        if (!stack.empty()) {
            System.out.println("左括号多");
            return false;
        }
        return true;
    }
}
