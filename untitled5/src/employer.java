public class employer extends Person{
        int yeraEmploy;
        public employer( String name, int age , int yeraEmploy) {
            super( name , age);
            this.yeraEmploy =yeraEmploy;
        }

        @Override
        public void showInfo(){
            System.out.println("personId:"+getPersonId()+"    Name:"+getName()+"    YearEmploy"+ getYeraEmploy());

        }

    public int getYeraEmploy() {
        return yeraEmploy;
    }
}




