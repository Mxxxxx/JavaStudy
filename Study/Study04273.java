package JavaStudy.Study;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-04-27 20:09
 **/
class Animal1 {

    protected String name;

    public Animal1(String name) {
        this.name = name;
        System.out.println("父类的构造");
    }

    public void eat() {
        System.out.println(this.name + " animal eat");
    }
}

class Cat1 extends Animal1 {
    protected int count;

    public Cat1(String name) {
        super(name);
        System.out.println("Cat 的构造");
    }

    public void eat() {
        System.out.println(this.name + " cat eat");
    }

}

class Bird1 extends Animal1 {
    public Bird1(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(this.name + "bird fly");
    }
}

public class Study04273 {
    public static Animal1 func() {
        return new Cat1("咪咪");
    }

    public static void func1(Animal1 animal1) {
        animal1.eat();
    }

    public static void main1(String[] args) {
        // Animal1 animal1=new Animal1("豆豆");
        //Cat1 cat1=new Cat1("小猫");

        //向上转型  将子类赋值给父类  父类引用 引用子类对象
        //发生情况：
        //1.直接赋值
        //2.传参
        //3.返回值

        //1.
        System.out.println("直接赋值");
        Animal1 animal = new Cat1("咪咪");
        Animal1 animal2 = new Bird1("小鸟");
        animal.eat();
        System.out.println("**********");


        //2.
        System.out.println("传参");
        Cat1 cat1 = new Cat1("咪咪");
        func1(cat1);
        System.out.println("**********");

        //3.
        System.out.println("返回值");
        Animal1 animal1 = func();
        animal1.eat();
        System.out.println("**********");

    }

    //多态
    //重写 overwrite             重载   overload
    // 1.方法名相同                  1.same
    //2.返回值相同                   2.same
    //3.参数列表相同                 3.same
    //4.不同的类-》继承关系           4.同类中
    //  运行时绑定:
    //父类引用子类对象  同时通过父类引用调用同名的覆盖方法，发生绑定

    //重写的方法，不能是被final修饰的。被其修饰是密封的
    public static void main2(String[] args) {
        Animal1 animal1 = new Cat1("咪咪");
        animal1.eat();
    }

    //向下转型
    public static void main(String[] args) {
        Animal1 animal1=new Bird1("鸡");
        animal1.eat();
        //父类的引用 赋值给了子类
        Bird1 bird1=(Bird1)animal1;
        bird1.fly();
    }
}
