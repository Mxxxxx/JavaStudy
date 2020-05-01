package JavaStudy.Practice.BookGL.operation;

import JavaStudy.Practice.BookGL.book.Book;
import JavaStudy.Practice.BookGL.book.BookList;

import java.util.Scanner;

/**
 * @program: Java
 * @description:新增图书
 * @author: Mx
 * @create: 2020-05-01 16:26
 **/
public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书");
        Scanner sc = new Scanner(System.in);
        System.out.println("输入图书的名字");
        String name = sc.nextLine();
        System.out.println("输入图书的作者");
        String author = sc.nextLine();
        System.out.println("输入图书的价格");
        int price = sc.nextInt();
        System.out.println("输入图书的种类");
        String type = sc.next();
        Book book = new Book(name, author, price, type);
        int curSize = bookList.getUsedSize();
        bookList.setBooks(curSize, book);
        bookList.setUsedSize(curSize + 1);
        System.out.println("新增成功");

    }
}
