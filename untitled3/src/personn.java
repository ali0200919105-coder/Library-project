public class BadNationalID extends Exception{
    public BadNationalID(String massage){
        super(massage);
    }
}
interface iranvalidation{
    void validNationalID(String ssn) throws BadNationalID;
}
abstract public class personn implements iranvalidation {
    String name;
    int phonnumber;
    String codmely;
    int  shomare_daneshjoee;
    public personn(String name, String codmelyy) throws BadNationalID {
        this.codmely = codmelyy;
        this.name = name;
        validNationalID(codmelyy);
    }
    @Override
    public void validNationalID(String ssn) throws BadNationalID {
        if (codmely.length() != 10 ) {
            throw new BadNationalID(   name+ " Pleas Inter Valiu NationalID");
        }
    }
    public int getShomare_daneshjoee(){
    return shomare_daneshjoee;
    }
    public void setPhonnumber(int phonnumber) {
        this.phonnumber = phonnumber;
    }
 public abstract void talk();

}
public class student extends personn {
    public student(String n, String cod) throws Exception {
        super(n , cod);
        super.setPhonnumber(45459789);
    }
    public double average(int math , int madar , int hesab) {
        double sum = 0;
        double[] grade_cours = {math,madar,hesab};
        for (double g : grade_cours) {
            sum += g;
        } return sum / grade_cours.length;
    }
    public void talk(){
        System.out.println("hello teacher \nthis is my shomare_daneshjoee = " + getShomare_daneshjoee());

    }
    @Override
    public String toString() {
        return "student= " + name + " {codmely= " + codmely + "/ phonnumber= " + phonnumber + "/ average= " +
                average(18, 15, 18) + "/ shomare_daneshjpee = " + shomare_daneshjoee+ "}";
    }
}

public class teacher extends personn {
     int rank;
     public void setRank(int rank) {
         this.rank= rank;
     }
     public teacher(String name, String cod) throws Exception {
         super(name, cod);
         super.setPhonnumber(45454545);
     }

     @Override
     public void talk() {
         System.out.println("hello ali whats your shomare_daneshjoee");
     }

     @Override
     public String toString() {
         return "teacher= " + name + " {codmely= " + codmely + "/ phonnumber= " + phonnumber +
                 "/ rank in area= " + rank + "}";
     }
 }


void main(String[] args){
     personn[] r = new personn[2];
     try{
         r[1] = new student("Ali", "4545680497");
         r[1].shomare_daneshjoee =3223;
         System.out.println(r[1]);
     }catch (Exception e){
         System.out.println(e.getMessage());
     }
     try {
         r[0] = new teacher("Haji Zade", "4545498849") ;
         /*cast*/
         ((teacher)r[0]).setRank(5);
         System.out.println(r[0]);
     }catch (Exception e){
         System.out.println(e.getMessage());
     }
    for( personn  d :r) {
        if (r[0] == null) {
            System.out.println("Rang");
        }else if (r[1] == null){
            System.out.println("Rang");
        }else
            d.talk();
    }
  }