//package Resursion;

public class Power {
    // return result
    static int power(int num,int pow){
        if(pow==0){
            //time to prepare the result
            return 1;
        }
        int smallResult=power(num, pow-1);
        int result= smallResult *num;
        return result;
    }


    // prepare the result in each call
    static void power(int num, int pow,int result){
        if(pow==0){
            System.out.println(result);
            return;
        }
        power(num, pow-1, result*num);
    }

    
    public static void main(String[] args) {
        power(2, 5,1);
        power(2, 6);
    }
}
