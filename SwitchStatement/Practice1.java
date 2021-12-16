package SwitchStatement;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        /*
        get a number between 1 to 4from user
        print out name of a season as:
        1--> winter
        2--> spring
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1-4 to select a season" +
                "\n1- Winter\n2- Spring\n3- Summer\n4- Fall");
        int a = sc.nextInt();
        switch (a) {
            default:
                System.out.println("Please check your answer must be in 1-4");
                break;
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Summer");
                break;
            case 4:
                System.out.println("Fall");
                break;
        }
    }
}
