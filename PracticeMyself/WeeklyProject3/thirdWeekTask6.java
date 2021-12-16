package PracticeMyself.WeeklyProject3;

import java.util.Scanner;

public class thirdWeekTask6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1= new Scanner(System.in);
        String threeWord,newStr;
        // string three words
        //TO be able to find where second and third word you need index of spaces
        int num, firs, second,thir;
        do {
            System.out.println("Please enter three word");
            threeWord = sc1.nextLine();
            System.out.println("Please enter the int number");
            num = sc.nextInt();
            firs = threeWord.indexOf(" ");
            second = threeWord.indexOf(" ", firs + 1);
            thir =threeWord.indexOf(" ",second+1);
            if (threeWord.indexOf(" ", second) > second|| second==-1 ) {
                System.out.println("Please Check your word, we want just 3 word");
            } else if (threeWord.indexOf(" ", second) > 0) {
                System.out.println(num + threeWord.substring(1, firs) + " "
                        + (num + 1) + threeWord.substring(firs + 2, second) + " " + (num + 2) + threeWord.substring(second + 2));
            }
            System.out.println("Do you want to play again y/n");
            newStr= sc1.nextLine();
                    } while (!(newStr.equals("n")));
        System.out.println("Bye");
    }
}
