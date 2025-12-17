interface Nameble{
    String getnameobject();
}
interface CanThink{
    String think();
}
interface CanTalk extends CanThink{
    String talk();
}
public class persoon extends Namedobject
implements Nameble,CanTalk{
    public persoon(String name) {
        this.name = name;
    }
    public String talk(){
        return "hello Ali";
    }
    public String think(){
       return "selling";
    }
    public String getnameobject(){
        return nameobject= "pofak";
    }
    @Override
    public String toString(){
        return name + ":\n" +talk()+ "(he think to "+ think()+" "+ nameobject + ")";
    }
    }
    public class student extends persoon{
        public String talk(){
           return "hello man";
        }
        public String think(){
            return "buying";
        }
        public student(String name){
         super(name);
        }
        public String getnameobject(){
            return nameobject= "pofak";
        }
        @Override
        public String toString(){
            return name + ":\n" +talk()+ "(he think to "+ think()+ " " + nameobject + ")";
        }
    }
void main() {
    persoon p = new persoon("Foroshande");
    p.getnameobject();
    System.out.println(p);
    persoon p2 = new student("Ali");
    p2.getnameobject();
    System.out.println(p2);
}


