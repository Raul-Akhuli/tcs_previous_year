/*
Input:
9

1 1 2 2 5 6 6 7 7

Output:
5
 */

import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
public class ra_27_non_repeating_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Character,Integer> freq = new LinkedHashMap<>();

        System.out.println("enter the elements (space separated): ");
        for(int i = 0; i < n; i++){
            char ch = sc.next().charAt(0);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : freq.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("non repeating character: "+ entry.getKey());
                return;
            }
        }
        System.out.println("there is no non repeating character present.");
    }
}
