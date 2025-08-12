/*
Enter your PlainText: All the best
Enter the Key: 1
The encrypted Text is: Bmm uif Cftu
 */

import java.util.Scanner;
public class ra_10_caesar_cipher_shift_by_one {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PlainText: ");
        String message = sc.nextLine();
        System.out.print("Enter the Key: ");
        int key = sc.nextInt();

        if(key == 0){
            System.out.println("Invalid Input.");
        }
        else{
            StringBuilder encrypted = new StringBuilder();

            for(char c : message.toCharArray()){
                if(Character.isUpperCase(c)){
                    encrypted.append((char)((c - 'A' + key) % 26  + 'A'));
                }
                else if (Character.isLowerCase(c)){
                    encrypted.append((char)((c - 'a' + key) % 26 + 'a'));
                }
                else if(Character.isDigit(c)){
                    encrypted.append((char)((c - '0' + key) % 10 + '0'));
                }
                else{
                    encrypted.append(c);
                }
            }
            System.out.print("The encrypted Text is: ");
            System.out.println(encrypted);                         // internally call the toString function.
        }
    }
}
