package JavaStudy.Practice.BookGL.operation;

import JavaStudy.Practice.BookGL.book.Book;
import JavaStudy.Practice.BookGL.book.BookList;

import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-01 16:27
 **/
public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        Scanner sc = new Scanner(System.in);
        System.out.println("输入借阅图书的名字");
        String name = sc.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)) {
                book.setBorrowed(true);
                System.out.println("借阅成功");
                return;
            }
        }
        System.out.println("没有所要借阅的图书");
    }
}
