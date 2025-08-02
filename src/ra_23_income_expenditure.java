/*
Input
Income: 5000
Type of Material: Food
Expenditure: 100
Type of Material: Mobile
Expenditure: 200
Type of Material: Electricity
Expenditure: 500
Then the user enters "done".

Expected Output
Total Income: 5000
Total Savings: 4200
Expenditures:
Food: 100
Mobile: 200
Electricity: 500
 */


import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class ra_23_income_expenditure {
    static Map<String, Integer> expenditures = new HashMap<>();   // If you do not want to write this stattic word in front of Map
    public static void main(String[] args){                       // Make the obj of the class and put the obj in front of the every expenditures word
        Scanner sc = new Scanner(System.in);

        System.out.print("Income: ");
        int income = sc.nextInt();
        sc.nextLine();

        while(true){
            System.out.print("Type of Material: ");
            String material = sc.nextLine();

            if(material.equalsIgnoreCase("done")){
                break;
            }

            System.out.print("Expenditure: ");
            int amount = sc.nextInt();
            sc.nextLine();

            expenditures.put(material,amount);
        }

        int totalExpence = 0;
        for(int amount : expenditures.values()){
            totalExpence += amount;
        }
        int savings = income - totalExpence;

        System.out.print("\nTotal Income: " + income);
        System.out.print("\nTotal Savings: " + savings);
        System.out.print("\nExpenditure: ");
        System.out.println();

        for(Map.Entry<String,Integer> entry : expenditures.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        sc.close();
    }
}
