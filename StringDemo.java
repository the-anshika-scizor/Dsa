/* string imutable hoti h usme koi change nhi hota h 
ex String n2="Anshika";
   n2= n2+"gupta";
   yha aap dekh rhe h ki new string bn gyi mtlb string change ho gyi
   pr yha yh khna glt hoga yha hm aisa khege ki string change to hui 
   pr new memory me change hue mtlb jb hmne n2 me gupta ko add kraya to new memory bni aur vha pr gupta string me add ho gya.


pr yha pr string pool me se memory htana bht dificult h.

*/

import java.math.BigDecimal;
import java.math.BigInteger;

public class StringDemo {
    public static void main(String[] args) {
        String n="Anshika".intern(); // string litreal and intern is used for intern into the string pool.
        String n2="Anshika";
        System.out.println(n==n2);
        System.out.println(n);
        String n3= new String("Anshika").intern();
        System.out.println(n==n3); // output is true because of intern function.


        String n4="Anshika"; 
        String n5= new String("Anshika");
        System.out.println(n4==n5); // output is false


        String n6="Anshika".intern(); 
        String n7= new String("Anshika");
        System.out.println(n6==n7); // output is flase.


        String gg="Ram";
        System.out.println(gg);
        System.out.println(gg.length());
        System.out.println(gg.toUpperCase());

        System.out.println();
        // for changing in string we use StringBuilder and StringBuffer
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
   
       
        sb2.ensureCapacity(10000);

        
        System.out.println();

        StringBuilder sb3 = new StringBuilder("anshika");
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());


        // Bigtypes
        BigDecimal bd= new BigDecimal("644548787465415313487768465.468777864545313546879/7");
        BigInteger bd2= new BigInteger("8989565598897946545613213321654876846454318745784589465198465184518965441852");
        System.out.println(bd);
        System.out.println(bd2);

    }
}
