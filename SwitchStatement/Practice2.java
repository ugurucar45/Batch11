package SwitchStatement;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
//        ==Task:==
//        Ask user for his/her favorite fruit
//        -you have: mango, banana, kiwi, orange, apple, grape
//        if you have user's favorite fruit, --> We have your favorite fruit in our store
//                -otherwise: Sorry, we don't have your favorite fruit :( :
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your favorite fruit");
        String str= sc.nextLine();

        switch (str){
            default:
                System.out.println("Sorry, we don't have your favorite fruit :(");
                break;
            case "mango":
                System.out.println("We have your favorite fruit in our store");
                break;
            case "banana":
                System.out.println("We have your favorite fruit in our store");
                break;
            case "kiwi":
                System.out.println("We have your favorite fruit in our store");
                break;
            case "orange":
                System.out.println("We have your favorite fruit in our store");
                break;
            case "apple":
                System.out.println("We have your favorite fruit in our store");
                break;
            case "grape":
                System.out.println("We have your favorite fruit in our store");
                break;
        }
    }
}
