package Arrays.Arrays2D;

import java.util.Scanner;

public class SearchMatrix {

    // Function to search for an element x in the matrix
    public static boolean searchElement(int[][] matrix, int x) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == x) {
                    //print index aka location of the found element x
                    System.out.println("Row: " + i+1 +" Column" + j+1 );
                    return true; // Element found, return to main function
                }
            }
        }
        return false; // Element not found, return to main function
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter the number of rows and columns
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Declaring the matrix
        int[][] matrix = new int[rows][cols];

        // Prompting the user to enter the elements of the matrix
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Prompting the user to enter the element to search for
        System.out.println("Enter the element to search for: ");
        int x = sc.nextInt();

        // Searching for the element in the matrix
        boolean found = searchElement(matrix, x);

        // Displaying the result
        if (found) {
            System.out.println("Element " + x + " is found in the matrix.");
        } else {
            System.out.println("Element " + x + " is not found in the matrix.");
        }
    }
}
