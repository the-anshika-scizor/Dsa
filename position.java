public class position {
    public static void main(String[] args) {
        int digit=34512;
        int lastDigit= digit % 10;
        int position=0;
        int sum=0;
        while(num>0){
        position++;
        int lastDigit = num % 10;
        sum= sum + position * (int) Math.pow(10,lastDigit-1);
        num = num /10;
        }
        System.out.println(sum);
    }
}
