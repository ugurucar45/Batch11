package PracticeMyself.WeeklyProject2;

import java.util.Scanner;

public class InchesToMeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Meters to inches [1]" +
                "\nInput Inches to Meters [2]");
        int firstInput;
        firstInput = scanner.nextInt();
        double inc = 0.0254;
        double meter = 1 / inc;

        if (firstInput == 2) {
            System.out.println("Input Inches");
            double Inches = scanner.nextDouble();
            double answer1 = inc * Inches;
            System.out.println(Inches + " inch is " + answer1 + " meters");
        } else if (firstInput == 1) {
            System.out.println("Input Meters");
            double Meter2 = scanner.nextDouble();
            double answer2 = Meter2 * meter;
            System.out.println(Meter2 + "Meters is " + answer2 + " inches");
        } else {
            System.out.println("Please check your answer");
        }
    }
}
