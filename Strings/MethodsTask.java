package Strings;

import java.util.Scanner;

public class MethodsTask {
    public static void main(String[] args) {
//        -Task: get string from user
//        print first, last, middle, second matching 'c', lenght, index of x
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your word");
        String word=scanner.nextLine();

            //My methods
        char first= word.charAt(0);
        char last=word.charAt(word.length()-1);
        char middle=word.charAt((word.length()-1)/2);
        int secondMatch=word.indexOf('c',word.indexOf('c')+1);
        int indexx=word.indexOf('x');
        System.out.println("Your firt char "+ first+" middle char "+ middle+" last char "+ last +" second match c "+secondMatch+" lenght is "+word.length()+" index of x is "+indexx);
        System.out.println("The first letter is "+word.charAt(0));
        System.out.println("The last letter is "+word.charAt(word.length()-1));
        System.out.println("The middle letter is "+word.charAt((word.length()-1)/2));
        System.out.println("Second matching c is "+word.indexOf('c',word.indexOf('c')+1));
        System.out.println("The lenght of the string is "+ word.length());
        System.out.println("The index of x is "+ word.indexOf('x'));

        //java

        //xyz

    }
}
