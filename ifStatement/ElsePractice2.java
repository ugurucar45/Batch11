package ifStatement;

import java.util.Scanner;

public class ElsePractice2 {
    public static void main(String[] args) {
        // task
        // when your order total is more than $1000 you get %20 discount, other wise you get %5 discount
        // calculate and print total discount and payment in each case
        //

        Scanner scan=new Scanner(System.in);
        System.out.println(" order price ");
        int a= scan.nextInt();

        if (a>=1000){
            System.out.println("Your orders price is "+a*0.8);
            System.out.println("Your discount is "+ a*0.2);
        }
        else
            System.out.println("Your orders price is "+a*0.95);
            System.out.println("Your discount is "+ a*0.05);

    }
}
