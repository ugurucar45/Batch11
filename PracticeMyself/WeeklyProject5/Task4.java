package PracticeMyself.WeeklyProject5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//        Ask the user to enter one number between 1 to 10 then, Write the program to print the string in the following format:
//        Example:
//        Input: 5
//        Output:
//        1
//        22
//        333
//        4444
//        55555
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter one number between 1 to 10");
        int line = sc.nextInt();
        if (line > 0 && line < 11) {
            for (int i = 1; line >= i; i++) {
                for (int j = 1; i >= j; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        } else {
            System.out.println("Please enter between 1 to 10");
        }
    }
}
