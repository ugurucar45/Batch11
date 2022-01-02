package practiceMyself.WeeklyProject3;

import java.util.Scanner;

public class thirdWeekTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 digit number");
        String a = sc.nextLine();
        if (a.length() == 5 ) {
            System.out.println(a.substring(4) + a.substring(3, 4) + a.substring(2, 3) + a.substring(1, 2) + a.substring(0, 1));
        }else{
            System.out.println("Please enter 5 digit number not more not less and not letter");
        }
    }
}
