package ifStatement;

import java.util.Scanner;

public class IfPractice2 {
    public static void main(String[] args) {
        // assume that user is user military style time 1-24
        // print out good morning / good afternoon /
        // for the hours of morning or afternoon or evening
        // ask user to enter only hour for the time
        // if the hour is less than 12 print good morning
        // if the hour is more than 12 less than 18 print good afternoon
        // if the hour is more than 18 print good evening

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a time 1-24");
        double hours=scan.nextDouble();
        int hour=(int)hours;
        if (hour<12){
            System.out.println("Good Morning");
        }
        if (hour>=12&&hour<18){
            System.out.println("Good Afternoon");
        }
        if (hour>=18&&hour<25){
            System.out.println("Good Evening");
        }
    }
}
