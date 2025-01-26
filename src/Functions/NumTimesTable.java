package Functions;

import java.util.Scanner;

public class NumTimesTable {

    public static void PrintTable( int num ){

        //print num 's table until 10
        for(int i = 1; i <= 10 ; i++){
            int answer = num * i;
            System.out.println( num + "x" + i + " = " + answer );
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num: ");
        int value = sc.nextInt();

        PrintTable( value );
    }

}
