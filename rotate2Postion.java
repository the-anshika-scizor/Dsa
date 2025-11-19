public class rotate2Postion {
    public static void main(String[] args) {
        int num=12345;
        int copy= num;
        int count=0;
        int r= 2;
        while(num > 0){
           count++;
           num= num / 10;
        }
        r=r % count;
        num=copy; 
        int rit= num % (int) Math.pow(10, r);
        int lft= num / (int) Math.pow(10, r);
        //System.out.println(rit+""+lft);
        int result = rit* (int)Math.pow(10, count-r)+lft;
        System.out.println(result);
        

    }
}
