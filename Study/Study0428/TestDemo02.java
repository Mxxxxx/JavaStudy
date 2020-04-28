package JavaStudy.Study.Study0428;

/**
 * @program: Java
 * @description:理解多态
 * @author: Mx
 * @create: 2020-04-28 18:56
 * <p>
 * 多态
 * 发生前提：
 * 1.父类引用子类对象
 * 2.父类和子类有同名的覆盖方法
 * 3.通过父类引用，调用重写的方法的时候，
 **/
class Shape {
    public void draw() {
        System.out.println("父类方法");
    }
}

class Cycle extends Shape {
    @Override //重写      注解
    public void draw() {
        //super.draw();
        System.out.println("画一个⚪");
    }
}

class React extends Shape {
    @Override
    public void draw() {
     //   super.draw();
        System.out.println("画一个♦");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
      //  super.draw();
        System.out.println("画一个🔺");
    }
}


public class TestDemo02 {
    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Shape shape1 = new Cycle();//向上引用
        Shape shape2 = new React();
        // shape1.draw(); //重写了 调用子类中的draw方法
        //shape2.draw();
        drawMap(shape1); //多态
        drawMap(shape2);
        Shape shape3 = new Triangle();
        drawMap(shape3);
    }
}
