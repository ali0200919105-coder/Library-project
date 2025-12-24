import java.util.*;
public class LendingBook extends Laibrary {
    public static int showMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1_Start \n2_Exit");
        int Meno = sc.nextInt();
        while (Meno >2 || Meno == 0){
            System.out.println("pleas choos rite");
            Meno = showMenu();
        }
        if (Meno == 2){
            System.exit(0);
        }
        return Meno;
    }
    Map<Book, String> map = new HashMap<>();
    List<Person> t = new ArrayList<>();
    Set<String> IDs = new HashSet<>();
    Scanner ID = new Scanner(System.in);
   public void Lending() {
       for (int i = 0; i <= 1; i++) {
           Person p = Persondate.personal();
           System.out.println("inter your ID:");
           String YourID = ID.nextLine();
           while (IDs.contains(YourID)){
               System.out.println("pleass choos another ID");
               YourID = ID.nextLine();
           }
           IDs.add(YourID);
           t.add(p);
           System.out.println("choos a book :\n1_" + book.getNameBook() + "\n2_" + book1.getNameBook());
           int choos = ID.nextInt();
           ID.nextLine();
        switch (choos) {
            case 1:
                if (book.getStatus() == Book.Status.ready) {
                    book.loan();
                    map.put(book, YourID);

                } else System.out.println("We dont have this book");
                break;
            case 2:
                if (book1.getStatus() == Book.Status.ready) {
                    book1.loan();
                    map.put(book1, YourID);

                } else System.out.println("We dont have this book now");
                break;
            default:
                System.out.println("pleas Select a book that is available");
        }}
    }
    public void print() {
        for (Book b : map.keySet()) {
            String userName = map.get(b);
            System.out.println(b + " \nID person = " + userName);
            for (Person p : t) {
                    System.out.println("Full ID = " + p.toString());
            }
        }
    }
    public void Form() {
       //منو
        showMenu();
        // ساختن کتاب
        CraetBook();
        // امانت دادن کتاب
        Lending();
        // چاپ و گزارش
        print();
    }
    }