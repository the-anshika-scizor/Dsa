package Resursion;
public class MethodDemo {
    void display(){
        System.out.println("not static");        
    }
    static void show(){
        System.out.println("I am the static method");
    }
    static void add(int x, int y){
        System.out.println("add x and y");
    }

    public static void main(String[] args) {
        show();
        add(10, 20);
        MethodDemo obj = new MethodDemo();
        obj.display();
    }
}
