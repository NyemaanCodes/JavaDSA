package Arrays.Arrays1D;

import java.util.Scanner;

public class ArrayMaxMin {

    // Function to find the maximum number in the array
    public static int findMax(int[] arr) {
        int max = arr[0];
        //start i from 1, since we already considered 0 index value and max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Function to find the minimum number in the array
    public static int findMin(int[] arr) {
        int min = arr[0];
        //start i from 1, since we already considered 0 index value and max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
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

        // Finding and displaying the maximum and minimum numbers in the array
        int max = findMax(arr);
        int min = findMin(arr);
        System.out.println("Maximum number in the array is: " + max);
        System.out.println("Minimum number in the array is: " + min);
    }
}

