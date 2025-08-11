import java.util.Scanner;
public class ra_11_cost_price_for_painting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int inside = sc.nextInt();
        int outside = sc.nextInt();

        float cost_interior = 0;
        float cost_exterior = 0;

        for(int i = 0; i < inside; i++){
            cost_interior += sc.nextFloat();
        }

        for(int i = 0; i < outside; i++){
            cost_exterior += sc.nextFloat();
        }

        float total_cost = (cost_interior*18) + (cost_exterior*12);
        System.out.println("Total estimated cost: " + total_cost + " INR ");
    }
}
