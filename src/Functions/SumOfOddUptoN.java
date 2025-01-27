package Functions;

import java.util.Scanner;

public class SumOfOddUptoN {

    public static void printSumOfOdds(int n){

        int sumAnswer = 0;

        for(int i=0;i<=n;i++){
            //odd integers are not divisble by 2, meaning always have a remainder >0
            if(i%2 != 0){
                sumAnswer += i;
            }
        }

        System.out.println("Answer: " +sumAnswer);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        printSumOfOdds(n);
    }
}
