//package Recursion with array;

public class ArraySyntax {
    public static void main(String[] args) {

        // two D array

        int twod [][]= new int [3][3];
        int []q[] = new int [3][4];
        int [][] e= new int [3][4];
        int h[][]={{10,20,30},{90,100,11}};
        int n[][]= new int [3][];
        n[0]=new int[10];
        n[1]=new int[20];
        n[2]=new int[30];
        for(int i=0; i< n.length ;i++){
            for(int j=0; j<n[i].length; j++){
                System.out.print(n[i][j]);
            }
            System.out.println();
            
        }
        
        
        

        
        /* int arr[]= new int[10]; // fill with 0
        int c[]={10,20,30,40};
        int []d={50,20,30,40};
        int e[]= new int [] {10,20,30,40};
        System.out.println(e.toString()); // classname@hashcode(Hexadecimal)
        boolean a[]= new boolean[10] ; // fill with false
        String b[]= new String[10]; // fillwith null

         */
    }
}
