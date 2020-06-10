package JavaStudy.Practice;

import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-08 14:09
 **/
public class practice0608 {
    //链接：https://www.nowcoder.com/questionTerminal/9d1559511b3849deaa71b576fa7009dc
    //来源：牛客网
    //
    //回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串。
    // 花花非常喜欢这种拥有对称美的回文串，生日的时候她得到两个礼物分别是字符串A和字符串B。
    // 现在她非常好奇有没有办法将字符串B插入字符串A使产生的字符串是一个回文串。
    // 你接受花花的请求，帮助她寻找有多少种插入办法可以使新串是一个回文串。如果字符串B插入的位置不同就考虑为不一样的办法。
    public static boolean func1(String string) {//判断回文
        int left = 0;
        int right = string.length() - 1;
        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int func(String str1, String str2) {//将str2插入到str1的各个位置，然后判断
        int num = 0;
        for (int i = 0; i <= str1.length(); i++) {
            StringBuilder stringBuilder = new StringBuilder(str1);
            stringBuilder.insert(i, str2);
            if (func1(stringBuilder.toString())) {
                num++;
            }
        }
        return num;
    }

    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            System.out.println(func(str1, str2));
        }
    }

    //有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。
    //
    //给定一个整数数组a,同时给定它的大小n和要找的K(K在1到n之间)，请返回第K大的数，保证答案存在。
    //

    public static void quickSort(int[] a) {

    }

    public static int findKth(int[] a, int n, int K) {
        return 1;
    }

    public static void main2(String[] args) {

    }

    //有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。
    // 小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”答案是5瓶，方法如下：
    // 先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。
    // 然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。
    // 如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int canDrink = 0;
            int num = in.nextInt();
            while (num / 3 > 0) {
                int tmp = 0;
                tmp = num / 3;//空瓶
                canDrink += num / 3;//可以喝多少
                num = num % 3 + tmp;
            }
            if (num == 2) {
                canDrink++;
            }
            System.out.println(canDrink);
        }
    }
}
