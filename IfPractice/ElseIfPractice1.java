package IfPractice;

import java.util.Scanner;

public class ElseIfPractice1 {
    public static void main(String[] args) {
/*
    get three test result from user and calculate the average of those three tests
    test scores should be in range of 0 to 100
    based on the average score:
    -print out letter grade for this student
    average between --> 100-90 --> your letter grade is A
                    --> 89-80  --> your letter grade is B
                    --> 79-80  --> .................... C
                    --> less than 60 --> you should take the course again
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a first text");
        int a = scan.nextInt();
        System.out.println("Please enter a second text");
        int b = scan.nextInt();
        System.out.println("Please enter a third text");
        int c = scan.nextInt();
        int av = (a + b + c) / 3;
        if (a > 0 && a < 100 && b > 0 && b < 100 && c > 0 && c < 100) {
            if (av >= 90) {
                System.out.println("your letter grade is A");
            } else if (av >= 80) {
                System.out.println("your letter grade is B");
            } else if (av >= 60) {
                System.out.println("your letter grade is C");
            } else {
                System.out.println("your should take the course again");
            }
        } else
            System.out.println("Your input of text result is out of range");


    }
}