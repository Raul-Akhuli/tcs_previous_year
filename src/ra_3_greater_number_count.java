/*
For example,
Arr[]={7,4,8,2,9}
As 7 is the first element, it will consider in the result.
8 and 9 are also the elements that are greater than all of its previous elements.
Since total of 3 elements is present in the array that meets the condition.
Hence, the output = 3.

Example 1:

Input
5 -> Value of N, represents size of Arr
7 -> Value of Arr[0]
4 -> Value of Arr[1]
8 -> Value of Arr[2]
2 -> Value of Arr[3]
9 -> Value of Arr[4]

Output
3
 */



import java.util.Scanner;

public class ra_3_greater_number_count{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int count = 1;
        int maxSofar = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > maxSofar){
                count ++;
                maxSofar = arr[i];
            }
        }

        System.out.print(count);
    }
}