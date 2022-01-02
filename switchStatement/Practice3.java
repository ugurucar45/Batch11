package switchStatement;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /*
        ask user for name of geometrical shape
        based on the name of the shape
        calculate the AREA of that shape
        get length and width and height of those shapes  from user to use them in calculation
        and print out name of the shape and area of that shape
        -triangle , rectangle
        rectangle = l*w
        triangle= base*height/2
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("Which shape you want to calculate are of? Triangle/Rectangle");
        String shape= sc.nextLine().toLowerCase();//use tolowercase because all of switch coedes is lower case

        switch (shape){
            default:
                System.out.println("We dont have a this shape");
                break;
            case "triangle":
                System.out.println("Please enter height of triangle");
                double theight=sc.nextDouble();
                System.out.println("Please enter base of triangle");
                double tbase=sc.nextDouble();
                System.out.println("Your triangle's area is --> "+theight*tbase/2);
                break;
            case "rectangle":
                System.out.println("Please enter width of rectangle");
                double rwidth=sc.nextDouble();
                System.out.println("Please enter length of rectangle");
                double rlenght=sc.nextDouble();
                System.out.println("Your triangle's area is --> "+rwidth*rlenght);
                break;}

        // data types supported by switch
        double d=2.5;
        short s=2;
        boolean b=true;
        long l=2;
        byte by=3;
        switch (by){
            case 5:
                System.out.println("^^^^^^^^^");
        }
    }
}
