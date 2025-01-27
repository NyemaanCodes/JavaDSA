package Functions;

import java.util.Scanner;

public class countNumbers {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int positiveCount = 0;
            int negativeCount = 0;
            int zeroCount = 0;

            // Loop to take user input until they choose to stop
            while (true) {
                System.out.println("Enter a number (or type 'exit' to finish): ");
                String input = sc.next();

                // Check if the user wants to exit
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                // Convert input to integer
                int num;
                try {
                    num = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer or type 'exit' to finish.");
                    continue;
                }

                // Count the number of positives, negatives, and zeros
                if (num > 0) {
                    positiveCount++;
                } else if (num < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            }

            // Display the counts
            System.out.println("Positive numbers count: " + positiveCount);
            System.out.println("Negative numbers count: " + negativeCount);
            System.out.println("Zeroes count: " + zeroCount);
        }
}


