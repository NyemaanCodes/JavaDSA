package PatternProblems;

import java.util.Scanner;

public class Triangle01 {

    /*
    n = 5;
    all even positions print 1, else print 0

    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
     */
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit n: ");
        n = sc.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }

}
