package ifStatement;

import java.util.Scanner;

public class ElseIfPractice {
    public static void main(String[] args) {

        //      pick a number btwn 0-25
        //    for each range of 0-5, 6-10, ... >> your number is in the range of 0 to 5 etc.
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a number");
        int a=scan.nextInt();
        if(a>0&&a<=5){
            System.out.println("your number is in the range of 0 to 5");
        }
        else if(a<=10){
            System.out.println("your number is in the range of 5 to 10");
        }
        else if(a<=15){
            System.out.println("your number is in the range of 10 to 15");
        }
        else if(a<=20){
            System.out.println("your number is in the range of 15 to 20");
        }
        else if (a<=25){
            System.out.println("your number is in the range of 20 to 25");
        }
        else if (a<1||a>25){
            System.out.println("Out of range");
        }
        else
            System.out.println("ihtimali yok :)");

    }
}
