package Loops.While_DoWhile;

import java.util.Scanner;

public class FindingDivisorTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Task:
        // Ask user to enter an integer value and find the divisors of the given number
        // 10 --> 1,2,5,10
        int inputNumber = sc.nextInt();
        int divisor = 1;
        while (divisor<=inputNumber) {
            if (inputNumber%divisor==0){
            System.out.println(divisor + " is divisor of " + inputNumber);}
            divisor++;
        }


    }
}