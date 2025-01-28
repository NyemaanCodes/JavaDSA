package Arrays.Arrays2D;

import java.util.Scanner;

public class PrintTransposeMatrix {

    // Function to transpose the given matrix
    // Function return type is 2D array, i.e, and 2D array is returned to main function
    public static int[][] transpose(int[][] matrix, int rows, int cols) {
        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
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

        // Transposing the matrix
        //call the function and save the returned 2D matrix in 2D matrix, transposedMatrix
        int[][] transposedMatrix = transpose(matrix, rows, cols);

        // Printing the transposed matrix
        System.out.println("The transposed matrix is: ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
