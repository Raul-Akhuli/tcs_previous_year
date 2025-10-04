/*
95
92
95
92
90
92
90
92
90
OUTPUT VALUES
Trainee Number : 1
Trainee Number : 3

 */


import java.util.Scanner;

public class ra_8_fit_trainee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0,b = 0,c = 0;

        int [] arr = new int[9];

        for(int i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
            if(arr[i] <1 || arr[i] >100){            // a number can not be both at the same time
                System.out.println("INVALID INPUT");
                return;
            }
        }
        for(int i = 0; i < 9; i+=3){
            a += arr[i];
            b += arr[i+1];
            c += arr[i+2];
        }
        int A = a/3;
        int B = b/3;
        int C = c/3;

        if(A < 70 && B < 70 && C < 70){
            System.out.println("All trainees are unfit.");
            return;
        }
        int maxAvg = Math.max(A, Math.max(B,C));
        if(A == maxAvg) System.out.println("Trainee Number: 1");

        if(B == maxAvg) System.out.println("Trainee Number: 2");

        if(C == maxAvg) System.out.println("Trainee Number: 3");

    }
}
