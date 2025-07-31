/* TestCases:
3 5
Output
54

Explanation
3rd prime number → 5
5th prime number → 11
Output → (5 * 11) - 1 = 54

 */

import java.util.Scanner;
public class ra_21_index_wise_prime_product_subtract {
    public static boolean isPrime(int n){
        if(n <= 1) return false;

        for(int i = 2; i*i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;

        for(int i = 2; i <= 100; i++){
            if(isPrime(i)){
                count++;
            }
        }
        int index = 0;
        int[] prime = new int[count];
        System.out.println("prime no array: " );
        for(int i = 0; i <= 100; i++){
            if(isPrime(i)){
                prime[index++] = i;
                System.out.print(i + ",");
            }
        }

        System.out.println("\nenter 2 integer space separated: ");

        String inputLine = sc.nextLine().trim();
        String[] stringArray = inputLine.split("\\s+");

        int a = Integer.parseInt(stringArray[0]);
        int b = Integer.parseInt(stringArray[1]);

        int result = (prime[a-1] * prime[b-1]) - 1;

        System.out.println("output: " + result);
    }
}
