/*
For low level water, the time estimate is 25 minutes, where approximately weight is
between 2000 grams or any nonzero positive number below that.

For medium level water, the time estimate is 35 minutes, where approximately weight is
between 2001 grams and 4000 grams.

For high level water, the time estimate is 45 minutes, where approximately weight is
above 4000 grams.

Assume the capacity of machine is maximum 7000 grams
Where approximately weight is zero, time estimate is 0 minutes.

Input value
2000
Output value
Time Estimated: 25 minutes

 */

import java.util.Scanner;
public class ra_9_estimated_time_for_washing_machine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value");
        int weight = sc.nextInt();


        if(weight >= 0 && weight <=7000){
            System.out.println("Output value");
            if(weight == 0){
                System.out.println("Time Estimated: 0 minutes");
            }
            else if(weight <=2000){
               System.out.println("Time Estimated: 25 minutes");
            }
            else if(weight <=4000){
                System.out.println("Time Estimated: 35 minutes");
            }
            else{
                System.out.println("Time Estimated: 45 minutes");
            }
        }
        else{
            System.out.println("INVALID INPUT");
        }
    }
}
