package JavaStudy.Study;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-12 08:56
 **/
public class Study0511 {
    public static void main1(String[] args) {
        List<String> list = new ArrayList<>();  //泛型指定只能放String
        //默认容量10

        list.add("hello"); //插入
        list.add(0, "world");//不能跳着放

        //list.addAll()类型是实现了collection的接口的
        //Collection<? extends E> c
        //？ ：通配符，
        //实现了collection接口
        //类型 E的子类或者是本身
        List<String> list1 = new ArrayList<>();
        list1.add("list1");
        list.addAll(list1);

        //String ret = list.remove(0);//删除下标
        //System.out.println(ret);

        //list.remove("hello");
        System.out.println(list);
        System.out.println("*****get***");
        String ret = list.get(0);
        System.out.println(ret);
        System.out.println("*****set***");
        list.set(2, "hha");//设置已有的位置，相当于更新
        System.out.println(list);
        System.out.println("***contains**");
        System.out.println(list.contains("hha"));
        System.out.println("返回下标,第一个o所在的下标,从前往后找");
        System.out.println(list.indexOf("hha"));
        list.add("hha");
        System.out.println("返回下标，最后一个o所在的下标，从后往前找");
        System.out.println(list.lastIndexOf("hha"));
        System.out.println("截取一部分list,左闭右开");
        //[world, hello, hha, hha]
        List<String> ret3 = list.subList(0, 3);
        System.out.println(ret3);
        ret3.set(0, "修改");
        System.out.println(ret3);//指向原来的
        System.out.println(list);//

        ret3.clear();
        System.out.println(list);
    }

    static class Student {
        String name;
        String classNum;
        double score;

        public Student(String name, String classNum, double score) {
            this.name = name;
            this.classNum = classNum;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getClassNum() {
            return classNum;
        }

        public void setClassNum(String classNum) {
            this.classNum = classNum;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", classNum='" + classNum + '\'' +
                    ", score=" + score +
                    '}';
        }
    }

    public static void main2(String[] args) {
        Student student1 = new Student("小明", "一班", 98);
        Student student2 = new Student("小宏", "二班", 95);
        Student student3 = new Student("小王", "三班", 90);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        System.out.println(list);
    }

    public static void main3(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(7);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    public static List<Character> func(String str1, String str2) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!str2.contains(ch + "")) {
                list.add(ch);
            }
        }
        return list;
    }

    //删除第一个字符串中的第二个字符串的内容
    public static void main(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "come";
        List<Character> list = func(str1, str2);
        //System.out.println(list);
        for (char ch : list) {
            System.out.print(ch);
        }
    }
}
