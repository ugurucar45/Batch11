package PracticeMyself;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPassword {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a password");
            String passportInput = sc.nextLine();
            String regex = "^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[@#$%^!&+=_-])"
                    + "(?=\\S+$).{8,20}$";
            Pattern pattern = Pattern.compile(regex);

            if (passportInput!= null && pattern.matcher(passportInput).matches()) {
                if(passportInput.charAt(0)>= 'a' && passportInput.charAt(0)<='z'&&
                        passportInput.charAt(passportInput.length()-1)>= 'A' &&
                                passportInput.charAt(passportInput.length()-1)<='Z' ){
                    System.out.println("Your password should be improved");
                }
                System.out.println("Password is valid");
            } else
                System.out.println("your password is should include at least an uppercase, a lower case, 8 charachters and a special charachter.");
        }
//        int a = 65, b, paslength = pas.length();
////        for (a = 65; a <= 90; a++) {
////            for (a = 97; a <= 122; a++) {
////                for (b = 0; b <= paslength; a++) {
//        if (pas.charAt(pas.indexOf(pas.length()-1)) > 64 && pas.charAt(pas.indexOf(pas.length()-1)) < 91 && pas.charAt(pas.indexOf(pas.length()-1)) > 96) {
//            System.out.println("Your password is not acceptable");
//        } else if ((int) pas.charAt(0) > 64 && (int) pas.charAt(0) < 91 && (int) pas.charAt(paslength - 1) < 65 || (int) pas.charAt(paslength - 1) > 97
//                || (int) pas.charAt(paslength - 1) > 97 || (int) pas.charAt(paslength - 1) < 122) {
//            System.out.println("Your password is strong");
//        } else if ((int) pas.charAt(0) > 96 && (int) pas.charAt(0) < 123 && (int) pas.charAt(paslength - 1) > 64 && (int) pas.charAt(paslength - 1) < 91) {
//            System.out.println("Your password should be improved");
//        } else {
//            System.out.println("Your password is not valid");
//
//
//        }




    }
}