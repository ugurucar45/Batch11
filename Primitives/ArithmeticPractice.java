package Primitives;

public class ArithmeticPractice {
    public static void main(String[] args) {

        // addition ---> +
        int num1=3,num2=4;
        //System.out.println("Total is = "+ num1+num2); shows 34
        System.out.println(num1+num2); //shows 7
        System.out.println("Total is = "+ (num1+num2)); //shows 7

        int sum= num1+num2;
        System.out.println("2, Total is = "+sum);

        // subtraction ---> -
        int difference; // we create new thing but use later

        difference =10-num2;
        System.out.println("difference is = "+difference); //10-4=6
        // multiplication ---> *
        double product = difference*num2;
        System.out.println(product); // shows 24.0 because its double 6*4=24.0

        // division ---> /
        double division = (product /3.0);
        System.out.println(division);
        product= product*division;
        System.out.println(product);


        int division2=17/2; //integer saw only whole numbers
        System.out.println("integer 17/2 is = "+division2);
        double division3=17/2;//still 8.0
        System.out.println("double 17/2 is = "+division3);
        double div4=17/2f;
        System.out.println("double 17/2 is but variable add f = "+div4);

        float div5= num2/num1;
        System.out.println(div5);

        // remainder ---> left over ---> %(Modulus)

        int a = 11 , b=5;

        int remainder1= a%b;
        System.out.println("The Left of 11/5 is = "+remainder1);//1

        int x=13, y=5;
        int remainder2=x%y;
        System.out.println("The left of 13/5 is = "+remainder2);//3

        System.out.println(25%21);//4

        System.out.println(25%x); //12

        //a11 b5  x13 y5

        int result=a+b*x-y/a*b+x%2;
        System.out.println(result);

        // casting

    }
}
