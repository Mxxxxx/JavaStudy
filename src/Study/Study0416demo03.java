package Study;

/**
 * @program: Java
 * @description: 封装
 * @author: Mx
 * @create: 2020-04-16 20:56
 **/
class Student {
    // private 限定只能在类中访问
    //this 当前对象的引用
    private String name;
    private int age;

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

    //提供一个公开接口
//    public String getMyName() {
//        return this.Myname;
//    }
//
//    public void setMyName(String Myname) {
//        this.Myname = Myname;
//    }

    public void func1() {
        System.out.println("哈哈");
    }

    public void show() {
        System.out.println("我叫" + this.name + ",今年" + this.age + "岁");
    }

    @Override//方法重写
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//以上是类的实现者写的代码
//以下是类的调用者写的
public class Study0416demo03 {

    public static void main(String[] args) {
        Student st = new Student();
        st.setAge(15);
        st.setName("李明");
        System.out.println(st);
    }
}
