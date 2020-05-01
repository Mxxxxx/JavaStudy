package JavaStudy.Practice.BookGL.book;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-01 16:18
 **/
public class BookList {
    private Book[] books = new Book[100];
    private int usedSize = 0;

    public BookList() {
        books[0] = new Book("西游记", "吴承恩", 56, "小说");
        books[1] = new Book("水浒传", "施耐庵", 66, "小说");
        books[2] = new Book("红楼梦", "曹雪芹", 36, "小说");
        this.usedSize = 3;
    }

    public void setBooks(int pos, Book book) {
        this.books[pos] = book;
    }

    public Book getBooks(int pos) {
        return books[pos];
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
