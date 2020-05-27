package JavaStudy.Study.Study0527;

import java.util.*;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-26 20:27
 **/
public class TestDemo05 {
    public static void main(String[] args) {
        int i = 0;
        Integer j = new Integer(0);
        System.out.println(i == j);
        System.out.println(j.equals(i));
    }

    //十万个数据统计重复出现的次数，以及数字
    public static void main3(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(random.nextInt(6000));
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        //k->重复数字   v->重复数字出现的次数
        for (Integer key : arrayList) {

            if (hashMap.get(key) == null) {
                //没有这个值,只有一次
                hashMap.put(key, 1);
            } else {
                Integer val = hashMap.get(key);//返回key对应的val
                hashMap.put(key, val + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    //去掉重复的数字
    public static void main2(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(random.nextInt(6000));
        }
        HashSet<Integer> hashSet = new HashSet<>();
        //无法存放重复
        hashSet.addAll(arrayList);
    }

    //找到十万个数据中，第一个重复的
    public static void main1(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(random.nextInt(6000));
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer val : arrayList) {
            if (hashSet.contains(val)) {
                System.out.println(val);
                return;
            } else {
                hashSet.add(val);
            }
        }
    }
}
