package JavaStudy.Study.Study0526;

import java.util.Comparator;

/**
 * @program: Java
 * @description:比较器
 * @author: Mx
 * @create: 2020-05-26 09:52
 **/
public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.age - o1.age;
    }

}

//public class AgeComparator implements Comparable<Person> {
//    @Override
//    public int compareTo(Person o) {
//        return 0;
//    }
//}
