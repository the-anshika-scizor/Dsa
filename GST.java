//ackage Recursion with array;

public class GST {
    static int [] getPriceWithGST(int prices[], int index){
        if(index ==  prices.length){
            int gst[]= new int[prices.length];
            return gst;
        }
        int gst[] = getPriceWithGST(prices, index+1);
        gst[index] = prices[index]+(int) (prices[index]*0.18);
        return gst;
    }
    public static void main(String[] args) {
        int prices[] ={100,200,430,99,7777};
        int newPrices[]= getPriceWithGST(prices, 0);
        for(int p : newPrices){
            System.out.println(p);
        }
    }
}
