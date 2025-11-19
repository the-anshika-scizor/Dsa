public class switchCaseDemo {
    public static void main(String[] args) {
        // switch is use for make menudriven application.
        /* 
        System.out.println("1. Burger");
         System.out.println("2. Pizza");
         System.out.println("3. Drinks");
         System.out.println("4. Desserts");
         int choice = 1;
         switch (choice){
            case 1:
            System.out.println("Rs 100");
            case 2:
            System.out.println("Rs 200");
            case 3:
            System.out.println("Rs 50");
            case 4:
            System.out.println("Rs 150");
            default:
            System.out.println("Invalid Choice...");
        */

        /*
        System.out.println("1. Burger");
         System.out.println("2. Pizza");
         System.out.println("3. Drinks");
         System.out.println("4. Desserts");
         String choice = "Burger";
        switch (choice){
            case "Burger":
            System.out.println("Rs 100");
            case "Pizza":
            System.out.println("Rs 200");
            case "Drinks":
            System.out.println("Rs 50");
            case "Deserts":
            System.out.println("Rs 150");
            default:
            System.out.println("Invalid Choice...");
        }
        */


        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Drinks");
        System.out.println("4. Desserts");
        String choice = "Burger";
        //int a= 10+20;
        double price = switch(choice){
        case "Burger" -> 100;
        case "Pizza" -> 200;
        case "Drinks" -> 50;
        case "Desserts" -> 150;
        default->0;
        };
    }
}
