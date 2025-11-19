//package Resursion;

public class ArmstrongOneToN {
    
    static boolean isArmstrong(int num, int org, int sum,int totalDigit){
        
        if(num == 0){
            return sum == org;
        }
        int ld= num % 10;
        sum= sum + power(ld, totalDigit);
        return isArmstrong(num /10, org,sum, totalDigit);
    }

    static int countArmstrong(int range){
        if(range == 0){
            return 0;
        }
        boolean result = isArmstrong(range, range, 0,countArmstrong(range));
        int c = countArmstrong(range-1);
        if(result){
            c++;
        }
        return c;
    }


    static int power(int num, int pow){
        if(pow==0){
            return 1;
        }
        return power(num, pow-1)*num;
    }

    static int SumOfDigit(int num){
       if(num==0){
        return 0;
       }
       return 1 + SumOfDigit(num / 10);
        
       
    }

    
    public static void main(String[] args) {
        System.out.println(countArmstrong(1000));
        
    } 
}




error