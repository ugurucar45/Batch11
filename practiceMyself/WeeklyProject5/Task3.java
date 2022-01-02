package practiceMyself.WeeklyProject5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//        Using a scanner ask a user to provide one int number. if the number is a prime number then print "Prime Number"
//        otherwise print it is not a prime number.
//        NOTE:
//        A prime number is a whole number greater than 1 whose only factors are 1 and itself. A factor is a whole number
//        that can be divided evenly into another number. The first few prime numbers are
//        2, 3, 5, 7, 11, 13, 17, 19, 23, and 29.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a int number");
        int num = sc.nextInt(), count = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                count++;
            } else {
            }
        }
        if (count > 1) {
            System.out.println(num + " is not a prime number");
        } else {
            System.out.println(num + " is a prime number");
        }
    }
}
