package JavaStudy.Study;

import java.util.*;

/**
 * @program: Java
 * @description:泛型
 * @author: Mx
 * @create: 2020-05-10 10:59
 **/
public class Study051002 {

    public static void main(String[] args) {
        Integer a = 10; //自动装箱          -127~128
        int b = a; //自动拆箱
        Integer c = 10; //  取的是a之前缓存好的10
        System.out.println(a==c);
    }

    public static void main3(String[] args) {
        int i = 10;
        Integer ij = Integer.valueOf(i);
        Integer ii = new Integer(i);//手动装箱

        //拆箱
        int j = ii.intValue();
        double a = ij.doubleValue();
    }

    public static void main2(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("学生", "小明");
        map.put("老师", "老王");
        System.out.println(map);

        Set<Map.Entry<String, String>> set = map.entrySet();
        System.out.println(map);


        System.out.println(map.size());

        System.out.println(map.containsKey("学生"));
        System.out.println(map.containsValue("小明"));
        System.out.println(map.isEmpty());

        String a = map.get("学生");
        System.out.println(a);
    }

    public static void main1(String[] args) {
        //Collection collection = new LinkedList();
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("bit");
        collection1.add("hello");
        collection1.add("world");
        System.out.println(collection1);

        collection1.add("ad");
        Object[] a = collection1.toArray();//返回一个装有所有集合元素的数组
        System.out.println(Arrays.toString(a));

        System.out.println(collection1.isEmpty());//判断空集合

        collection1.remove("hello");//删除部分元素
        System.out.println(collection1);

        System.out.println(collection1.size());//求出长度

        collection1.clear();//删除所有
        System.out.println(collection1);
    }
}
