public class Table {
    static String printTable(int num, int val){
        if(val ==0){
            return "";
        }
        String result=printTable(num, val-1);
        String Experssion=num+"*"+val+"="+(num*val)+"\n";
        return result+ Experssion;

    }
    public static void main(String[] args) {
        String r=printTable(5, 10);
        System.out.println(r);
    }
}
