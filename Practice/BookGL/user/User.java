package JavaStudy.Practice.BookGL.user;

import JavaStudy.Practice.BookGL.book.BookList;
import JavaStudy.Practice.BookGL.operation.IOperation;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-01 16:33
 **/
public abstract class User {
    protected String name;
    protected IOperation[] iOperations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(BookList bookList,int choice) {
        this.iOperations[choice].work(bookList);
    }
}
