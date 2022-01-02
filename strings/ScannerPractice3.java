package strings;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        //use scanner to
        // get name and DOB year of user
        // calculate user's age
        // print "<name> you are <age> years old"
        // age= current year-DOB(year)
        Scanner input= new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = input.nextLine();

        System.out.println("Please enter your birth year");
        int year= input.nextInt();
        int ageIs=2021-year;
        System.out.println("Final Results is\n"+name+ " you are "+ageIs+ " years old");

        int currentYear= LocalDateTime.now().getYear();// get yhe year (its so cool)
        System.out.println(currentYear);

        int currentMinute= LocalDateTime.now().getMinute();// get yhe year (its so cool)
        System.out.println(currentMinute);
    }
}
