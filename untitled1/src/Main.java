public static void main(String[] args) {
Laibrary projhe = new LendingBook() ;
    List<Book> books = projhe.ListofBook();
    Person p = Persondate.personal();
//  projhe.ListofBook();
    Scanner ID = new Scanner(System.in);
    Scanner IDs = new Scanner(System.in);
    System.out.println("inter a book: \n0_Math \n1_Nahjol ");
    int Chois = ID.nextInt();
    System.out.println("inter your ID:");
    String num = IDs.nextLine();
    Book Select = books.get(Chois);
    projhe.Lending(Select, num);
    projhe.print();

}




