import java.util.*;

public class InfoBook {
    int bookId ;
    String name;
    String witer;
    int price;
    int tedad;
    public  static  int  counter=1;
    public  int  barcoods = 10;
    Map<Integer, List<Integer>> map2 = new HashMap<>();
    public ArrayList<Person> persons = new ArrayList<>();



    public InfoBook( String name, String witer, int price, int tedad) {
        this.bookId=counter++;
        this.name = name;
        this.witer = witer;
        this.price = price;
        this.tedad = tedad;
    }
    public InfoBook(){

    }
    public int getBookId() {
        return bookId;
    }

    public int getTedad() {
        return tedad;
    }

    public void loan() {
        if (tedad > 0) {
            tedad--;
        }
    }


    public void showInfo() {
        System.out.println("BookId = " + bookId + ".         BookName = " + name + ".          BookWiter = " + witer + ".            BookPrice = " + price + ".          BookCount= " + tedad + "\n--------------\n");

    }
    @Override
    public String toString(){
        return  "BookId = " + bookId + ".         BookName = " + name + ".          BookWiter = " + witer + ".            BookPrice = " + price + ".          BookCount= " + tedad;
    }
    public ArrayList<Integer>  Barcods(int barcod){
        ArrayList<Integer> p = new ArrayList<>();
        for (int i = 0 ; i<barcod ; i++ ){
            p.add(barcoods++);
        }
        return p;
    }
    public void putt(int key , int y ){
        map2.put(key , Barcods(y));
    }
    public void removebarcod(int i ){
      List<Integer> b = map2.get(i);
        b.remove(0);
    }
    public void print2() {
        for (Integer b : map2.keySet()) {
            System.out.println("this:" + b + "\nLending the: " + map2.get(b) + "?????????????????");
        }}


}
