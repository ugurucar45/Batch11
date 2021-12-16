package Loops.While_DoWhile;

public class PhoneCallTask {
    public static void main(String[] args) {
//        -you $40 in your international phone calling account
//        -if every call you make costs $5
//        -find out and print: how many total calls you can make with your balance of $40
//        ex. print out --> "you can make <...> calls with your balance"
        int balance = 40, call = 5, count = 0;
        while (balance > 0) {
            balance -= call;
            count++;
        int cals=balance/call*5;
            System.out.println("you can make "+call+" calls with your balance reamining of your balance "+balance);
        }
        System.out.println("you can make "+call+" calls with your balance");
    }
}
