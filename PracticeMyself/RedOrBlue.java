package PracticeMyself;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RedOrBlue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password");
        String str = sc.nextLine().toLowerCase();
        int a = 0, b = 0, c = 0, d = 0;
        while (a < str.length()) {
            if (str.charAt(a) == 'r') {
                while (b < str.length()) {
                    if (str.charAt(b) == 'e') {
                        while (c < str.length()) {
                            if (str.charAt(c) == 'r') {
                                System.out.println("red");
                            }
                            c++;
                        }
                    }
                    b++;
                }
            }
            if (str.charAt(a) == 'b') {
                while (b < str.length()) {
                    if (str.charAt(b) == 'l') {
                        while (c < str.length()) {
                            if (str.charAt(c) == 'u') {
                                while (d < str.length()) {
                                    if (str.charAt(d) == 'e') {
                                        System.out.println("blue");
                                    }
                                    d++;
                                }
                            }
                            c++;
                        }
                    }
                b++;}
            }
            a++;}
    }
}