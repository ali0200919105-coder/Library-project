import java.util.*;

public class InfoBook  {
    int bookId ;
    String name;
    String witer;
    int price;
    int tedad;
    public  static int barcoods = 10;
    public  static  int  counter = 1;

    ArrayList<Barcods> p = new ArrayList<>();

    public InfoBook( String name, String witer, int price, int tedad) {
        this.bookId=counter++;
        this.name = name;
        this.witer = witer;
        this.price = price;
        this.tedad = tedad;
        for (int i = 1 ; i<=tedad ; i++ ) {
            p.add(new Barcods(barcoods++));
        }
    }

    public void removebarcod(){
        p.removeFirst();

    }

    public int getBookId() {
        return bookId;
    }

    public int getTedad() {
        return tedad;
    }

    public String getName() {
        return name;
    }

    public String getWiter() {
        return witer;
    }

    public int getPrice() {
        return price;
    }

    public void loan() {
        if (tedad > 0) {
            tedad--;
        }
    }



    public void showInfo() {
        System.out.println("BookId = " + bookId + ".         BookName = " + name + ".          BookWiter = " + witer + ".            BookPrice = " + price + ".          BookCount= " + tedad + "--------------\n");

    }
    @Override
    public String toString(){
        return  "BookId = " + bookId + ".         BookName = " + name + ".          BookWiter = " + witer + ".            BookPrice = " + price + ".          BookCount= " + tedad  + "--------------";
    }
    public void print2() {
        System.out.println("this bookID:" + getBookId()+ "\nBarcods: " + p + "?????????????????");
    }

    }



