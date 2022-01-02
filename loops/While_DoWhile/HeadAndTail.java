package loops.While_DoWhile;

import java.util.Random;
import java.util.Scanner;

public class HeadAndTail {
    public static void main(String[] args) {
                /*
                HAED-TAIL Game:
                       I want to create a head/tail game (flipping coin) with java codes;
                       -At the beginning print "Game is started, MAKE a GUESS! HEAD/TAIL "
                         So, let user know that the game started.
                           - get user's guess as HEAD/TAIL
                           - compare user's guess with your random number 0/1 --> random.nextInt(2) <--
                               - if guess is correct, print       ---> "You are lucky, it is your day today."
                               - if the guess isn't correct, print  -> "Sorry, that was not the correct choice!"
                           - at the end, ask user "Do you want to play again? Y/N "
                               - if the answer is Y --> keep playing (this is your while condition!!!)
                               - if the answer is N --> print --> "Its Ok, SEE you NEXT time!"
         */
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String headOrTail;
        String playAgain;
        int num = random.nextInt(2);
        do {
            System.out.println("Please make a guess (HEAD/TAIL)");
            headOrTail = sc.nextLine().toLowerCase();
            if (headOrTail.contains("head") || headOrTail.contains("tail")) {
                if (num == 1 && headOrTail.contains("head")) {
                    System.out.println("Yes you are lucky, it is your day today");
                } else if (num == 0 && headOrTail.contains("tail")) {
                    System.out.println("Yes you are lucky, it is your day today");
                } else {
                    System.out.println("Sorry, that was not the correct choice");
                }
            } else {
                System.out.println("Your guest must be Tail or Head");
            }
            System.out.println("are you want to play again (y/n)");
            playAgain = sc.nextLine().toLowerCase();
        } while (playAgain.equals("y") || playAgain.equals("tail") || playAgain.equals("head"));
        System.out.println("Its Ok, SEE you NEXT time!");
    }
}
