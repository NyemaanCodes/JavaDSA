package Arrays.Arrays2D;

import java.util.Scanner;

public class MatrixInputOutput {

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

            // Printing the elements of the matrix
            System.out.println("The matrix is: ");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
}
