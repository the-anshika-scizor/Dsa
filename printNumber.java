public class printNumber {
    public static void main(String[] args) {
        int num = 12345;
        int copy = num;
        int count=0;
        while(num > 0){
            num = num /10;
            count ++;
        }
        int pow = (int) Math.pow(10, count-1);
        num=copy;
        while(num >0){
            int firstdigit = num/pow;
            System.out.println(firstdigit);
            num = num%pow;
            pow = pow/10;
        }
        

    }
}
