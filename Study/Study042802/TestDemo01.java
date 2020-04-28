package JavaStudy.Study.Study042802;

/**
 * program: Java
 * description:抽象类
 * 一个方法如果被 abstract 修饰，那么这个方法就是抽象方法
 * 抽象方法可以没有具体的实现
 * 抽象类 ：包含抽象方法的类
 * <p>
 * 注意：
 * 1.抽象类不可以被实例化         Shape shape=new Shape()
 * 2.类内的数据成员和普通类没有区别
 * 3.抽象类主要用来被继承、
 * 4.如果一个类继承了抽象类，那么一定要实现抽象类的方法
 * 5.当抽象类A继承抽象类B，那么A不需要重写B的方法，但要是A被继承，那么一定还要重写这个方法
 * 6.抽象类或抽象方法不能被 final 修饰
 *
 * 抽象类和接口的区别
 *
 * author: Mx
 * create: 2020-04-28 19:43
 **/
abstract class Shape {
    /*public int age;
    private int a;

    public void func() {

    }*/

    public abstract void draw();//抽象方法

}

class Cycle extends Shape {
    @Override //重写      注解
    public void draw() {
        System.out.println("画一个⚪");
    }
}

class React extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个🔺");
    }
}

public class TestDemo01 {
    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new React();
        drawMap(shape1);
        drawMap(shape2);
    }
}
