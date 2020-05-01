package JavaStudy.Practice.BookGL;

import JavaStudy.Practice.BookGL.book.BookList;
import JavaStudy.Practice.BookGL.user.AdminUser;
import JavaStudy.Practice.BookGL.user.NormalUser;
import JavaStudy.Practice.BookGL.user.User;

import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-01 16:14
 **/
public class TestBook {
    public static User login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入姓名");
        String name = sc.nextLine();
        System.out.println("输入身份");
        System.out.println("1-》管理员      2.-》普通用户");
        int choice = sc.nextInt();
        if (choice == 1) {
            return new AdminUser(name);
        } else {
            return new NormalUser(name);
        }

    }

    public static void main(String[] args) {
        //准备书籍
        BookList bookList = new BookList();
        //登录
        User user = login();
       // user.menu();
        while (true) {
            int choice = user.menu();//选择是几，就可以对应哪个方法
            user.doOperation(bookList, choice);
        }
    }
}
