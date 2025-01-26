package Functions;

import java.util.Scanner;

public class Sumof2Numbers {
    //Function
    public static int add(int a, int b) {
        return a+b;
    }

    //main method
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        int result = add(a, b);
        System.out.println(result);
    }
}
