import java.util.Scanner;

public class ra_2_star_and_hash_count_in_a_string{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string consist of only '*' and '#': ");
        String inputLine = sc.nextLine();

        int countStar = 0;
        int countHash = 0;
        for(int i = 0; i < inputLine.length(); i++){
            char ch = inputLine.charAt(i);
            if(ch == '*') countStar++;
            else if(ch == '#') countHash++;
        }

        if(countStar > countHash){
            System.out.println("positive integer");
        }

        else if(countStar < countHash){
            System.out.println("negative integer");
        }

        else System.out.println("0");
    }
}