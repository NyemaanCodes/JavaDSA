package Arrays.Arrays2D;

import java.util.Scanner;

public class PrintMatrixSpiralManner {
    // Function to print the matrix in spiral order
    public static void printSpiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        // Loop until the entire matrix is printed
        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++; // Move the top boundary down

            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--; // Move the right boundary left

            // Check if there are more rows to be processed
            if (top <= bottom) {
                // Traverse from right to left along the bottom row
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--; // Move the bottom boundary up
            }

            // Check if there are more columns to be processed
            if (left <= right) {
                // Traverse from bottom to top along the left column
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++; // Move the left boundary right
            }
        }
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

        // Printing the matrix in spiral order
        System.out.println("The matrix in spiral order is: ");
        printSpiralOrder(matrix);
    }
}
