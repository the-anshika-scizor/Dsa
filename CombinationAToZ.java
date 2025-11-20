// public class CombinationAToZ {
//     static void  combinationAtoZ(int range, String result){
//         if(range==0){
//             System.out.print(result+",");
//             return;
//         }
//          for(char i='A' ; i<='Z';i++){
//             combinationAtoZ(range-1, result+i);
//         }
        

//     }
//     public static void main(String[] args) {
//         int range=5;
//         combinationAtoZ(range, "");
//     }
// }


// backtracking= explore only those branches which give you the result and  discard another branches.
// backtracking example
public class CombinationAToZ {
    static void  combinationAtoZ(int range, String result){
        if(range==0){
            System.out.print(result+",");
            return;
        }
        for(char ch='A' ; ch<='Z';ch++){
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                  combinationAtoZ(range-1, result+ch);
            }
            
        }

    }
    public static void main(String[] args) {
        int range=5;
        combinationAtoZ(range, "");
    }
}