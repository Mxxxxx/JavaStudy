package JavaStudy.Study.Study0526;

/**
 * @program: Java
 * @description:内部类 1.实例内部类
 * 2.静态内部类
 * 3.匿名内部类
 * @author: Mx
 * @create: 2020-05-26 11:16
 * <p>
 * 1.如何拿到实例内部类的对象
 * <p>
 * 2.实例内部类是否由额外的开销
 * 有，实力内部类包含外部类的this
 **/
class OuterClass {
    public int data1 = 1;
    public static int data2 = 2;

    //实例内部类: 可以看作是一个普通的实例数据成员
    class InnerClass {
        public int data1 = 11;//局部变量优先
        public int data3 = 3;
        // 不能写静态 public static int a = 12;不依赖于对象
        public static final int a = 0;//加上final，编译时期确定的值就可以，

        public void func() {
            System.out.println(this.data1);//可以访问外部类的成员
            System.out.println(OuterClass.this.data1);//可以访问外部类的成员
            System.out.println(data2);//可以访问外部类的成员
            System.out.println(data3);//可以访问外部类的成员
            System.out.println("实例内部类的调用 InnerClass");
        }
    }
}

public class TestDemo05 {
    public static void main(String[] args) {
        //通过外部类调用内部类对象
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.func();
    }
}
