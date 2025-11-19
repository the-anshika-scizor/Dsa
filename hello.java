public class hello {
    static void main(int x){
        System.out.println("int main");
    }
    static public  void main(String ...a) {
       hello.main(10);
        main();
        System.out.println("hello java");
    }
}