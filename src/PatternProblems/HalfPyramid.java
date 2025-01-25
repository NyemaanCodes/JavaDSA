package PatternProblems;

import java.util.Scanner;

public class HalfPyramid {
    /*
    n = 4
    o/p

        *
        **
        ***
        ****
    */


    public static void main(String[] args){

        int n;

        //Define a Scanner object to scan input from user
        Scanner sc = new Scanner(System.in);
        //Take input from user and store in variable n
        System.out.println("Enter n: ");
        n = sc.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


}
