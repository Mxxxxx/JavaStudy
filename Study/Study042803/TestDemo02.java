package JavaStudy.Study.Study042803;

/**
 * @program: Java
 * @description:多继承
 * @author: Mx
 * @create: 2020-04-28 20:22
 **/
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}

interface IFlying {
    void flying();
}

interface IRunning {
    void run();
}

interface ISwimming {
    void swim();
}

//一个类可以继承一个普通类/抽象类，可以实现多个接口
class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("猫咪跑步");
    }
}

class Robot implements IRunning, IFlying, ISwimming {
    @Override
    public void flying() {
        System.out.println("机器人飞");
    }

    @Override
    public void run() {
        System.out.println("机器人跑");
    }

    @Override
    public void swim() {
        System.out.println("机器人游泳");
    }
}

public class TestDemo02 {
    public static void walk(IRunning iRunning) {
        iRunning.run();
    }

    public static void swim(ISwimming iSwimming) {
        iSwimming.swim();
    }

    public static void main(String[] args) {
        IRunning iRunning = new Robot();
        walk(iRunning);
        IRunning iRunning1 = new Cat("小猫");
        walk(iRunning1);
        ISwimming iSwimming = new Robot();
        swim(iSwimming);

    }
}
