/*void main() {
    /*int namer = 99;
    int A = namer % 3;
    int B = 19 % 3;
int D = 0;
   //boolean t = !(A == B);
    if (A == B) {
        D = B++;
    } else {
        D = A++;
    }*/
   /* int kalaprice = 50;
    int discount = 100;
    int maliat = 50;
        for (int kala = 1; kala <= 10; kala++){
            int totalprice = kala * kalaprice;
            int totalprce2 = totalprice - discount;
            int totalprice3 = totalprce2+maliat;
            int totalprce4 = totalprice +maliat;
        if (totalprice > 200) {
            System.out.println(totalprice3);
        }
        else {
        System.out.println(totalprce4);}
        }*/

public class Main1 {
    public static void main(String[] args) {


        for (int r = 0; r <= 10; r++) {
            System.out.println(dr(r));
        }


    }

    static double dr (int j){
        return 3.14*2*j;
    }


}





