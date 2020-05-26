package JavaStudy.Study.Study0526;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-26 11:11
 **/
class Animal {

    public void func() {
        System.out.println("Animal：：func");
    }
}

public class TestDemo04 {
    public static void main(String[] args) {
        //匿名内部类
        new Animal() {
            @Override
            public void func() {
                System.out.println("重写方法");
            }
        }.func();
    }
}
