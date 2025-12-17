void main(){
    String name = "ali shoot kard toop \nali raft khone";
    String news = name.replace("ali","omid");
    String[] array = new String[11];
    array [1] = "saeed ali";
    array [2] = "zahra";
    array [3] = "mandana";
    array [4] = "saeed namjo";
    array [5] = "saeed mona";
    array [6] = "hmaid";
    array [7] = "ali";
    array [8] = "hosin";
    array [9] = "saeed reza";
    array [10] = "mamad";
    int troucount = 0;
    for (String df : array){
df += array.length;
if (df.contains("saeed")) {

    troucount++;
}
}
    System.out.println(troucount);
}
