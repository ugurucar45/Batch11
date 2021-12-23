package PracticeMyself.WeeklyProject5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
//        Ask the user to enter one in number between 1 to 10 then, Write theprogram to print the string in the following format:
//        Example:
//        Input: 6
//        Output:
//        666666
//        55555
//        4444
//        333
//        22
//        1
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter one number between 1 to 10");
        int line = sc.nextInt();
        int say = line;
        if (line > 0 && line < 11) {
            for (int i = 1; line >= i; i++, say--) {
                if (i == 1) {
                } else {
                    System.out.println();
                }
                for (int j = say; j >= 1; j--) {
                    System.out.print(say);
                }
            }
        } else {
            System.out.println("Please enter between 1 to 10");
        }
    }
}