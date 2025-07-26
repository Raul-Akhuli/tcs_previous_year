import java.util.Scanner;
public class ra_14_calculate_commission {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the parent name: ");
        String parent = sc.next();
        System.out.print("\nenter (Y) to add child: ");
        char child = sc.next().charAt(0);


        if(child == 'Y'){
            System.out.println("enter name ' , ' separated: ");
            String inputLine = sc.next();
            String[] stringArray = inputLine.split(",");

            int count  = stringArray.length;
            System.out.println("total number: " + (count +1));
            System.out.println("commission details: ");
            System.out.println(parent +": "+ ((count * 10 * 5000)/100));
            for (String s : stringArray) {
                System.out.println(s + ": " + ((5000 * 5) / 100));
            }
        }
        else{
            System.out.println(parent + ": " + ((5000*5)/100));
        }
        sc.close();
    }
}
