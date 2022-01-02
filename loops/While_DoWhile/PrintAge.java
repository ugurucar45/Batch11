package loops.While_DoWhile;

import java.util.Scanner;

public class PrintAge {
    public static void main(String[] args) {
        /*
        'My age is 21'
        'My age is 22'
        ...
        '          26'
         */

        Scanner sc = new Scanner(System.in);
        int a = 21;
        while (a <= 26) {
            //a++;      //if i use this one it begins 22 and ended 27
            System.out.println("Your age is: " + a);
            a++;    //age+1 same think  //age=age+1


        }
        //print out numbers between 10 to 20 inclusive
        int b = 10;
        while (b >= 10 && b <= 19) {
            System.out.print(b+" -tr ");
            b++;
            if (b==20){
                System.out.print(b);
            }
        }

    }
}
