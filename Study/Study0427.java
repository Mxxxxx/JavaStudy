package JavaStudy.Study;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-04-27 18:27
 **/

//继承
//一旦一个类被final修饰，那么这个类不能被继承
class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("父类的构造");
    }

    public void eat() {
        System.out.println(this.name + " animal eat");
    }
}

//猫类继承动物类
// cat :子类（派生类）      Animal: 父类（基类、超类）
//子类继承了除构造方法外所有的
//在Java中， 继承只能 一个类
//父类中private 无法访问

//子类 在构造时，要先帮助 父类 进行构造
class Cat extends Animal {
    //    public String name;
//
//    public void eat() {
//        System.out.println("cat eat");
//    }
    public Cat(String name) {
        super(name);  //首先调用父类的构造方法
        //this 和 super的区别
        System.out.println("Cat 的构造");
        //this（当前对象的引用）              super（父类对象的引用）
        //this()  调用本类其他的构造方法       super(); 调用符类的构造方法
        //this.data  访问当前类中的属性       super.data;  访问父类的属性
        //this.func()  调用本类的其他成员方法   super.func()访问父类的成员方法
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(this.name + "bird fly");
    }
}

public class Study0427 {
    public static void main(String[] args) {
        Cat cat = new Cat("咪咪");
        //   cat.name = "咪咪";
        cat.eat();
        Bird bird = new Bird("小鸡");
        bird.fly();
    }
}
