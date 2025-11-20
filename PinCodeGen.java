public class PinCodeGen {
    static void genPincode(int range, String result){
        if(range == 0){
            System.out.print(result+",");
            return;
        }
        for(int i=0; i<=9; i++){
            genPincode(range-1, result + i);
        }
        // genPincode(range-1, result+"0");
        // genPincode(range-1, result+"1");
        // genPincode(range-1, result+"2");
        // genPincode(range-1, result+"3");
        // genPincode(range-1, result+"4");
        // genPincode(range-1, result+"5");
        // genPincode(range-1, result+"6");
        // genPincode(range-1, result+"7");
        // genPincode(range-1, result+"8");
        // genPincode(range-1, result+"9");
        
    }
    public static void main(String[] args) {
        int range=4; // 3-6
        // pincode - 0 to 9
        genPincode(range, "");
        

    }
}
