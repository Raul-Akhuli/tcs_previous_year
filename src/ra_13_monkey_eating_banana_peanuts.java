import java.util.Scanner;
public class ra_13_monkey_eating_banana_peanuts {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = 0;

        System.out.println("enter the number of monkey present initially: ");
        int n = sc.nextInt();
        System.out.println("enter the min number of banana can eat by a monkey: ");
        int k = sc.nextInt();
        System.out.println("enter the min number of peanuts can eat by a monkey: ");
        int j = sc.nextInt();

        System.out.println("enter no of banana provided by the tourists:");
        int m = sc.nextInt();
        System.out.println("enter no of peanuts provided by the tourists: ");
        int p = sc.nextInt();

        if(m % k != 0){
            count ++;
        }
        count = count + m/k;
        if(p % j != 0){
            count++;
        }
        count = count + p/j;

        if((n - count) >= 0){
            System.out.println("monkey remaining: " + (n-count));
        }
        else{
            System.out.println("INVALID INPUTS!");
        }
    }
}
