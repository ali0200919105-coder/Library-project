import java.util.*;
import java.util.HashMap;
public class jvk {
   String age;
   String name ;
public jvk(String name , String age){
   this.name = name;
   this.age = age;

}
static void main(){
    jvk[] g = new jvk[1];
    g[0] = new jvk("323","322");

   // jvk[] g2 = new jvk[]{new jvk("ali", "23")};
  //  Arrays.binarySearch(g,"323");
  //  List<String> gh =Arrays.asList(Arrays.toString(g));
System.out.println(g[0]);


}}
