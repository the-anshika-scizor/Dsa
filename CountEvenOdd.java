//package Resursion;

public class CountEvenOdd {
    static int [] countEvenOdd(int range){
        // Base Condition
        if(range == 0){
            int result[] = new int[2];
            return result;
        }
       // small problem
        int result[]=countEvenOdd(range-1);
         // Logic
        if(range %2 == 0){
            result[0]= result[0]+1;
        }else{
            result[1]=result[1]+1;
        }
        return result;
    }


    static void countEvenOdd(int range, int evencount, int oddcount){
        if(range == 0){
            System.out.println(evencount);
            System.out.println(oddcount);
            return;
        }
        if( range %2 ==0){
            evencount++;
        }else{
            oddcount++;
        }
        countEvenOdd(range-1, evencount, oddcount);
    }


    public static void main(String[] args) {
        // for void
        countEvenOdd(100, 0, 0);
        // for int
        int arr[]= countEvenOdd(100);
        System.out.println("EvenCount "+arr[0]);
        System.out.println("OddCount "+arr[1]);
    }
}
