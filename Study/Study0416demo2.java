package JavaStudy.Study;

/**
 * @program: Java
 * @description: 类和对象
 * @author: Mx
 * <p>
 * <p>
 * OO语言的三大特征 （面向对象语言）
 * 继承、封装、多态
 * @create: 2020-04-16 19:25
 * <p>
 * 类： 自定义类型  模板            通过一个类，可以产生多个对象
 * 找对象--创对象--使用对象
 * 对象：实体
 * 面向对象：
 **/
//public : 访问修饰 限定符[公共有的]
//private  私有
//proected  受保护
//什么都不写 ：默认权限-》包访问权限
class Person {
    //字段-》成员变量    定义在方法外面，类里面
    //实例成员变量：对象里面
    String name = "小红";
    int age = 15;
    //静态成员变量:不在对象里面  属于类Person  只有一份
    public static int size = 10;

    //方法-》行为
    //实例成员方法
    public void eat() {
        int a = 10;  //局部变量
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void show() {
        fun();//实例方法内可以调用静态方法
        System.out.println("我叫" + name + ",今年" + age + "岁");
    }

    //静态方法
    public static void fun() {
        //静态方法内部，不能访问非静态的数据成员
        size=20;
        System.out.println("静态");
    }
}

class Test {
    public int a;
    public static int count;
}

public class Study0416demo2 {
    //实例对象 放在 堆中
    //静态对象 放在方法区
    public static void main(String[] args) {

    }
//    public static void main(String[] args) {
//        Test t1 = new Test();
//        t1.a++;
//        Test.count++; //静态 只有一份，在方法区
//        System.out.println(t1.a);
//        System.out.println(Test.count);
//        Test t2 = new Test();
//        t2.a++;
//        Test.count++;
//        System.out.println(t1.a);
//        System.out.println(Test.count);
//    }
    //实例成员方法使用
//    public static void main(String[] args) {
//        Person person1 = new Person();
//        person1.eat();
//        person1.sleep();
//        //静态成员方法
//        Person.fun();
//        person1.show();
//    }
    //静态成员使用  属于类
    //存放在方法区
//    public static void main(String[] args) {
//        Person person1 = new Person();
//        System.out.println(Person.size);
//    }
}
//public class Study0416demo2 {
//    public static void main(String[] args) {
//        //对象实例化  通过关键字new
//        Person person1 = new Person();
//        Person person2 = new Person();
//
//        //访问对象当中的实例对象
//        // 实例成员->没有初始化，默认值为对应0， 引用类型：null   简单类型：0
//        //char-》'\u0000'    boolean->'false'
//        person1.age = 15;
//        person1.name = "李明";
//        System.out.println(person1.name+" "+person1.age);
//
//    }

