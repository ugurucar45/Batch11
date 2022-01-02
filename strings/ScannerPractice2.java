package strings;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        // BMI calculation
        // BMI= weight/(height*height(meter(1.8)))

        Scanner inputScanner= new Scanner(System.in);

        System.out.println("Please Input Your height--->");
        double height= inputScanner.nextDouble();

        inputScanner.nextLine();
        System.out.println("Please Input Your weight--->");
        double weight=inputScanner.nextDouble();

        double bmi= (weight/(height*height));
        System.out.println("Your BMI is ---> " + bmi);


    }
}
