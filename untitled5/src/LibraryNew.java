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
//    public void print() {
//        for (Person b : map.keySet()) {
//            System.out.println("this:" + b + "\nLending the: " + map.get(b) + "\n///////////////////////////////////////////\n");
//        }}




}


