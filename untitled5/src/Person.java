import com.sun.tools.javac.util.List;

import java.util.ArrayList;
interface addbook{
    public void addbok();
    public void addperson();
}
public abstract class Person {

    public ArrayList<InfoBook> Borowbooks = new ArrayList<>();


    public   int personId;
    String name;
    int age;
    public  static  int  counter=1;

    public Person( String name, int age) {
        this.personId=counter++;
        this.name = name;
        this.age = age;
    }

    protected Person() {
    }

    public void lendbook(InfoBook book){
        Borowbooks.add(book);
    }

    public abstract void showInfo();

    public int getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return "Person Id = "+personId+".        Name = "+getName()  + "           Age = " + getAge()+"\n-----------------";
    }

}
