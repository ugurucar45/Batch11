package ifStatement;

import java.util.Scanner;

public class NestedIfPractice {
    public static void main(String[] args) {
        //passport
        //visa
        //ticket
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you have passport? yes/no");
        String passport= sc.nextLine();

        if (passport.equalsIgnoreCase("yes")){
            System.out.println("Do you have visa? yes/no");
            String visa= sc.nextLine();
            if (visa.equalsIgnoreCase("yes")){
                System.out.println("Do you have ticket? yes/no");
                String ticket= sc.nextLine();
                if (ticket.equalsIgnoreCase("yes")){
                    System.out.println("Welcome this country");
                }else{
                    System.out.println("Please get a ticket first");
                }
            } else{
                System.out.println("Please get a visa first");
            }
        }else{
            System.out.println("Please get a passport first");
        }

    }
}
