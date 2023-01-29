/**
Write a program to ask the user to enter the number of branches of mysirg academy.
Now ask the user to enter the number of courses running in first branch and the number of
students in each course of that branch and do the same process for rest mysirg academy
branches.

Now calculate and display the total number of students in each branch of mysirg academy.
*/

import java.util.Scanner;

public class MysirgBranches {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        System.out.print("Enter how many branches of MySirG Academy : ");
        int branches = sc.nextInt();

        // creating a array of size number of branches
        int [][][]mysirgAcademy = new int[branches][][];

        for(int i = 0; i < mysirgAcademy.length; i++) {
            System.out.print("How many courses running in " + (i+1) + " branch : ");
            mysirgAcademy[i] = new int[sc.nextInt()][];

            for(int j = 0; j < mysirgAcademy[i].length; j++) {
                System.out.print("How many students in " + (j+1) + " course : ");
                mysirgAcademy[i][j] = new int[sc.nextInt()];
            }
        }

        // calculating and displaying total number of students in each branch
        int branch = 1;
        for(int [][]i : mysirgAcademy) {
            int totalStudents = 0;

            for(int []j : i) {
                totalStudents += j.length;
            }

            // printing number of students
            System.out.println("Students in " + (branch++) + " branch : " + totalStudents);
        }
    }
}