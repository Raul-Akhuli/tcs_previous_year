import java.util.Scanner;
public class ra_18_prime_number_twist {
    public static boolean checkPrime(int n){
        if(n <= 1){
            return false;
        }
        else{
            for(int i = 2; i*i <= n; i++){
                if(n % i == 0) return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();

        if(n < 0){
            System.out.println("please enter a positive number.");
        }
        else{
            if(checkPrime(n)){
                System.out.println("entered number is prime.");
            }
            else{
                System.out.println("entered number is not prime.");
            }
        }
    }
}
