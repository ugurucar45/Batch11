package IfPractice;

import java.util.Scanner;

public class IfPractice1 {
    public static void main(String[] args) {

        //get a number between 1 to 7 from user
        //print the name of the day for that given number from user
        // 1----> Monday
        // 2----> Tuesday
        // .......
        // 7----> Sunday

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number 1-7");
        double myNum=scan.nextDouble();
        int num=(int)myNum;
        if (num==1){
            System.out.println("Monday");}
        else if (num==2){
            System.out.println("Tuesday");}
        else if (num==3){
            System.out.println("Wednesday");}
        else if (num==4){
            System.out.println("Thursday");}
        else if (num==5){
            System.out.println("Friday");}
        else if (num==6){
            System.out.println("Saturday");}
        else if (num==7){
            System.out.println("Sunday");}

        // if the user enters out of range number
        //print your number is outod rangehj v567thj ttgjukn
        else{
            System.out.println("Please Check your input is Wrong");}
    }
}
