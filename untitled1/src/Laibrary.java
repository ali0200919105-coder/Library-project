import java.util.*;

public abstract class Laibrary {


    public Book CraetBook(String name , String RITER , int price , int tedad ,
                          int tedadsafhe , int shomareghafase) {
        Book book;
        book = new Book(name , RITER , price);
        book.setTedadsafhe(tedadsafhe);
        book.setGhafase(shomareghafase);
        book.setTedad(tedad);
        book.updateStatus();
        return book;
    }
    public List<Book> ListofBook(){
        List<Book> y = new ArrayList<>();
       Book book1 = CraetBook("Math", "Ghasem Daraby", 1000 , 1 , 500 , 5);
       Book book2 = CraetBook("Nahjol", "Hasan Hosiny", 2000 , 3 , 1000 , 45);
       y.add(book1);
       y.add(book2);
       return y;
    }
   // protected abstract void Form();
    protected abstract void Lending(Book b, String name);
    protected abstract void print();
}
