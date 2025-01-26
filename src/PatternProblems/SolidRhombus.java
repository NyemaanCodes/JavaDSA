package PatternProblems;

import java.util.Scanner;

public class SolidRhombus {

    /*
    Enter n: 5
        *****
       *****
      *****
     *****
    *****
     */

    public static void main(String[] args){

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }


            //stars
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
