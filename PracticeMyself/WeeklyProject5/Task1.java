package PracticeMyself.WeeklyProject5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        Reverse a given String and return it, if they have space in the beginning and at the end then remove it.
//        Example:
//        " Job" -> "boJ"
//                * " Happy " -> "yppaH"
//                * "Sun " -> "nuS"
//                * " Dream Job!" -> "!boJ maerD"

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = sc.nextLine();
        String rts = "";
        char a=' ';
        for (int b=0; a == str.charAt(b); b++) {
            if (str.substring(0, 1).equals(" ")) {
                str = str.substring(1);
            }
        }//use trim
      //  for ( int c = str.length(); a == str.crrrrrrrrrrrrrrrrrharAt(c); c--) {
            if (str.substring(str.length() - 1).equals(" ")) {
                str = str.substring(0, str.length() - 1);
                //c--;
        //    }
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            rts = rts + str.substring(i, i + 1);
        }
        System.out.println(rts);
    }
}
