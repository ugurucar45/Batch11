package Loops.While_DoWhile;

import java.util.Scanner;

public class MakingStarTree {
    public static void main(String[] args) {
        /*
            -Ask user to provide a number between 3 to 10
            - make a star tree for that many line
            (Use Do-While Loop to implement solution)
    ex: input --> 4
                  *
                  **
                  ***
                  ****
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 3 to 10");
        int a = sc.nextInt(),b=0;
        String str = "";
        if (a >= 3 && a <= 10) {
            do {
                str=str.concat("*");
                System.out.println(str);
                b++;
            } while (b<a);
        }
    }
}
