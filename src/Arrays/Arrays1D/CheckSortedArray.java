package Arrays.Arrays1D;

import java.util.Scanner;

public class CheckSortedArray {

        // Function to check if an array is sorted in ascending order
        public static boolean isSortedAscending(int[] arr) {

            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    return false; // If any pair is out of order, return false
                }
            }

            return true; // If no pairs are out of order, return true
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Prompting the user to enter the number of elements in the array
            System.out.println("Enter the number of elements in the array: ");
            int n = sc.nextInt();

            // Declaring the array
            int[] arr = new int[n];

            // Prompting the user to enter the elements of the array
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Checking if the array is sorted and displaying the result
            if (isSortedAscending(arr)) {
                System.out.println("The array is sorted in ascending order.");
            } else {
                System.out.println("The array is not sorted in ascending order.");
            }
        }

}
