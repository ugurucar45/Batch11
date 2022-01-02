package loops.While_DoWhile;

import java.util.Scanner;

public class CountLowerCaseInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String value");
        String str = sc.nextLine();
        int a = 0,b=0;
        while (a < str.length()) {
           // if (str.charAt(a) == str.toLowerCase().charAt(a)) {
            if(str.charAt(a)>='a'&&str.charAt(a)<='z'){
                b++;
            }
            a++;
        }
        System.out.println("Your String has "+b+" lowercase letter");
    }
}
