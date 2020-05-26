package JavaStudy.Study.Study0526;

import java.util.Comparator;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-26 09:56
 **/
public class ScoreComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.score - o2.score;
    }
}
