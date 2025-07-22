import java.util.Scanner;
public class ra_19_number_series_twist_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] intArray = new int[31];

        intArray[1] = 0;
        intArray[2] = 0;

        for(int i = 3; i <= 30; i++){
            if(i % 2 != 0){
                intArray[i] = intArray[i-2] + 7;
            }
            else{
                intArray[i] = intArray[i-2] + 6;
            }
        }
        System.out.println("your series is: ");
        for(int i = 1; i <=30; i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println("\n");
        System.out.print("enter the index (not more than 30): ");
        int n = sc.nextInt();
        System.out.println("value present: " + intArray[n]);
    }
}
