/**
Write A program to accept n digit number now find the length of that number and store
each digit in array. Now find the sum and average of stored element.
*/

import java.util.Scanner;

public class FindSumAverage {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        // accepting a number from the user
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // calculating number of digits in number
        int digits = (int)Math.floor(Math.log10(num) + 1);

        // creating a array of size digits
        int []arr = new int[digits];

        // accepting element from the user
        for(int i = 0; i < arr.length; i++) {
            arr[i] = num%10;
            num /= 10;
        }

        // creating variables to store sum and average
        int sum = 0;
        double avg = 0.0;

        for(int e : arr) {
            sum += e;
        }

        System.out.println("Sum : " + sum + "\nAverage : " + (float)sum/arr.length);
    }
}