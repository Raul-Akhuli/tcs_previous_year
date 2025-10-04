import java.util.Scanner;

public class ra_remaining_candies_in_jar{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        final int N = 10; // no of candies
        final int k = 5; // minimum candies threshold
        int candies = N;

        System.out.print("\ncandies customers wants: ");
        int n = sc.nextInt();

        if(n < 0 || n > candies){
            System.out.println("INVALID INPUT");
            System.out.println("NO OF CANDIES LEFT " + candies);
            return;
        }

        candies -= n;

        if(candies <= k){
            candies = N;     // if the required candies is greater than threshold, then refill it.
        }

        System.out.println("NUMBER OF CANDIES SOLD: "+ n);
        System.out.print("NO OF CANDIES AVAILABLE "+ candies);
    }
}