/**
write a program to accept n positive and negative integers in array in random order now
rearrange the array such that beginning part of array contains positive numbers followed by
negative numbers.
*/

import java.util.Scanner;

public class RearrangeArray {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many elements you want to store : ");
        int n = sc.nextInt();

        // creating a array of size n
        int []arr = new int[n];

        // accepting elements in an array
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // rearranging array 
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                int j = i+1;

                while(j < arr.length) {
                    if(arr[j] >= 0) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                    j++;
                }

                // checking if j reaches array length
                if(j == arr.length-1) {
                    break;
                }
            }
        }

        // printing rearranged array
        for(int e : arr) {
            System.out.print(e + " ");
        }
    }
}