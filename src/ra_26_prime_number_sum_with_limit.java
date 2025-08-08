import java.util.Scanner;
public class ra_26_prime_number_sum_with_limit {

    public static boolean isPrime(int n){
        if(n <= 1) return false;

        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the limit: ");
        int limit = sc.nextInt();
        int sum = 0;
        for(int i = 2; i <= limit; i++){
            if(isPrime(i)){
                sum = sum + i;
            }
        }
        System.out.println("sum from 2 to "+ limit +" is: "+ sum);
    }
}
