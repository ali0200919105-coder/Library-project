import java.util.*;


public class LibraryNew {
    Map<Person, InfoBook> map = new HashMap<>();
    public ArrayList<InfoBook> Books = new ArrayList<>();
    public ArrayList<Person> persons = new ArrayList<>();

    public void addPerson(Person o ) {
        persons.add(o);
    }

    public  void addbooks(InfoBook p){
        Books.add(p);
}
    protected void Lending(Person b , InfoBook chos) {
        map.put(b, chos);
    }
    public void print() {
        for (Person b : map.keySet()) {
            System.out.println("this:" + b + "\nLending the: " + map.get(b) + "\n///////////////////////////////////////////\n");
        }}




}


