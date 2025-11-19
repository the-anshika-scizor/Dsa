//package Recursion with String;

public class SearchAndDelete {
    static String searchAndDelete(String str, char search, char replace){
        if(str.length() == 0){
            return "";
        }
        String oldResult=searchAndDelete(str.substring(1), search, replace);
        if(str.charAt(0) == search){
           return  oldResult;
        }else{
            return  str.charAt(0)+oldResult;
        }
    }
    public static void main(String[] args) {
        String result = searchAndDelete("Hello", 'l', 'x');
        System.out.println(result);
    }
}
