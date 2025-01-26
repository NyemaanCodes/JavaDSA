package Functions;

import java.util.Scanner;

public class CheckPrime {

    public static void prime(int num){

        if(num <1 ){
            System.out.println("Invalid Value");
        }

        // Loop to check if the num is only divisible by 1 and itself
        for(int i = 2; i < num ; i++){

            if( num%i == 0 ){
                //if anytime found divisible print NOT Prime adn exit loop
                System.out.println("Not Prime");
            }
            //if not prime  back to main function
            return;

        }
        //Else print it is Prime
        System.out.println("Prime");

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int value = sc.nextInt();

        prime(value);
    }
}
