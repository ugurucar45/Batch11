package PracticeMyself.WeeklyProject3;

import java.util.Scanner;

public class thirdWeekTask3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please input amount");
        double money=sc.nextDouble();

        if(money>0){int quarter =(int)(money/0.25);
        money=((money*100)%25)/100;
        int dimes =(int)(money/0.10);
        money=((money*100)%10)/100;
        int nickels =(int)(money/0.05);
        money=((money*100)%5)/100;
        int penny =(int)(money*100);
        money= quarter*0.25+dimes*0.1+nickels*0.05+penny*0.01;
        System.out.println(money+" $ will make "+quarter+" quarter "+dimes+" dimes "+nickels+" nickels "+penny+" penny.");}
        else{
            System.out.println("you are in minus balance ");
        }
    }
}
