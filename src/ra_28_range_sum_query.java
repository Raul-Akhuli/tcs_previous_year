/*
Example Input:

3

0 3

2 6

10 20

Example Output:

1: Sum from 0 to 3: 0 + 1 + 2 + 3 = 6

2: Sum from 2 to 6: 2 + 3 + 4 + 5 + 6 = 20

3: Sum from 10 to 20: 10+11 +..+ 20=165
 */
import java.util.Scanner;
public class ra_28_range_sum_query {

    public static long calculateSum(int a, int b){

        return (long) b*(b+1)/2 - (long) a*(a-1)/2;          // sum(a to b) = b*(b+1)/2 - a*(a-1)/2
                                                             // use this formula instead of for loop (time besi lagbe re pagol..)
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[][] inputs = new int[T][2];

        for(int i = 0; i < T; i++){
            inputs[i][0] = sc.nextInt();
            inputs[i][1] = sc.nextInt();
        }

        for(int i = 0; i < T; i++){
            int a = inputs[i][0];
            int b = inputs[i][1];

            System.out.println("sum form " + a + " to " + b + " is: " + calculateSum(a,b));
        }
    }
}
