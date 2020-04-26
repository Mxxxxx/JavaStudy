package JavaStudy.Practice;


/**
 * @program: Java
 * @description: 类的练习
 * @author: Mx
 * @create: 2020-04-17 09:55
 **/
class Student {
    private String name;
    private int age;
    private char sex;
    public static int a;
    public static int b;

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Student.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        Student.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void print() {
        System.out.println("我的名字是" + this.name + "," + "年龄是：" + this.age + "，性别是:" + this.sex);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public static int sum(int x, int y) {

        return a + b + x + y;
    }
}

public class practice0417 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(18);
        stu.setName("李明");
        stu.setSex('男');
        Student.setA(1);
        Student.setB(2);
        stu.print();
        System.out.println(stu.toString());
        System.out.println(Student.sum(1, 2));
    }
}
