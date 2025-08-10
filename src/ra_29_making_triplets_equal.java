/*
Example:

Input:

3

1 2 3

4 4 4

2 2 8

Output:

-1

0

3
 */
import java.util.Scanner;
public class ra_29_making_triplets_equal {

    public static int calculateStep(int a, int b, int c){
        if(a == b && b == c){
            return 0;
        }
        if(a == b){
            int diff = c - a;
            return (diff >= 0 && diff % 2 == 0) ? diff/2 : -1;      // for the conventional methode check the
        }                                                           // Beginner_friendly_DSA_questions repo
        if(b == c){
            int diff = a - b;
            return (diff >= 0 && diff % 2 ==0) ? diff/2 : -1;
        }

        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[][] inputs = new int[T][3];
        for(int i = 0; i < T; i++){
            inputs[i][0] = sc.nextInt();
            inputs[i][1] = sc.nextInt();
            inputs[i][2] = sc.nextInt();
        }

        for(int i = 0; i < T ; i++){
            int a = inputs[i][0];
            int b = inputs[i][1];
            int c = inputs[i][2];

            System.out.println(calculateStep(a,b,c));
        }
    }
}
