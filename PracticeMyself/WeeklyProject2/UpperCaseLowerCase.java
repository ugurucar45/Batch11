package PracticeMyself.WeeklyProject2;

import java.util.Scanner;

public class UpperCaseLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pas = sc.nextLine();

        if (pas.toUpperCase() == pas || pas.toLowerCase() == pas) {
            System.out.println("Your password is not acceptable");
        } else {

            if (pas.charAt(0) >= 'A' && pas.charAt(0) <= 'Z' && pas.charAt(pas.length() - 1) < 65) {
                System.out.println("Your password is strong");
            } else if (pas.charAt(0) >= 'a' && pas.charAt(0) <= 'z' && pas.charAt(pas.length() - 1) >= 'A' && pas.charAt(pas.length() - 1) <= 'Z') {
                System.out.println("Your Passport should be improved");
            } else System.out.println("Your password is not valid");

        }
    }
    }

