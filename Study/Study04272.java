package JavaStudy.Study;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-04-27 18:49
 **/
class Base {
     int a; //默认权限--》包访问权限，只能在同一个包访问
}

public class Study04272 {
    public static void main(String[] args) {
        Base base= new Base();
        base.a = 10;
    }

}
