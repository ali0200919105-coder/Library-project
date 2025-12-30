import java.util.Scanner;
public abstract class Persondate  {
    String name;
    int age;
    public int d;
    public int m;
    public int y;
    final static int this_year = 1404;
    @Override
    public String toString(){
        return name + "(" + y + "/" + m + "/" + d + ")\n" + "age= " + age;
    }
    public static Persondate personal(){
        Persondate Date = new IDpeaple();
        Scanner BR = new Scanner(System.in);
        int result= 0 ;
                System.out.println("Inter your name :");
                Date.name = BR.nextLine();
                System.out.println("Inter your BR Year:");
                 Date.y = BR.nextInt();
                if (Date.y< this_year) {
                    result = this_year - Date.y;
                } else
                    System.out.println("EROR");
                try {
                    if (result > 100) {
                        throw new NumberFormatException("EROR Inter a valiu year");
                    }
                } catch (NumberFormatException r) {
                    System.out.println(r.getMessage());
                }
                System.out.println("Inter your BR Month:");
                Date.m = BR.nextInt();
                if (Date.m>12){
                    System.out.println("EROR");
                    return null;
                }
                System.out.println("Inter your BR Day:");
                Date.d = BR.nextInt();
                if (Date.d>31){
                    System.out.println("EROR");
                    return null;
                }
                Date.age = result;
        return Date;
    }
    public abstract void IDperson();
}


