package Resursion;

public class Rec {
    static void show(int n){
        if( n==0 ){
            return;
        }
        System.out.println("Anshika " + n);
        //n--;
        //show(n);
        show(n-1);
        System.out.println("Gupta "+n);
    }
    public static void main(String[] args) {
        show(5);
    }
}
