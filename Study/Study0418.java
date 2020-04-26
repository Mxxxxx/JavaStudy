package JavaStudy.Study;

/**
 * @program: Java
 * @description: 复杂度  构造方法
 * @author: Mx
 * @create: 2020-04-18 08:52
 **/

/**
 * 构造方法：他的方法名是和类名相同的，且没有返回值
 * 作用：实例化对象
 * 一个对象的产生，分为几步，如何产生
 * 1.为对象分配内存
 * 2.调用合适的构造方法【不止一个构造方法】
 * <p>
 * 注意：
 * 1.当没有提供构造方法的时候，会自动提供一个不带有参数的构造方法
 * 2.当自己提供了构造方法，编译器就不会提供
 * <p>
 * 【this关键字，不是代表对象，为什么？】
 * this是对象的引用，对象的产生分为两步。
 * <p>
 * this()  调用自己的构造方法    只能调用一次 ，只能放在第一行
 * this.data  调用当前对象的属性
 * this.func9()  调用对象的方法
 */
class Person1 {
    private String name;
    private int age;

    private static int count;

    public void eat() {
        System.out.println(this.getName());
        System.out.println(this.age);
    }

    //构造方法
    public Person1() {
      //  this("李明", 15);

        System.out.println("不带参数构造方法调用");
    }

    public Person1(String name, int age) {

//        this.name = name;
//        this.age = age;
        System.out.println("带参数构造方法调用");
    }

    {     //实例代码块
        count = 10;
        this.name = "李明";
        System.out.println("实例代码块");
    }

    static { //静态代码块
        /**静态内容  --》最早被初始化，且只出现一次
         * 静态内容，根据定义顺序依次执行
         */
        count = 20;
        System.out.println("静态代码块");
    }

    public static void func2() {
        count = 99;
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

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Study0418 {
    public static void main(String[] args) {
        Person1 per=new Person1();
        Person1.func2();//匿名对象，只能用一次
    }
    public static void main1(String[] args) {
        Person1 per1 = new Person1();
       System.out.println("**********");
//        Person1 per2 = new Person1();
        Person1 per2 = new Person1("12", 15);


    }
}
