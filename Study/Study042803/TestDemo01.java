package JavaStudy.Study.Study042803;

/**
 * program: Java
 * description:接口  interface
 * 1.接口当中的方法都是抽象方法
 * 2.其实可以有具体实现的方法。这个方法是被 default 修饰
 * 3.接口中定义的成员变量，默认为常量
 * 4.成员变量默认 public static final
 * 5.成员方法默认 public abstract
 * 6.接口不可以被实例化
 * 7.接口和类之间的关系 implements
 * 8.为了解决单继承的问题，可以实现多个接口
 * 9.只要这个类实现了该接口，那么你就可以进行向上转型
 * author: Mx
 * create: 2020-04-28 20:03
 **/
interface Shape {
    public static final int a = 10;

    //public abstract
    void draw();

    default void func() {
        System.out.println();
    }
}

class Cycle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个⚪");
    }
}

class React implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个♦");
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
    }
}
