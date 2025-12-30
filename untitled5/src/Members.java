public class Members extends Person{
    int shomare;
    public Members(String name, int age,int shomare) {
        super( name, age);
        this.shomare = shomare;
    }

    public Members() {

    }

    public int getShomare() {
        return shomare;
    }

    @Override
    public void showInfo(){
    System.out.println("personId:"+getPersonId()+"    Name:"+ name+ "    age:"+ getAge() + "the number:"+ getShomare());

    }


}


