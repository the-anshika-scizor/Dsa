public class FindOccurReplace {
    static int[] replaceHelper(int arr[], int index, int search, int replace){
        // Base case
        if(index == arr.length){
            int result[]= new int[arr.length];
            return result;
        }
        int result[]=replaceHelper(arr, index +1, search, replace);

        if(arr[index] == search){
            result[index] = replace;
        }else{
            result[index]= arr[index];
        }
        return result;
    }
    static int[] replace(int arr[], int search, int replace){
       return replaceHelper(arr, 0, search, replace);
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 90, 10, 80, 10, 88};

        //  original array 
        System.out.println("Before replacing:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Replacement ke baad naya array   
        int replacedArr[] = replace(arr, 10, 100);

        // Ab replaced array print diya
        System.out.println("After replacing:");
        for (int val : replacedArr) {
            System.out.print(val + " ");
        }
    }
}
