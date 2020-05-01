package JavaStudy.Practice.BookGL.operation;

import JavaStudy.Practice.BookGL.book.Book;
import JavaStudy.Practice.BookGL.book.BookList;

import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-01 16:28
 **/
public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        System.out.println("输入归还图书的名字");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)) {
                book.setBorrowed(false);
                System.out.println("归还成功");
                System.out.println(book);
                return;
            }
        }
        System.out.println("该图书不属于图书馆");
    }
}
