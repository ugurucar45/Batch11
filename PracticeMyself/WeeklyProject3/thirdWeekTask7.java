package PracticeMyself.WeeklyProject3;

import java.util.Scanner;

public class thirdWeekTask7 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Plese enter 2 word");
          String str=sc.nextLine();// ugur second

          int a=str.indexOf(" ");  //4

          String up=str.substring(a,a+2); //4,6 //---> s
          System.out.println(str.substring(0,1).toUpperCase()+str.toLowerCase().substring(1,a)
                  +up.toUpperCase()+str.toLowerCase().substring(a+2));
    }
}
