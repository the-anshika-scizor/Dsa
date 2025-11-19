import java.util.Scanner;

public class primeOptimized {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        for(int i=2; i*i <=num ;i++){
            if(num % i == 0){
                System.out.println("not prime");
                return;
            }
            
        }
        System.out.println("prime");
        sc.close();
    }
}
