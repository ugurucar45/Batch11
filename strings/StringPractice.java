package strings;

import java.util.Locale;
import java.util.Scanner;

public class StringPractice {
    //.toLowerCase(); == makes the all letters lower case
    //.toUpperCase(): == makes the all letters upper case
    public static void main(String[] args) {

        String str = "david";
        str.toUpperCase();
        //if we dont reassign the string
        //it will not change its value

        System.out.println(str);
        //yusuf
        str=str.toUpperCase();
        System.out.println();
        //YUSUF

        //We will ask user to their first name
        //We will ask user to their last name
        //we will print firstName in lower case
        //last name in upper case

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName= scan.nextLine();
        System.out.println("Please enter your last name");
        String lastName= scan.nextLine();

        System.out.println(firstName.toLowerCase(Locale.ROOT)+" "+lastName.toUpperCase(Locale.ROOT));
    }
}