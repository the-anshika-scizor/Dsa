public class MultiBranch1 {
    static void tree(int num){
        if(num <=0){
            return;
        }
        System.out.println("Pre call "+num);
        tree(num-1);
        System.out.println("Between call "+num);
        tree(num-2);
        System.out.println("Post call "+num);
        tree(num-3);
        System.out.println("Post call (n-3) "+num);
        tree(num-4);
        System.out.println("Post call (n-4) "+num);
    }   
    public static void main(String[] args) {
        tree(5);
    }
}
