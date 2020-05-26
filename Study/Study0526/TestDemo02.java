package JavaStudy.Study.Study0526;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * 自定义类型为什么要实现可以比较呢？
 *
 *  @create: 2020-05-26 09:24
 **/
class Student implements Comparable<Student> {
    public String name;
    public int age;
    public int score;

    @Override
    public int compareTo(Student o) {
        // return this.age - o.age;
        //缺点：每次业务不同需要修改类本身
        return this.score - o.score;
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}

public class TestDemo02 {
    public static void main(String[] args) {
        Student student1 = new Student("bit", 15, 89);
        Student student2 = new Student("hi", 16, 66);
        if (student1.compareTo(student2) > 0) {
            System.out.println("stu1>stu2 ");
        } else {
            System.out.println("stu1<stu2 ");
        }

    }
}
