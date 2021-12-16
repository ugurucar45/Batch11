package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        -ask user, how many names that s/he wants to store in array
//        -store those names by getting it from user in to array that is called 'names'
//                -print them out by using ->Arrays.toString(); method

        Scanner sc= new Scanner(System.in);
        Scanner str= new Scanner(System.in);

        System.out.println("How many names want to store");
        int number=sc.nextInt();
        String[] names= new String[number];
        for (int a=0;a<names.length;a++){
            System.out.println("input index of "+a);
            names[a]= str.nextLine();
        }
        System.out.println(Arrays.toString(names));




    }
}
