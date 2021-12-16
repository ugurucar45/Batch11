package PracticeMyself.WeeklyProject2;

import java.util.Scanner;

public class AddinSum {
//    //Write a Java
//    //Test Data;
//    //      74+36
//    //Expected Output;
//    // 110
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please Input First Number");
//        int a =scan.nextInt();
//
//        System.out.println("Please Input Second Number");
//        int b =scan.nextInt();
//
//        System.out.println("sum of first number and second numbers ---->"+ (a+b));
//
//        // true && true ===>    true
//        // false && true===>    false
//        // (false && true )|| (true && true) ===>    true
//
//
public static void main(String[] args) {
    Scanner inpur= new Scanner(System.in);
    System.out.println("Please enter first number");
    int number1=inpur.nextInt();
    System.out.println("Please enter second number");
    int number2=inpur.nextInt();

    System.out.println("Your result is ---> "+ number1*number2);

}
    }

