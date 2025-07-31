/*
Ex - n = 5, x = 20, y = 50, Arr = [2, 5, 7, 6, 3] String addition example - "2" + "7" = "27" -> 27
converted to int
 */

import java.util.Scanner;
public class ra_22_pair_in_between_certain_range {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no of element: ");
        int n = sc.nextInt();
        System.out.println("enter the lowest range: ");
        int x = sc.nextInt();
        System.out.println("enter the highest range: ");
        int y = sc.nextInt();

        String[] stringArray = new String[n];

        for(int i = 0; i < n; i++){
            stringArray[i] = sc.next();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                String combined = stringArray[i] + stringArray[j];
                int a = Integer.parseInt(combined);

                if(a > x && a <y){
                    System.out.println(stringArray[i] + " " + stringArray[j]);
                }
            }
        }
    }
}
