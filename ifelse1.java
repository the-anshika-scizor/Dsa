import java.util.Scanner;

public class ifelse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no.");
        int a= sc.nextInt();
        System.out.println("enter second no.");
        int b= sc.nextInt();
        System.out.println("enter third no.");
        int c= sc.nextInt();
        System.out.println("enter fourth no.");
        int d= sc.nextInt();
        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println("a is greater");
                }else{
                    System.out.println("d is greater");
                }  
            }else{
                if(c>d){
                    System.out.println("c is greater");
                }else{
                    System.out.println("d is greater");
                }   
            }
        }else{
            if(b>c){
                if(b>d){
                    System.out.println("b is greater");
                }else{
                    System.out.println("d is greater");
                }  
            }else{
                if(c>d){
                    System.out.println("c is greater");
                }else{
                    System.out.println("d is greater");
                }
            }
        }
    }
}
