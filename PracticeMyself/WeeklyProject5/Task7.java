package PracticeMyself.WeeklyProject5;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
//        Using a scanner
//        enter a sentence that is not separated by space and each word starts with upper case. Print given String as
//        separated words with spaces.
//        Example:
//        Given Value: "IWantToLearnJava"
//        Output: I Want To Learn Java
//        Example-2:
//        Given Value: "ItIsSunnyOutside"
//        Output: It Is Sunny Outside

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a sentence that is not separated by space and each word starts with upper case");
        String str= sc.nextLine();
        for(int i=1;i<str.length();i++){
            if (str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                str=str.substring(0,i)+" "+str.substring(i);//iWant
                i++;
            }
        }
        System.out.println(str);
    }
}
