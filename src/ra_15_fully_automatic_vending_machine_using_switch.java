import java.util.Scanner;
public class ra_15_fully_automatic_vending_machine_using_switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] Coffee = {"Espresso Coffee", "Cappuccino Coffee","Latte Coffee"};
        String[] Tea = {"Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"};
        String[] Soups = {"Hot and Sour Soup","Veg Corn Soup","Tomato Soup","Spicy Tomato Soup"};
        String[] Beverages = {"Hot Chocolate Drink","Badam Drink","Badam-Pista Drink"};

        System.out.println("Enter your choice: ");
        String choice = sc.next();
        int n = sc.nextInt();

        String item = null;
        switch(choice.toLowerCase()){
            case "c":
                item = getItem(Coffee, n);
                break;
            case "t":
                item = getItem(Tea, n);
                break;
            case "s":
                item = getItem(Soups, n);
                break;
            case "b":
                item = getItem(Beverages, n);
                break;
            default:
                item = null;
        }
        if(item != null){
            System.out.println("Welcome to CCD!");
            System.out.println("Enjoy your " + item + "!");
        }
        else {
            System.out.println("Invalid input!");
        }
        sc.close();
    }
    public static String getItem(String[] items, int index){
        if(index >= 1 && index <= items.length){
            return items[index-1];
        }
        return null;
    }
}
