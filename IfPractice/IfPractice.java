package IfPractice;

public class IfPractice {
    public static void main(String[] args) {

        int appleNumber = 5;
        int orangeNumber = 10;
        // ==, >, <, !=, <=, >=
        // you can have a lot of if statements. they are independent
        System.out.println("I am about to create an if block");
        if (appleNumber == orangeNumber){ //false so inside curly braces java skip everything
            System.out.println("I am so lucky today!");
        }
        if(appleNumber != orangeNumber){ //true so java print out sentence inside curly braces
            System.out.println("I am so happy today");
        }
        if (appleNumber <= orangeNumber){
            int sum = appleNumber+orangeNumber;
            System.out.println("You have "+sum+" fruits");
        }
        System.out.println("So far so good!");
        if (orangeNumber < appleNumber){
            System.out.println(orangeNumber * appleNumber +
                            " is in the false conditional if block. that's why it will not show on the console");
        }
    }
}
