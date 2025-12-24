import java.util.Objects;
interface loan{
void loan();
}
public class Book implements loan {
    enum Status {
        loan, ready
    }
    private Status status;
    public void updateStatus(){
        if (tedad > 0) {
            status = Status.ready;
        }else
            status = Status.loan;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Price == book.Price && tedad == book.tedad && ghafase == book.ghafase && status == book.status && Objects.equals(NameBook, book.NameBook) && Objects.equals(tedadsafhe, book.tedadsafhe) && Objects.equals(RITER, book.RITER);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, Price, tedad, NameBook, tedadsafhe, ghafase, RITER);
    }
    /** price ba malayt hesab shode*/
    private int Price;
    private int tedad;
    private final String NameBook;
    private Integer tedadsafhe;
    private int ghafase;
   private final String RITER;
     public Book(String name ,String RITER , int price){
         this.NameBook = name;
         this.RITER = RITER;
         this.Price = price;
     }
    public String getNameBook() {
        return NameBook;
    }
    public int getNewprice(int price){
         return this.Price = price;
     }
     public void setTedadsafhe(int tedadsafhe){
         this.tedadsafhe = tedadsafhe;
     }
    public void setTedad(int t){
        tedad = t;
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
    }
    @Override
    public String toString () {
        return "name book= " + NameBook + "\nRiter= " + RITER + "\nprice= " + Price + "\ntedadsafhe= " + tedadsafhe +
                "\nghafase= " + ghafase + "\nstatus of book= " + status ;
    }}