import java.util.*;
import java.util.Scanner;
public abstract class Laibrary {
    List<Book> y = new ArrayList<>();
    public Book book;
    public Book book1;
    public void CraetBook() {
        book = new Book("Math", "Ghasem Daraby", 1000);
        book.setTedadsafhe(500);
        book.setGhafase(2);
        book.setTedad(1);
        book.updateStatus();
        y.add(book);
        book1 = new Book("Nahjol", "Hasan Hosiny", 2000);
        book1.getNewprice(1999);
        book1.setTedadsafhe(1000);
        book1.setGhafase(45);
        book1.setTedad(2);
        book1.updateStatus();
        y.add(book1);
    }
    protected abstract void Form();
}
