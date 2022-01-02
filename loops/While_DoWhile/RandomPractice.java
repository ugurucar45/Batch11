package loops.While_DoWhile;

import java.util.Random;
import java.util.Scanner;

public class RandomPractice {
    public static void main(String[] args) {

        Random random = new Random();               //random object
        //    String c = new String("t");               //String object
        Scanner sc = new Scanner(System.in);      //Scanner object
        int number = random.nextInt(100);     // random but maks 100
       System.out.println(number);                 //get a random number
        int number2 = random.nextInt(2);     //random number but maks 5
        System.out.println(number2);

    }
}
