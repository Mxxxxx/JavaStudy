package JavaStudy.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-11 09:54
 **/
public class practice0511 {
    //我们定义，在以下情况时，单词的大写用法是正确的：
//全部字母都是大写，比如"USA"。
//单词中所有字母都不是大写，比如"leetcode"。
//如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
//否则，我们定义这个单词没有正确使用大写字母。
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/detect-capital
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public boolean detectCapitalUse(String word) {
        int upper = 0;
        int lower = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) - 'a' < 0) {
                upper++; //都是大写
            } else {
                lower++; //都是小写
            }
        }
        if (upper == word.length() || lower == word.length() || (upper == 1 && word.charAt(0) < 'a')) {
            return true;
        } else {
            return false;
        }
    }

    //给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
    //所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
    public String defangIPaddr(String address) {
        String a = address.replaceAll(".", "[.]");
        return a;
    }

    //在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
    //给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
    //返回可以通过分割得到的平衡字符串的最大数量。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/split-a-string-in-balanced-strings
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public int balancedStringSplit(String s) {
        int L = 0;//字符串中L的个数
        int R = 0;//字符串中R的个数
        int sum = 0;//总个数
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                R++; //不需要重新归零R、L的个数。直接判断是否相等
            } else if (s.charAt(i) == 'L') {
                L++;
            }
            if (R == L) {
                sum++;
            }
        }
        return sum;
    }


    //实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
    public String toLowerCase(String str) {
        String ret = str.toLowerCase();
        return ret;
    }

    //给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
    public boolean CheckPermutation(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);
        return new String(c1).equals(new String(c2));


    }


    public static void main1(String[] args) {
        String str = "Hello World";
//        String[] a = str.split(" ");
//        for (String s : a) {
//            System.out.println(s);
//        }
        // System.out.println(str.replace("e", "A"));
        //System.out.println(str.indexOf("e"));
        //System.out.println(str.contains("World"));
        System.out.println(str.compareTo("ABc"));
    }


    //给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        if (numRows == 0) {
            return ret;
        }
        ret.add(new ArrayList<>());//第一行
        ret.get(0).add(1);//第一行直接添加1
        for (int i = 1; i < numRows; i++) {
            //直接从第二行计算
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);//当前行的第一个元素
            List<Integer> prevRow = ret.get(i - 1);//前一行
            for (int j = 1; j < i; j++) {
                //[i,j] = [i-1,j] + [i-1,j-1]
                int x = prevRow.get(j);
                int y = prevRow.get(j - 1);
                curRow.add(x + y);
            }
            //最后一个元素
            curRow.add(1);
            ret.add(curRow);
        }
        return ret;
    }
}
