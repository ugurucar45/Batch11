package strings;

import java.util.Scanner;// if you delete this you cant use scanner method

public class ScannerPractice {
    public static void main(String[] args) {

        String name="David";
        System.out.println("My name is "+name);

        //creating Scanner object
        //Scanner scanner= new Scanner(System.in);
        //after that i import this class
        Scanner input= new Scanner(System.in);
        // if you delete import data use ((alt+shift+enter))

        System.out.println("Please enter your last name");
        //String lastName; //declare lastName class; initilazing later
        String lastName=input.nextLine();//

        System.out.println(lastName);

        // Task; Ask user to enter his/her city name and
        // print; <name> <lastname> you are living in <city>
        System.out.println("Please enter your city name");
        String city = input.nextLine();
        System.out.println("\n" +name+" "+lastName+" You are living in "+city);

        lastName="XXXXX";
        System.out.println(lastName);

        System.out.println("Please enter your age");
        int age = input.nextInt();
        System.out.println(name+" "+ lastName+" You are living in "+city +" Your Age is "+age);

        System.out.println("Please enter your height in feet amd inches(i.e; 5.8)");

        double height = input.nextDouble();

        System.out.println("your height is "+height);

        System.out.println("Please enter your adress");


        //input=new Scanner(System.in); // reassigned new scanner object
        input.nextLine();   // fixing the problem
        String adress=input.nextLine(); // you dont use again input because of using your scanner

        System.out.println(name+" your adress is "+ adress);
    }
}
