package PracticeMyself.WeeklyProject5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        Reverse a given String and return it, if they have space in the beginning and at the end then remove it.
//        Example:
//        " Job" -> "boJ"
//                * " Happy" -> "yppaH"
//                * "Sun " -> "nuS"
//                * " Dream Job!" -> "!boJ maerD"

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = sc.nextLine();
        String rts = "";
//        str=str.trim();                                       //or it is really easy another way
        for (int b = 0; ' ' == str.charAt(b); b++) {            //like trim method
            if (str.substring(0, 1).equals(" ")) {
                str = str.substring(1);
                b--;
            }
        }                                                       //easy way trim
        for (int c = str.length() - 1; ' ' == str.charAt(c); c--) {
            if (str.substring(str.length() - 1).equals(" ")) {
                str = str.substring(0, str.length() - 1);
            }
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            rts = rts + str.substring(i, i + 1);
        }
        System.out.println(rts);
    }
}
