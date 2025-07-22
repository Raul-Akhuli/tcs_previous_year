import java.util.Scanner;
public class ra_20_number_series_twist_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] intArray = new int[31];
        intArray[1] = 1;
        intArray[2] = 1;

        for(int i = 3; i <= 30; i++){
            if(i % 2 != 0){
                intArray[i] = intArray[i-2] * 2;
            }
            else{
                intArray[i] = intArray[i-2] * 3;
            }
        }
        System.out.println("your array is: ");
        for(int i = 1; i <= 30; i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println("\n");
        System.out.print("enter the index (not more than 30): ");
        int n = sc.nextInt();
        System.out.println("\nvalue present " + intArray[n]);
    }
}
