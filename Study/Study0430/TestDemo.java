package JavaStudy.Study.Study0430;

/**
 * @program: Java
 * @description: 空接口 ：标记接口，标记这个类可以进行克隆
 * 1.实现接口
 * 2.重写克隆
 * @author: Mx
 * @create: 2020-04-30 18:42
 **/
class Test implements Cloneable {
    public int a;
    Money money = new Money();

    //重写克隆方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //浅拷贝
        // return super.clone();

        //深拷贝
        //1.克隆Test
        Test test1 = (Test) super.clone();
        //2.克隆当前对象Money
        test1.money = (Money) this.money.clone();
        return test1;
    }
}

class Money implements Cloneable {
    double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Test test1 = new Test();
        Test test2 = (Test) test1.clone();
        System.out.println(test1.money.money);

        test2.money.money = 9.0;
        System.out.println(test2.money.money);
//        System.out.println(test1.a);
//        System.out.println(test2.a);
//        System.out.println("*****");
//        test2.a = 10;
//        System.out.println(test1.a);
//        System.out.println(test2.a);

    }
}
