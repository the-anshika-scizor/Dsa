//package Resursion;

public class Peterson {
    
    static int fact(int num){
        if(num ==1 || num ==0){
            return num;
        }
        return num * fact(num -1);
    }
    static void PetersonNumber(int num , int sum, int org){
        if(org == sum){
            System.out.println("peterson no.");
            return;
        }
        PetersonNumber(num / 10, sum + fact(num % 10), org);
    }
    public static void main(String[] args) {
        PetersonNumber(145, 0, 145);
    }
}
