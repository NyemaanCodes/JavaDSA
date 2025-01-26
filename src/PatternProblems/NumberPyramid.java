package PatternProblems;

import java.util.Scanner;

public class NumberPyramid {
    /*

    Enter n: 5
        1           -> row :1 | spaces: 4 | no. of values: 1 | value: 1
       2 2          -> row :2 | spaces: 3 | no. of values: 2 | value: 2
      3 3 3         -> row :1 | spaces: 2 | no. of values: 3 | value: 3
     4 4 4 4        so on
    5 5 5 5 5



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


            //numbers
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}

