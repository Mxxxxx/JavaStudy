package JavaStudy.Study;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @program: Java
 * @description:字符串
 * @author: Mx
 * @create: 2020-05-07 09:02
 **/
class Person2 {
    private int age;
}

public class Study0507 {
    public static void main0(String[] args) {
        //1.定义方法
        String str1 = "Hello";
        System.out.println(str1);
        //2.定义方法
        String str2 = new String("abcdef");
        System.out.println(str2);
        //3.定义方法
        char[] val = {'a', 'b', 'c', 'd'};
        String str3 = new String(val);
        System.out.println(str3);

        String str4 = "Hello";
        String str5 = new String("Hello"); //new String的堆地址传给str5

        System.out.println(str1 == str5);//false
        System.out.println(str1 == str4);//true
        //字符串常量池
        //数据存放不重复
    }

    public static void main1(String[] args) {
        String st1 = "hello";
        String str2 = "hel" + "lo";   //编译时已经变为 hello
        System.out.println(st1 == str2);  //true

        String str3 = new String("hel") + "lo";   //hel和lo在堆里重新生成对象 hello  str3指向该对象
        System.out.println(st1 == str3);  //false
    }


    public static void func(String str, char[] array) {
        str = "abcde";  //在字符常量池中
        array[0] = 'g';  //在堆中
    }

    public static void main2(String[] args) {
        String str1 = "hello";
        char[] val = {'a'};
        System.out.println(str1);//在常量池中生成hello
        System.out.println(Arrays.toString(val));
        System.out.println("******");
        func(str1, val); //str1   传入，方法里str又生成一个新的abcde在池中。与str1地址不同
        //val 则是修改数组中零号下标
        System.out.println(str1);
        System.out.println(Arrays.toString(val));
    }

    public static void main3(String[] args) {
        //调用equals，没有重写的话，调用的是Object的equals方法，默认比较 引用 是否相同。
        //Arrays里的equals是比较
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);//比较引用
        System.out.println(str1.equals(str2));//比较内容
        System.out.println("***");
        String str3 = "hello";
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        //上面str1不能为空
    }

    public static void main4(String[] args) {
        String str1 = "hello";
        System.out.println("hello".equals(str1));//一般这样写，以保证指针正确
    }

    public static void main5(String[] args) {
        //手动入池 intern()  当前字符串在常量池中是否存在，如果存在，把常量池当中的 引用 赋值给当前引用类型变量
        String str1 = "hello";
        String str2 = new String("hello").intern();
        System.out.println(str1 == str2);
    }

    public static void main6(String[] args) {//字符串不可变
        //不能这样写
        //生成多余的临时变量
        String str = "hello"; //生成hello
        str = str + "world";  //生成hello world
        str += "!!!";  //生成hello world ！！！
        System.out.println(str);
    }

    public static void main7(String[] args) {
        String str = "Hello";
        str = "h" + str.substring(1);
        System.out.println(str);
    }

    public static void main8(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "Hello";
        //反射->自省过程
        Class cl = String.class;
        Field field = cl.getDeclaredField("value");
        field.setAccessible(true);
        char[] val = (char[]) field.get(str);
        val[0] = 'g';
        System.out.println(str);
    }

    //字符串与数组的互换

    //给定字符串，判断其是否是由数字组成
    public static boolean func(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  //charAt 访问字符串下标
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main9(String[] args) {
        String str = "123456";
        boolean flg = func(str);
        System.out.println(flg);
    }


    //字节字符串转换
    public static void main10(String[] args) {
        byte[] bytes = {97, 98, 99, 100};
        String str = new String(bytes);
        System.out.println(str);
        String str2 = "abcdef";
        byte[] bytes1 = str2.getBytes();
        System.out.println(Arrays.toString(bytes));
    }

    public static void main11(String[] args) {
        String str1 = "abcd";
        String str2 = "ABCD";
        String str3 = "abcdef";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str3));

        //str1>str3 正数
        //str1<str3 负数
        //str1=str3 0
    }

    //字符串查找
    public static void main12(String[] args) {
        //判断字符串是否存在
        String str = "abcdaef";
        boolean flg = str.contains("abac");
        System.out.println(flg);

        //查找第一次出现的字符串下标
        int index = str.indexOf("def");
        System.out.println(index);

        //从指定位置开始查找字符串
        int index1 = str.indexOf("c", 3);

        //从后向前查找
        index = str.lastIndexOf("a");
        System.out.println(index);

        //从指定位置从后往前找
        index = str.lastIndexOf("a", 2);
        System.out.println(index);

        //判断字符串是否以什么开头
        boolean flg1 = str.startsWith("a");
        System.out.println(flg1);

        //判断字符串以某位置，开始的开头
        flg1 = str.startsWith("a", 2);
        System.out.println(flg1);

        //判断字符串以什么结尾
        flg1 = str.endsWith("f");
        System.out.println(flg1);

    }

    //字符串拆分
    public static void main13(String[] args) {
        //字符串以什么拆分
        String str = "abc de f";
        String[] strings = str.split(" ");
        for (String s : strings) {
            System.out.println(s);
        }

        //特数符号用 转义字符\\
        String str1 = "192\\168\\1\\1";
        String[] strings1 = str1.split("\\\\");
        for (String s1 : strings1) {
            System.out.println(s1);
        }

        //多次分割
        String str2 = "Java=spilt&ha";
        String[] strings2 = str2.split("=");
        //Java           spilt&ha
        for (String s2 : strings2) {
            String[] strings3 = s2.split("&");
            for (String s3 : strings2) {
                System.out.println(s3);
            }
        }
    }

    //大小写转变
    public static void main14(String[] args) {
        String a = "abcd";
        String ret = a.toUpperCase();
        System.out.println(ret);
        ret = ret.toLowerCase();
        System.out.println(ret);
    }

    //StringBuffer 和StringBuild
    //String无法改变，改变的是其引用的指向而已
    //String和StringBuffer 和StringBuild的区别
    //1.String的拼接会产生大量的临时变量，而其他两个不会
    //2.String拼接会被优化为StringBuild的append()方法
    //3.StringBuild String 一般用于单线程
    //4.StringBuffer一般用于多线程
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abcd");
        stringBuilder.append("efg");
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
    }
}

