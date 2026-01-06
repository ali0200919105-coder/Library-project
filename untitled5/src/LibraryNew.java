import java.util.*;
public class LibraryNew {
    public ArrayList<Person> persons = new ArrayList<>();
    public ArrayList<InfoBook> Books = new ArrayList<>();


    public void addbook(InfoBook o ) {
        Books.add(o);
    }

    public void addPerson(Person o ) {
        persons.add(o);
    }
    protected void Lending(Person b , InfoBook chos) {
        b.lendbook(chos);
    }
    public void Search(String searching) {
        for (InfoBook o : Books) {

            if (o.getName().equals(searching)) {
                System.out.println("این کتاب موجود میباشد");
                System.out.println("BookId = " + o.getBookId() + "   BookName = "+ o.getName() + "  BookWiter = " + o.getWiter() + "  BookPrice = "+ o.getPrice());
            }else System.out.println("این کتاب موجود نمیباشد");
        }
    }


}


