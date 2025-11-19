//package Resursion;

public class sumOfDigit {
    static int SumOfDigit(int num){
        if(num == 0){
            return 0;
        }
        return SumOfDigit(num / 10) + num % 10;
    }
    static void SumOfDigit(int num,int sum){
       if(num==0){
        System.out.println(sum);
        return;
       }
       int lastDigit = num % 10;
        SumOfDigit(num / 10, sum + num % 10);
       
    }
    public static void main(String[] args) {
        SumOfDigit(12345, 0);
        int r = SumOfDigit(123);
        System.out.println(r);
    }
}
