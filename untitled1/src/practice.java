public class practice<T1 , T2> {
private T1 first;
private T2 secend;
public practice(T1 first, T2 secend) {
this.first =first;
this.secend =secend;
    }
    private void setFirst(T1 first){
    this.first = first;
    }
    public T1 getFirst() {
        return first;
    }
    public void setSecend(T2 secend) {
        this.secend = secend;
    }
    public T2 getSecend() {
        return secend;
    }
    public <U1> void prac(U1 first , U1 secend){
    System.out.println(first);
    System.out.println(secend);
    }
}
void main(){
    practice<String,Integer> oo = new practice<>("ali",33);
    oo.prac("ali" , 33);
    List<String> ooo = new ArrayList<>();
String o = oo.getFirst();
System.out.println(o);

}
