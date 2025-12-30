import com.sun.tools.javac.util.List;

import java.util.ArrayList;

public abstract class Person {
    public ArrayList<InfoBook> Books = new ArrayList<>();

    public   int personId;
    String name;
    int age;
    public  static  int  counter=1;
    @Override
    public String toString(){
        return "Person Id = "+personId+".        Name = "+getName()  + "           Age = " + getAge()+"\n-----------------";
    }
    public Person( String name, int age) {
        this.personId=counter++;
        this.name = name;
        this.age = age;
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


}
