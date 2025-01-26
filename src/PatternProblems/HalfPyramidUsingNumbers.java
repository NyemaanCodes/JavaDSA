package PatternProblems;

import java.util.Scanner;

public class HalfPyramidUsingNumbers {
    /*
    n=5

    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

     */

    public static void main(String[] args) {
        int n;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                // print value of j
                System.out.print(j);
            }
            System.out.println();
        }
    }



}
