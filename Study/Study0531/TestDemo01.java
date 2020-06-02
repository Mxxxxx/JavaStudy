package JavaStudy.Study.Study0531;

/**
 * @program: Java
 * @description: Lambda
 * @author: Mx
 * @create: 2020-05-31 10:19
 **/
//函数式接口
@FunctionalInterface
//无返回值无参数
interface NoParameterNoReturn {
    void test();//只能一个抽象方法
}

//无返回值一个参数
@FunctionalInterface
interface OneParameterNoReturn {
    void test(int a);
}

//无返回值多个参数
@FunctionalInterface
interface MoreParameterNoReturn {
    void test(int a, int b);
}

//有返回值无参数
@FunctionalInterface
interface NoParameterReturn {
    int test();
}

class Test {
    public void func() {
        System.out.println("func()");
    }
}

public class TestDemo01 {
    public static void main1(String[] args) {
        NoParameterNoReturn noParameterNoReturn = () -> {
            System.out.println("无参数无返回值");
        };
        noParameterNoReturn.test();
        MoreParameterNoReturn moreParameterNoReturn = (a, b) -> System.out.println("无返回值多个参数" + a + b);
        moreParameterNoReturn.test(1, 2);
    }

    //匿名内部类的变量捕获

    public static void main(String[] args) {
        int a = 100;
        new Test() {
            @Override
            public void func() {
                System.out.println("我是捕获到变量 a == " + a
                        + " 我是一个常量，或者是一个没有改变过值的变量！");
                System.out.println("重写");
            }
        };
    }
}
