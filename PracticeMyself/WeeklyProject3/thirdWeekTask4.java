package PracticeMyself.WeeklyProject3;

import java.util.Scanner;

public class thirdWeekTask4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter 6 digit number");
        int a= sc.nextInt();
        int b6=a%10, a5=a/10,b5=a5%10,a4=a5/10,b4=a4%10,a3=a4/10,b3=a3%10,a2=a3/10,b2=a2%10,a1=a2/10,b1=a1%10;
        System.out.println("The sum of the numbers are "+ (b6+b5+b4+b3+b2+b1));
        System.out.println("The multiple of the numbers are "+(b1*b2*b3*b4*b5*b6));


    }
}
