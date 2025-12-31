public static void main(String[] args) throws InterruptedException {
    LibraryNew lib = new LibraryNew();
    Scanner sc = new Scanner(System.in);


    while (true){
        System.out.println("1_add person");
        System.out.println("2_add Book");
        System.out.println("3_show List of persons");
        System.out.println("4_show List of Books");
        System.out.println("5_Lending Book");
        System.out.println("6_show lounBook");
        System.out.println("7_Barcods of books");
        System.out.println("0_Exit");
        int select = sc.nextInt();
        switch (select){
            case 1:
                sc.nextLine();
                System.out.println("Inter your name :");
                String personName =  sc.nextLine();

                System.out.println("Inter your Age:");
                int personAge=sc.nextInt();
                if (personAge>100){
                    System.out.println("pleass inter a valou age ");
                    Thread.sleep(1000);
                    break;
                }
                System.out.println("inter your codM:");
                int codM = sc.nextInt();
                if (String.valueOf(codM).length() != 10){
                    System.out.println("pleass inter a valou codM:");
                    break;
                }
                if(personAge <100 && String.valueOf(codM).length() == 10){
                    lib.addPerson( new Members(personName,personAge,codM));
                }

                System.out.println("اطلاعات افراد ذخیره شد.");
                Thread.sleep(2000);
                break;
            case 2:
                sc.nextLine();
                System.out.println("inter the name Book:");
                String bokkName = sc.nextLine();

                System.out.println("inter the name Writer:");
                String witer =sc.nextLine();

                System.out.println("inter the price Book:");
                int price = sc.nextInt();

                System.out.println("inter the tedad Book:");
                int tedad = sc.nextInt();

                lib.addbook(new InfoBook(bokkName,witer,price,tedad));

                System.out.println("اطلاعات کتاب ذخیره شد");
                Thread.sleep(2000);
                break;
            case 3:
                if (lib.persons !=null) {
                    for (Person p : lib.persons)
                        p.showInfo();
                }
                    Thread.sleep(3000);

                  break;
            case 4:
                 if (lib.Books != null) {
                     for (InfoBook p : lib.Books)
                         p.showInfo();
                 }
                     Thread.sleep(3000);

                 break;
            case 5:
                for (InfoBook p : lib.Books){
                    p.showInfo();
                }
                System.out.println("inter your IdPerson:");
                int PersonId = sc.nextInt();
                Person ListPerson = null;
                InfoBook ListBook = null;
                for (Person i : lib.persons) {
                    if (i.getPersonId() == PersonId) {
                        ListPerson = i;
                    }
                }

                        System.out.println("choos a Book:");
                        int BookId = sc.nextInt();

                        for (InfoBook j : lib.Books) {
                            if (j.getBookId() == BookId && j.getTedad() > 0) {
                                ListBook = j;
                                lib.Lending(ListPerson, ListBook);
                                j.removebarcod();
                                j.loan();
                                break;
                            }
                        }
                        if (ListBook == null) {
                            System.out.println("این کتاب موجود نمیباشد.");
                            break;
                        }

                System.out.println("با موفقیت امانت داده شد.");
                Thread.sleep(1000);
                break;
            case 6:
                for (Person p : lib.persons){
                    if (!p.Borowbooks.isEmpty()){
                         System.out.println(p);
                        System.out.println("}کتاب های امانت گرفته شده");
                        //System.out.println("کتابی امانت داده نشده.");
                    }
                for (InfoBook l : p.Borowbooks) {
                    System.out.println(l);
                }
                System.out.println("}");

                }
                    Thread.sleep(2000);
                  break;
            case 7 :
                for (InfoBook o : lib.Books){
                    o.print2();
                }
                Thread.sleep(2000);
                break;
            case 0:
                System.out.println("با موفقیت از برنامه خارج شد.");
                Thread.sleep(1000);
                return;
    }

}}




