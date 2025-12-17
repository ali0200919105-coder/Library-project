public class errr {
    static String lig = "number 1 in leag";
    static String teamname = "team name = perspolis";
    static {System.out.println(errr.teamname);
        System.out.println(lig);
    }
    private int number;
    private String name;
    private String post;

    public errr(String z, String v, int t) {
        name = z;
        post = v;
        number = t;
    }
}
void main() {
        errr pr1 = new errr( "ali = ","{paly left",10);
        errr pr2 = new errr("rza = ","{paly def",99);
        errr pr3 = new errr("shayan = ","{paly right",17);
        errr pr4 = new errr("hoosein = ","{paly attakh",32);
        errr pr5 = new errr("amir = ","{paly def",3);

        System.out.println(pr1.name + pr1 .post + " number="+pr1.number+"}");
        System.out.println(pr2.name + pr2 .post + " number="+pr2.number+"}");
        System.out.println(pr3.name + pr3 .post + " number="+pr3.number+"}");
        System.out.println(pr4.name + pr4 .post + " number="+pr4.number+"}");
        System.out.println(pr5.name + pr5 .post + " number="+pr5.number+"}");

        }