//package Recursion with MultiBranch;

public class MuliBranch {
    static void tree(int num){
        if(num <=0){
            return;
        }
        System.out.println("Pre call "+num);
        tree(num-1);
        System.out.println("Between call "+num);
        tree(num-2);
        System.out.println("Post call "+num);
    }   
    public static void main(String[] args) {
        tree(5);
    }
}
// jb tk niche ja rhe ho pre call
// jb backtrack kroge to between call
// fir jb niche aoge to post call