/**
write a program to find largest and smallest number in unsorted array of 10 integers.
*/

public class FindLargestSmallestInArray {
    public static void main(String []args) {

        // creating an unsorted array of 10 integers
        int []arr = {23, 34, 12, 67, 89, 54, 98, 95, 100, 65};

        // creating two variables to store largest and smallest element
        int largest = arr[0];
        int smallest = arr[0];

        // finding largest and smallest element in an array
        for(int e : arr) {
            if(e > largest) {
                largest = e;
            } 
            if(e < smallest) {
                smallest = e;
            }
        }

        // printing largest and smallest element
        System.out.println("Largest : " + largest + "\nSmallest : " + smallest);
    }
}