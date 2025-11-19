import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int factor=0;
        for(int i=1; i<=num;i++){
            if(num % i ==0){
                factor++;
            }
        }
        if(factor ==2){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
        sc.close();
    }
}
