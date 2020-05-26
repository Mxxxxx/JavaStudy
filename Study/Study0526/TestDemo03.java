package JavaStudy.Study.Study0526;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @program: Java
 * @description: 比较器
 * @author: Mx
 * @create: 2020-05-26 09:45
 **/
class Person {
    public String name;
    public int age;
    public int score;

    public Person(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}

public class TestDemo03 {
    public static void main(String[] args) {
        AgeComparator ageComparator = new AgeComparator();
        PriorityQueue<Person> people = new PriorityQueue<>(ageComparator);
        people.offer(new Person("bit", 15, 89));
        people.offer(new Person("bt", 14, 29));
        System.out.println(people);
    }

    public static void main2(String[] args) {
        Person person1 = new Person("bit", 15, 89);
        Person person2 = new Person("hi", 16, 66);
        Person person3 = new Person("ci", 17, 56);
        Person[] person = new Person[3];
        person[0] = person1;
        person[1] = person2;
        person[2] = person3;
        AgeComparator ageComparator = new AgeComparator();
        ScoreComparator scoreComparator = new ScoreComparator();

        Arrays.sort(person, ageComparator);//年龄比较器
        System.out.println(Arrays.toString(person));

        Arrays.sort(person, scoreComparator);//分数比较器
        System.out.println(Arrays.toString(person));
    }

    public static void main1(String[] args) {
        Person person1 = new Person("bit", 15, 89);
        Person person2 = new Person("hi", 16, 66);

        AgeComparator ageComparator = new AgeComparator();
        System.out.println(ageComparator.compare(person1, person2));

        ScoreComparator scoreComparator = new ScoreComparator();
        System.out.println(scoreComparator.compare(person1, person2));
    }
}
