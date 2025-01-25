package PatternProblems;

import java.util.Scanner;

public class SolidRectangle {
    /*
    Print a Solid Rectangle, given the only breadth of rectangle
    let n=5
    o/p:

            *****
            *****
            *****
            *****
     */

    public static void main(String[] args){

        //Take input from user
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter n: ");
        n = sc.nextInt();

        for(int i= 0 ; i< n-1 ; i++){
            for (int j = 0 ; j<n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
