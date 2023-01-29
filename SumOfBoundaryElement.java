/**
Write a program to create a 2d int array of size nxm where n and m should be taken by
user. Now accept input in it. Now find the sum of all boundary elements.

(that means only the elements which are available on border of array).
*/

import java.util.Scanner;

public class SumOfBoundaryElement {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter nth size of array ");
		int n = sc.nextInt();
		int [][]arr = new int [n][];

		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter mth size of array");
			arr[i] = new int [sc.nextInt()];

			for( int j = 0 ; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
            }
		}

        // creating a variable to store sum
		int sum = 0;

        // calculating sum of boundary elements in an array
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j != 2 ; j++) {
				if(j == 0) {
					sum += arr[i][j];
                }
				else {
					sum += arr[i][arr[i].length - 1];
                }
			}
		}

        // printing sum of boundary elements
		System.out.println("Sum of boundary elements is : " + sum);
    }
}