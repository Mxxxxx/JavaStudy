package JavaStudy.Practice.BookGL.operation;

import JavaStudy.Practice.BookGL.book.Book;
import JavaStudy.Practice.BookGL.book.BookList;

import java.util.Arrays;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-01 16:27
 **/
public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("显示所有图书");
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBooks(i);
            System.out.println(book);
        }
    }
}
