package Practice;

/**
 * @program: Java
 * @description: 类
 * @author: Mx
 * @create: 2020-04-15 15:05
 **/
class Persom {
    //成员变量
    public String name;
    public int num;
    public char sex;

    //成员方法
    public void sleep() {
        System.out.println("睡觉");
    }
}

public class practice {

    public static void main(String[] args) {
        Persom p1 = new Persom();
        p1.name="李明明";
        p1.num=123456;
        p1.sex='男';
        System.out.println(p1.num);
        p1.sleep();
    }
}
