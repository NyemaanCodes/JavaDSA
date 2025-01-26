package Functions;

import java.util.Scanner;

public class Factorial {

    public static void Factorial ( int num ){

        //Incase value passed is not correct, meaning who's factorial does not exist
        if(num < 0) {
            System.out.println("Invalid Number");
            return;
        }

        //let default value be set as 1
        int factorial = 1;
        for(int i=num; i>=1; i--) {
            factorial = factorial * i;
        }


        System.out.println(factorial);

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");
        int value = sc.nextInt();

        Factorial(value);
    }
}
