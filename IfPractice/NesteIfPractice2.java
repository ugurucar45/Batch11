package IfPractice;

import java.util.Scanner;

public class NesteIfPractice2 {
    public static void main(String[] args) {
        //city
        //school
        //batch
        System.out.println("Which city you live in");
        Scanner sc=new Scanner(System.in);
        String city =sc.nextLine();
        if (city.equalsIgnoreCase("chicago")){
            System.out.println("Which course are you attending?");
            String course= sc.nextLine();
            if(course.equalsIgnoreCase("techtorial")){
                System.out.println("Which batch are you in");
                String batch= sc.nextLine();
                if (batch.equalsIgnoreCase("11")){
                    System.out.println("it is get in easy");
                }else{
                    System.out.println("Congrats you alreadt done!");
                }
            }else{
                System.out.println("we are des plains, visit us");
            }
        }else{
            System.out.println("Please come to Chicago, you will li ke it in the summer");
        }
    }
}
