/*

Input:
A = "Tiger"
B = "Ti"

Output:
ger

*/

import java.util.Scanner;
import java.util.HashSet;

public class ra_30_remove_character_after_comparing_two_string{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        HashSet <Character> setB = new HashSet<>();     // for eliminating redundant character
        for(char ch : B.toCharArray()){
            setB.add(ch);
        }

        StringBuilder result = new StringBuilder();     // to store the final string

        for(char ch : A.toCharArray()){
            if(!setB.contains(ch)){
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
}

