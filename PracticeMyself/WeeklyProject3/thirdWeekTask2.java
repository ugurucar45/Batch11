package PracticeMyself.WeeklyProject3;

import java.util.Scanner;

public class thirdWeekTask2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input how many quarters do you have");
        int quar=sc.nextInt();
        System.out.println("Input how many dimes do you have");
        int dime=sc.nextInt();
        System.out.println("Input how many nickels do you have");
        int nick=sc.nextInt();
        System.out.println("Input how many pennies do you have");
        int penny=sc.nextInt();
        double total= (((quar*0.25)+(dime*0.10)+(nick*0.05)+(penny*0.01)));
        System.out.println("Your total money is "+total+" $ you have");

    }
}
