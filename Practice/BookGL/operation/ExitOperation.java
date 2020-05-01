package JavaStudy.Practice.BookGL.operation;

import JavaStudy.Practice.BookGL.book.BookList;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-01 16:27
 **/
public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(0);
    }
}
