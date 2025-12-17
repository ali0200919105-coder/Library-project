abstract public class Employ implements Idintifiy ,Workable {
    protected String name;
    public Employ(String name){
        this.name = name;
    }
    public void  setName(String name){
        this.name =name;
    }
public abstract String work();
public abstract String getID();
    @Override
    public String toString(){
        return "Emloye{name= "+ name + ",id= "+ getID()+ ",work= "+ work()+"}";
    }
}

