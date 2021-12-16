package Primitives;

public class CharPractice {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println("A");
        System.out.println('A');

        ch1='5'; //reassigned from ascii table 5 is decimals of 53
        System.out.println(ch1);
        System.out.println(ch1*2); //ascii table 5(53x2)= 106

        char ch2= ch1;
        System.out.println(ch2);
        char ch3='&';
        System.out.println(ch3);
        char ch4 = 80;
        System.out.println(ch4);
        // it shows me P because ascii table
            //char ch5 = '81';
            //System.out.println(ch5);
            //its wrong you can not assign more than one character in single quotation mark
        //int number='95'; dont work
        // we cant use this symbol for int ''
        int numberchar='T';
        System.out.println(numberchar);
        // shows ascii table    T

        // int number2="T";
        // its wrong its not integer
        char randomchar = 2345;
        System.out.println(randomchar);


    }
}
