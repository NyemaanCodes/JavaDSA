package Functions;

import java.util.Scanner;

public class FibonacciSeries {

    public static void PrintFibonacci(int n){
        // Variables to store the first two terms of the Fibonacci series
        int t1 = 0, t2 = 1;

        System.out.print("Fibonacci Series of " + n + " terms: ");

        // Loop to generate and print the Fibonacci series
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");

            // Calculate the next term
            int nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter the number of terms
        System.out.println("Enter the number of terms for the Fibonacci series: ");
        int n = sc.nextInt();

        PrintFibonacci(n);


    }
}

