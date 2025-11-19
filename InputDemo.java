public class InputDemo {
    public static void main(String[] args) {
        //command line inputs.
        String name= args[0];
        int age= Integer.parseInt(args[1]);
        double salary=Double.parseDouble(args[2]);
        System.out.println("Name is:"+ name);
        System.out.println("Age is:"+ age);
    }
}
