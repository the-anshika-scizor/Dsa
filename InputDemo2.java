import java.util.Scanner;

public class InputDemo2 {
    public static void main(String[] args) {
        // scanner is a buffer.
        Scanner scanner=new Scanner(new file("\\Users\\nikgu\\Desktop\\brainMentors>"));
        //Scanner scanner=new Scanner("hello I am anshika");
        int worldCount =0;
        while(scanner.hasNext()){
            worldCount++;
            System.out.println(scanner.next());
        }
        System.out.println("total words: "+ worldCount);
        scanner.close();
    }
}
