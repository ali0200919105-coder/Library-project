interface Idintifiy{
    String getID();
}
interface Workable{
    String work();
}
public class Manager extends Employ {
    public Manager(String name){
        super(name);
    }
public String work(){
    return "Managing team";
}
public String getID(){
    return "MNG_"+ name;
}
}
class Developer extends Employ{
    public Developer(String name){
        super(name);
    }
    @Override
    public String work(){
        return "writing code";
    }
    @Override
    public String getID() {
        return "DEV_"+ name;
    }
     static void main(String[] args){
        Employ u = new Manager("Kazem");
        u.setName("Kz");
       Employ u2 = new Developer("Mandana");
        System.out.println(u);
        System.out.println(u2);
     Idintifiy k = new Manager("Rahmat");
     Workable l = new Developer("Jak");
     System.out.println(k.getID());
     System.out.println(l.work());

    }

}