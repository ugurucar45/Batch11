package strings;

import java.util.Scanner;

public class ScannerPractice6 {
    public static void main(String[] args) {
//        -deposit money for David
//        create a new class: MoneyTransaction
//        David wants to deposit hispaychecks into his account and already has $200
//        He has 3 paychecks (610, 385, 975)
//        he can only deposit one check at a time
//                *Ask: "How much is Deposit amount?" every time he is making deposit
//        after all of paycheks deposited in to account
//        he bought a phone for $599 and headphone for $299
//                *Ask: How much is phone?
//	*Ask: How much is headPhone?
//        Calculate his final money and print --> "Your final balance is <finalAmount>"

        double balance=200;//his initial amount in the account
        Scanner scan= new Scanner(System.in);
        System.out.println("How much deposit amount? Please enter the amount");
        double firstChech=scan.nextDouble();
        balance+=firstChech;

        System.out.println("How much deposit amount? Please enter the amount");
        double secondCheck=scan.nextDouble();
        balance+=secondCheck;

        System.out.println("How much deposit amount? Please enter the amount");
        double thirdCheck=scan.nextDouble();
        balance+=thirdCheck;


        System.out.println("How much Phone price? Please enter the amount");
        double phone= scan.nextDouble();
        balance-=phone;

        System.out.println("How much Headphone price? Please enter the amount");
        double headphone= scan.nextDouble();
        balance-=headphone;

        System.out.println("Your final balance is "+balance);



    }
}
