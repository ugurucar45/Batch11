package Loops.While_DoWhile;

import java.util.Scanner;

public class MultiplicationTableTask {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // ask user to provide a whole int number
        // create a multiplication table from 1 to 10 from the given number
        int number=sc.nextInt();
        int say=1;
        while (say<11){
            System.out.println(number+" * "+say+"\t = "+(say*number));
            say++;
        }


    }
}
