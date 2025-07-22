import java.util.Scanner;
public class ra_16_doctor_patients_total_income {
    public static int calculateTotalIncome(int n){
        Scanner sc = new Scanner(System.in);
        int total_income = 0;
        int[] intArray = new int[n];
        System.out.println("enter each patient's age separated by enter: ");
        for(int i = 0; i < n; i++){
            intArray[i] = sc.nextInt();
            if(intArray[i] < 17){
                total_income = total_income + 200;
            }
            else if(intArray[i] >= 17 && intArray[i] <= 40){
                total_income = total_income + 400;
            }
            else{
                total_income = total_income + 300;
            }
        }
        return total_income;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of patient: ");
        int n = sc.nextInt();
        if(n<0 || n>120){
            System.out.println("Invalid input!");
        }
        else{
            System.out.println("total income: " + calculateTotalIncome(n));
        }
    }
}
