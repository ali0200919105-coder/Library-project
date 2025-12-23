import java.util.Scanner;
public class Persondate extends Person {
    @Override
    public String typpeaple() {
        return "a Member of Library";
    }
    final static int this_year = 1404;
    @Override
    public String toString(){
        return name + "(" + y + "/" + m + "/" + d + ")\n" + "age= " + age;
    }
    public static Person personal(){
        Person Date = new Persondate();
        Scanner BR = new Scanner(System.in);
        int result= 0 ;
        int meno = BR.nextInt();
        switch (meno){
            case 1:
                System.out.println("Inter your name :");
                BR.nextLine();
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
          break;
            case 2:
                System.exit(0);
                break;
        }
        return Date;
    }
   public static Person personal(){
        Person nemw = new Persondate();
        Scanner BR = new Scanner(System.in);
        int result= 0 ;
        System.out.println("Inter your name :");
        nemw.name = BR.nextLine();
        System.out.println("Inter your BR Year:");
        nemw.y = BR.nextInt();
        if (nemw.y< this_year) {
            result = date.this_year - nemw.y;
        }else
            System.out.println("EROR");
        try {
            if (result > 100) {
                throw new NumberFormatException("EROR Inter a valiu year");
            }
        } catch (NumberFormatException r) {
            System.out.println(r.getMessage());
        }
        System.out.println("Inter your BR Month:");
        nemw.m = BR.nextInt();
        if (nemw.m>12){
            System.out.println("EROR");
            return null;
        }
        System.out.println("Inter your BR Day:");
        nemw.d = BR.nextInt();
        if (nemw.d>32){
            System.out.println("EROR");
            return null;
        }
        nemw.age = result;
        return nemw;  }


}


