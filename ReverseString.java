//package Recursion with String;

public class ReverseString {
    static String twoPointer(char arr[], int left , int right){
        if(left> right){
            return new String(arr);
        }
        //Swap
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        return twoPointer(arr, left+1, right-1);
    }
    static String reverse(String str){
        if(str.length() == 0){
            return "";// Blank string return
        }
        //make string small
        String oldResult= reverse(str.substring(1));
        char newResult= str.charAt(0);
        return oldResult+newResult;
    }
    public static void main(String[] args) {
        String rev =reverse("Anshika");
        System.out.println(rev);



    }
}
