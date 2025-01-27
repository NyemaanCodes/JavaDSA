package Functions;

import java.util.Scanner;

public class FindGreaterOf2Nums {

    public static void printGreater(int x, int y){

        if(x>y){
            System.out.println("Greater: " + x);
        }
        else if (x==y) {
            System.out.println("BOTH EQUAL");
        }
        else {
            System.out.println("Greater: " + y);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        printGreater(a,b);
    }
}
