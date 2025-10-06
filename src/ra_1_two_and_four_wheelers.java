import java.util.Scanner;

public class ra_1_two_and_four_wheelers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the no of vehicle: ");
        int v = sc.nextInt();

        System.out.print("enter the no of wheel: ");
        int w = sc.nextInt();

        int TW = (4*v - w) / 2;
        int FW = 200 - TW;

        System.out.println("TW = " + TW + " FW = " + FW);
    }
}