package JavaStudy.Practice.BookGL.operation;

import JavaStudy.Practice.BookGL.book.Book;
import JavaStudy.Practice.BookGL.book.BookList;

import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-01 16:26
 **/
public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        System.out.println("输入删除图书的名字");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int i = 0;
        for (; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)) {
                break;
            }
        }
        if (i == bookList.getUsedSize()) {
            System.out.println("没有这本书");
        }
        //删除
        for (int pos = i; pos < bookList.getUsedSize() - 1; pos++) {
            Book book = bookList.getBooks(pos + 1);
            bookList.setBooks(pos, book);
        }
        bookList.setUsedSize(bookList.getUsedSize() - 1);
    }
}
