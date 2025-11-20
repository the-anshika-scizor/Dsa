public class LeetCode509 {
    static int fibonacci(int num){
        if(num ==0 || num==1){
            return num;
        }
        return fibonacci(num-1) +fibonacci(num-2);

    }
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }
}
