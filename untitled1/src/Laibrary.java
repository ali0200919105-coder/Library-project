import java.util.*;
import java.util.Scanner;
public class Laibrary {
    Map<Book, String> map = new HashMap<>();
  //  public Laibrary(Book book, String GetID2 ) {
    //    map.put(book, GetID2);
    //}
    List<Book> y = new ArrayList<>();
    List<Person> t = new ArrayList<>();
    Scanner ID = new Scanner(System.in);
public void sort(){
    // Laibrary information = new Laibrary();
    Book book = new Book("Math", "Ghasem Daraby", 1000);
    book.setTedadsafhe(500);
    book.setGhafase(2);
    book.setTedad(1);
    book.updateStatus();
    y.add(book);
    Book book1 = new Book("Nahjol", "Hasan Hosiny", 2000);
    book1.getNewprice(1999);
    book1.setTedadsafhe(1000);
    book1.setGhafase(45);
    book1.setTedad(2);
    book1.updateStatus();
    y.add(book1);
        for (int i = 0 ; i<=0 ; i++ ){
            Person p = Persondate.personal();
            if (t != null){
                t.add(p);
            String YourID = p.name;
            // int YourID=ID.nextInt();
            System.out.println("choos a book :\n1_"+ book.getName() + "\n2_" + book1.getName());
            int choos = ID.nextInt();
            switch (choos){
                case 1:
                    if (book.getStatus() == Book.Status.ready){
                        book.loan();
                        map.put(book, YourID);

                    }else System.out.println("We dont have this book");
                    break;
                case 2:
                    if (book1.getStatus() == Book.Status.ready){
                        book1.loan();
                        map.put(book1,YourID);

                    }else System.out.println("We dont have this book now");
                    break;
                default: System.out.println("pleas Select a book that is available");
            }}}
       for (Book b : map.keySet()) {
           String userName = map.get(b);
           System.out.println(b + " \nID person = " + userName);
           for (Person p : t) {
               if (p.name.equals(userName)) {
                   System.out.println( "Full ID = " + p.toString());
                   break;
               }
           }}
   }}
