package JavaStudy.Study.Study0531;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-31 10:55
 **/
public class TestDemo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("bit");
        list.add("hello");
        list.add("lambda");
//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String str) {
////简单遍历集合中的元素。
//                System.out.print(str + " ");
//            }
//        });
        list.forEach(s -> System.out.println(s + " "));

    }
}
