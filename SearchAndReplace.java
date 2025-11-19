//package Recursion with String;

public class SearchAndReplace {
    static String searchandReplace(String str, char search, char replace){
        if(str.length() == 0){
            return "";
        }
        String oldResult=searchandReplace(str.substring(1), search, replace);
        if(str.charAt(0) == search){
           return  replace+oldResult;
        }else{
            return  str.charAt(0)+oldResult;
        }

    }
    public static void main(String[] args) {
        String result = searchandReplace("Hello", 'l', 'x');
        System.out.println(result);
    }
}
