package PracticeMyself.WeeklyProject5;

import java.util.Locale;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
//        Using the scanner ask the user to enter one string value and print only unique letters combined as String
//        also without any space in the beginning and at the end.
//        Example -1 :
//        Given Value: "i am happy"
//        Output: i am hpy
//        Example-2:
//        Given Value: " contribute"
//        Output: contribue
//        Example-3:
//        Given Value: " i want cup of coffee "
//        Output: i want cup of e
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = sc.nextLine().toLowerCase(Locale.ROOT);
        char let = ' ' ,let2=' ';
        for (int i = 0; i < str.length(); i++) {
            let=str.charAt(i);
            for (int j=i+1;j<str.length();j++){
                let2=str.charAt(j);
                if (let2==' '){}
                else if(let==let2){
                    str=str.substring(0,j)+str.substring(j+1);
                }
            }
        }
        System.out.println(str);
    }
}
