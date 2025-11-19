import java.util.Scanner;
//*****  robart c martin clean book .******
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name: ");
        String name = sc.nextLine();
        System.out.println("enter the id: ");
        int id =sc.nextInt();
        System.out.println(name+" "+ id);
        sc.close();
// if you do not close the scanner memory leakage happen.
// when once scanner is closed and you try to reopen it then it doesnt open.
/*
 java ScannerDemo.java  (java filename.java)
 we direct print our output.
 */

    }
}
