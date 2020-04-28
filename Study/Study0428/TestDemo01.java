package JavaStudy.Study.Study0428;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-04-28 18:40
 **/
class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + "正在吃 ");
    }

}

class Cat extends Animal {

    public String huzi;

    public Cat(String name, String huzi) {
        super(name);//帮助父类构造
        this.huzi = huzi;
    }

    public void eat() {
        System.out.println(this.name + "正在吃 cat");
    }

    public void func() {
        System.out.println(this.name);
    }
}

public class TestDemo01 {
    public static void main(String[] args) {
        //Cat cat = new Cat();
        //cat.eat();
        Animal animal = new Cat("小子", "胡子");//父类引用子类对象   向上转型
        animal.eat();//调用 Animal 的 eat（） 方法，运行时调用了 Cat 的 eat（） 方法。         运行时多态（动态绑定）

    }

}
