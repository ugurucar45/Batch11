package IfPractice;


import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word= scan.nextLine();
        word=word.toUpperCase(Locale.ROOT);
        char a=word.charAt(0);
        if (word.startsWith("m")||word.startsWith("M"))
            System.out.println("Monday");
        if (a=='T')
            System.out.println("Tuesday/Thursday");
        if (a=='W')
            System.out.println("Wednesday");
        if (a=='F')
            System.out.println("Friday");
        if (a=='S')
            System.out.println("Saturday/Sunday");
        if (!word.startsWith("m")&&!(a=='T')&&!(a=='W')&&!(a=='F')&&!(a=='S'))
            System.out.println("Out of range");

    }
}
