package Functions;

import java.util.Scanner;

public class PowerCalculation {

    // Function to calculate x^n
    public static int power(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter two numbers
        System.out.println("Enter the base number (x): ");
        int x = sc.nextInt();
        System.out.println("Enter the exponent (n): ");
        int n = sc.nextInt();

        // Calculating x^n and displaying the result
        int result = power(x, n);
        System.out.println("The result of " + x + "^" + n + " is: " + result);
    }
}
