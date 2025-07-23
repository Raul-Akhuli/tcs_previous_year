import java.util.Scanner;
public class ra_15_fully_automatic_vending_machine_conventional_method {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] Coffee = {"Espresso Coffee", "Cappuccino Coffee","Latte Coffee"};
        String[] Tea = {"Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"};
        String[] Soups = {"Hot and Sour Soup","Veg Corn Soup","Tomato Soup","Spicy Tomato Soup"};
        String[] Beverages = {"Hot Chocolate Drink","Badam Drink","Badam-Pista Drink"};

        System.out.println("enter the choices");
        String choice = sc.next();
        int n = sc.nextInt();

        if(choice.equalsIgnoreCase("c") && n <= Coffee.length){
            System.out.println("Welcome to CCD!");
            System.out.println("Enjoy your " + Coffee[n-1] + "!");
        }
        else if(choice.equalsIgnoreCase("t") && n <= Tea.length){
            System.out.println("Welcome to CCD!");
            System.out.println("Enjoy your " + Tea[n-1] + "!");
        }
        else if(choice.equalsIgnoreCase("s") && n <= Soups.length){
            System.out.println("Welcome to CCD!");
            System.out.println("Enjoy your " + Soups[n-1] + "!");
        }
        else if(choice.equalsIgnoreCase("b") && n <= Beverages.length){
            System.out.println("Welcome to CCD!");
            System.out.println("Enjoy your " + Beverages[n-1] + "!");
        }
        else{
            System.out.println("please enter a valid input!");
        }
    }
}
