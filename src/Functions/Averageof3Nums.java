package Functions;

import java.util.Scanner;

public class Averageof3Nums {

    public static void printAvg(int x, int y, int z){

        int avg = (x+y+z)/3;
        System.out.println("Average: " + avg);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        printAvg(a,b,c);
    }
}
