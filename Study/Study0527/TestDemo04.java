package JavaStudy.Study.Study0527;

import java.util.*;

/**
 * @program: Java
 * @description:Map和Set
 * @author: Mx
 * 1.怎么放进去的？ 根据key值,生成一个位置
 * @create: 2020-05-26 19:54
 **/
public class TestDemo04 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        Iterator<Integer> integerIterator = set.iterator();//迭代器
        while (integerIterator.hasNext()) {//map不可以用迭代器打印，单可以转换
            //1.将map的数据转化为set
            //2.
            System.out.println(integerIterator.next());//打印interIt下一个，并向下走一个
        }
    }

    public static void main1(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "小明");
        map.put(2, "小宏");
        map.put(3, "小李");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(map);
    }
}
