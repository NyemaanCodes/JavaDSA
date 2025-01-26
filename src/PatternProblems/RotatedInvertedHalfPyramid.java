package PatternProblems;

import java.util.Scanner;

public class RotatedInvertedHalfPyramid {

    /*
    n=5

         *
        **
       ***
      ****
     *****

     */
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();

        for(int i=n; i>=1; i--) {
            //print spaces first
            for(int j=1; j<i; j++) {
                System.out.print(" ");
            }
            //then print *'s
            for(int j=0; j<=n-i; j++) {
                System.out.print("*");
            }
            //goto next line
            System.out.println();
        }
    }

}
