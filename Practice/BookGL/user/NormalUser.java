package JavaStudy.Practice.BookGL.user;

import JavaStudy.Practice.BookGL.operation.*;

import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-01 16:32
 **/
public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.iOperations = new IOperation[]{
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
                new ExitOperation(),
        };
    }

    @Override
    public int menu() {
        System.out.println("======================================");
        System.out.println("欢迎 " + this.name + " 来到图书管理系统");
        System.out.println("             0.查找图书");
        System.out.println("             1.借阅图书");
        System.out.println("             2.归还图书");
        System.out.println("             3.退出管理系统");
        System.out.println("======================================");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }
}
