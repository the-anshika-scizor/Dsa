//package Recursion with array;

public class FindInArray {
    static boolean isFound(int arr[], int index, int searchValue){
        if(index == arr.length){
            return false;
        }
        if(arr[index] == searchValue){
            return true;
        }
        return isFound(arr, index+1, searchValue);
    }
    public static void main(String[] args) {
        int arr[]= {10,20,30,40,50,60};
        System.out.println(isFound(arr, 0, 50 )? "Found" : "Not Found");

    }
}
