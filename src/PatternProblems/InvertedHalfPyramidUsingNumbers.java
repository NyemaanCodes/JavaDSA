package PatternProblems;

import java.util.Scanner;

public class InvertedHalfPyramidUsingNumbers {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();

        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
