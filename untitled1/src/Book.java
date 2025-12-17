import java.util.Objects;
public class Book {

    enum Status {
        loan, ready
    }
    private Status status;
    public void updateStatus(){
        if (tedad > 0) {
            status = Book.Status.ready;
        }else
            status = Book.Status.loan;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && tedad == book.tedad && ghafase == book.ghafase && status == book.status && Objects.equals(name, book.name) && Objects.equals(tedadsafhe, book.tedadsafhe) && Objects.equals(RITER, book.RITER);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, price, tedad, name, tedadsafhe, ghafase, RITER);
    }
    /** price ba malayt hesab shode*/
    private int price;
    private int tedad;
    private final String name;
    private Integer tedadsafhe;
    private int ghafase;
   private final String RITER;
     public Book(String name ,String RITER , int price){
         this.name = name;
         this.RITER = RITER;
         this.price = price;
     }
    public String getName() {
        return name;
    }
    public int getNewprice(int price){
         return this.price = price;
     }
     public void setTedadsafhe(int tedadsafhe){
         this.tedadsafhe = tedadsafhe;
     }
    public void setTedad(int t){
        tedad = t;
    }  public void setstatus(Status status){
        this.status =status;
    }

    public Status getStatus() {
        return status;
    }

    public void setGhafase(int gh){
        ghafase = gh;
    }
    public void loan() {
        if (tedad > 0) {
            tedad--;
            status = Status.loan;
        }
//        if (tedad <= 0) {
//            status = Status.loan;
//        }
    }
    @Override
    public String toString () {
        return "name book= " + name + "\nRiter= " + RITER + "\nprice= " + price + "\ntedadsafhe= " + tedadsafhe +
                "\nghafase= " + ghafase + "\nstatus of book= " + status ;
    }}