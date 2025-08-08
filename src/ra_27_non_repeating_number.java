import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
public class ra_27_non_repeating_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the numbers (space separated): ");
        String inputLine = sc.nextLine();

        Map<Character,Integer> freq = new LinkedHashMap<>();

        for(char ch : inputLine.toCharArray()){
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
