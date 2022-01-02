package practiceMyself.WeeklyProject5;

import java.util.Locale;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
//        Using the scanner ask the user to enter one string value and print only unique letters combined as String
//        also without any space in the beginning and at the end.
//        Example -1 :
//        Given Value: "i am happy"//10
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
        String let = " ", let2 = " ";
        str=" "+str;
        for (int i = 0; i < str.length(); i++) {
            let = str.substring(i, i + 1);
            for (int j = i + 1; j < str.length(); j++) {
                let2 = str.substring(j, j + 1);
                if (let2.equals(" ")) {
                } else if (let.equals(let2)) {
                    str = str.substring(0, j) + str.substring(j + 1);
                    i = 0;
                }
            }
        }
        str=str.trim();
        System.out.println(str);
    }
}
