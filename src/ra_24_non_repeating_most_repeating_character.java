import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ra_24_non_repeating_most_repeating_character {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Character,Integer> freq = new HashMap<>();

        System.out.print("Enter a string: ");
        String inputLine = sc.nextLine();

        if(inputLine.isEmpty()){
            System.out.println("Invalid Input.");
        }
        else{

            char[] charArray = inputLine.toCharArray();

            for(char c : charArray){
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
            boolean flag = false;
            for(Map.Entry<Character,Integer> entry : freq.entrySet()){
                if(entry.getValue() == 1){
                    System.out.println("Non repeating character: " + entry.getKey());
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("None");
            }

            int maxFrequency = 0;
            char mostFreqChar = charArray[0];
            int max = 0;

            for(char c : charArray){
                int currentFreq = freq.get(c);
                if(currentFreq > maxFrequency){
                    maxFrequency = currentFreq;
                    mostFreqChar = c;
                    max = maxFrequency;
                }
            }
            System.out.println("Most frequent character: " + mostFreqChar + " (appears " + max + " times)");
        }
    }
}
