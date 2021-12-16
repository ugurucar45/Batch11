package Strings;

import java.util.Scanner;

public class ScannerPractice5 {
    public static void main(String[] args) {
        //when we use nextLine() we can enter multiole words
        //when use next it will take more than one word
        Scanner scanner=new Scanner(System.in);
        //I can provide as many word as I want to
        String str= scanner.nextLine();                         // more word
        System.out.println("This value of first string "+str);
        String str1= scanner.next();                            // just one word
        //For this i cannot provide more than one word
        System.out.println("This value of string second "+str1);
    }
}
