//package Recursion with String;

/*
 == string ke case me address check krta h aur normal value check krta h 
 .equals() character by character check krta h(sirf string ke case me)

  */

public class StringDemo {
    public static void main(String[] args) {
        String r="anshika";
        r.replace('a', 'n');
        String q="anshika";
        String q2="anshika";
        StringBuilder sb = new StringBuilder("anshika");
        StringBuilder sb2 = new StringBuilder("anshika");
        System.out.println(sb==sb2);
        
    }
}
