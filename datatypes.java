public class datatypes {
    int h;  //it initialize  at object creation time = instance variable.
    static int h2;// it initialize  at class load time = class variable.
    void show(){
        int k=100;
    }
    public static void main(String[] args) {
        int nn=0;
        System.out.println(nn);
        System.out.println(h2);

        int x=90;// local variable initialize by own
        int y=22;
        System.out.println(x+y);


        // primitive
        //nondecimal
        byte e=100; // 1byte  (-128 to 127)range
        // we don't take the value of byte is greater then -128 to 127 because it's out of range of byte.
        // if we want to initilize(take) we write-
        byte w=(byte)130;
        System.out.println(w);// output is -126 its under the range  of byte.

        short g=200; // 2byte  (-32768 to 32767) range
        System.out.print(Short.MAX_VALUE+" to  ");  // use for find the minimum range of short.
        System.out.println(Short.MAX_VALUE);     // use for find the maximum range of short.
        
        int h=5000; // 4 byte
        System.out.print(Integer.MAX_VALUE+" to  ");
        System.out.println(Integer.MAX_VALUE);

        long j=937555448515488795l; // 8 byte


        // decimal
        float hh= 99.89f;  // 4byte
        double h4= 90.24; // 8byte    


        // unicode
        char g1='A';// 2byte
        char g2='न';
        System.out.println(g1+"  "+g2);



        // true-flase
        boolean att=true; //1 or0 0
        System.out.println(att);







        var a=100;
        var b=20.90;

        int c= 90;
        // constants
        final int MAX=100;   // all CAPS(we write constant in caps).
        System.out.println(a);



        int arr[]={10,20,30,40};
        /*
         imutable class in java
         Byte
         Short
         Integer
         Long
         Float
         Double
         Character
         */
        double n=90.20; // data
        Double tt=100.20; // data+methods.  (Rapper class)
        String g6="1000";
        int k9= Integer.parseInt(g6);
        System.out.println(k9);
    }
}
