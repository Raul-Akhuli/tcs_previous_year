/*
6
3
12.3
15.2
12.3
15.2
12.3
15.2
10.10
10.10
10.00
Total estimated Cost : 1847.4 INR
 */


import java.util.Scanner;
public class ra_11_price_for_painting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int inside = sc.nextInt();
        int outside = sc.nextInt();

        float interiorArea = 0;
        float exteriorArea = 0;

        for(int i = 0; i < inside; i++){
            interiorArea += sc.nextFloat();
        }
        for(int i = 0; i < outside; i++){
            exteriorArea += sc.nextFloat();
        }

        float total_cost = (interiorArea * 18) + (exteriorArea * 12);
        System.out.println("Total estimated Cost: " + total_cost + " INR ");
    }
}
