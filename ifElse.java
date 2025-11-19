import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        /*if(true){
            //code
        }else{
            //code
        }
        */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three numbres");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is grater");
            }else{
            System.out.println("c is greater");
        }
        }else{
            if(b>c){
                  System.out.println("b is greater");
            }else{
                System.out.println("c is greater");
            }
            
        }
        sc.close();

    }
}
// 4 no vala try krna h