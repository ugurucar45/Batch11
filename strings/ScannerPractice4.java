package strings;

import java.util.Scanner;

public class ScannerPractice4 {
        public static void main(String[] args) {
                //Ask user to enter an integer number
                //We will find out if this an even number or not
                // input is 7 output is 7 is even false
                //input 8 out is 8 true


                // if remainder with 2 gives 0 this number will be even
                // other wise it is odd

                Scanner scan= new Scanner(System.in);
                System.out.println("Please enter an int number");
                int firstNum= scan.nextInt();
                boolean res=(firstNum%2)==0;
                System.out.println(firstNum+" is even number "+res);

                //Ask user to enter int number
                //First int you provide should be bigger than second one
                //we will print out     true

                System.out.println("Please enter an int number bur smaller than first one");
                int secondNum= scan.nextInt();
                boolean result=firstNum>secondNum;
                System.out.println(result);


                //Students needs
                //%85 attendancy
                //80 or higher grade
                //%70 of homework
                //create a program for teacher
                //teacher will enter all these variables and
                //if student passes you will print true for teacher
                //if student fails you will print false for teacher

                System.out.println("Please enter your attendancy");
                int atten= scan.nextInt();
                System.out.println("Please enter your Grade");
                int grade= scan.nextInt();
                System.out.println("Please enter your Homework Score");
                int homework= scan.nextInt();

                boolean isPass= (atten>=85)&&(grade>=80)&&(homework>=70)      ;
                System.out.println(isPass);



        }
}
