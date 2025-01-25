package PatternProblems;

import java.util.Scanner;

public class HollowRectangle {

    /*
    length = 5
    breadth =7

    o/p
    *******
    *     *
    *     *
    *     *
    *******

     */

        public static void main(String[] args) {
            int length,breadth;
            //Take value from user
            Scanner sc = new Scanner(System.in);
            //Take length input
            System.out.println("Enter Length: ");
            length= sc.nextInt();
            //Take breadth input
            System.out.println("Enter Breadth: ");
            breadth = sc.nextInt();

            for(int i=0; i<length; i++) {
                for(int j=0; j<breadth; j++) {

                    if(i == 0 || i == length-1 || j == 0 || j == breadth-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }
}

