package Loops.While_DoWhile;

import java.util.Scanner;

public class LettersFromStringTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //get a string from use and print out every letter from given string
        System.out.println("Please enter a String value");
        String str= sc.nextLine();
        int index =0,zero=0;
        while(index<str.length()-1){
            System.out.print(str.charAt(index)+", ");
            index++;

            if (index==str.length()-1){
                System.out.println(str.charAt(index));
                index++;
            }

        }
        int lIndex=str.length()-1;
        while(lIndex>0){
            System.out.print(str.charAt(lIndex)+ ", ");
            lIndex--;
            if (lIndex==0){
                System.out.print(str.charAt(lIndex));
            lIndex--;
            }
        }
        System.out.println("");
    }
}
