import java.util.Scanner;
public class ra_17_check_leapyear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year: ");
        int n = sc.nextInt();

        if(n % 100 == 0){
            if(n % 400 == 0){
                System.out.println("entered year is leapyear.");
            }
        }
        else if(n % 4 == 0){
            System.out.println("entered year is leapyear");
        }
        else{
            System.out.println("entered year is not a leapyear.");
        }
    }
}
