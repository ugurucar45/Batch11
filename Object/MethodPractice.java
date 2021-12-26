package Object;

import java.time.LocalDateTime;

public class MethodPractice {
    /*
    `create a method that will calculate age of a person,
    `does not return age,
    `will take birth year as parameter,
    `user provides the birth year
    `will print age of person
     */
    public int age(int birthye) {
        int birthYear = birthye;
        int ages = LocalDateTime.now().getYear() - birthye;
        System.out.println("Your age is ==> " + ages);
        return ages;
    }

    //overload ageCalculater method by passing name of the person and
    //return age
    public int age(int birthyear, String name) {
        int ags = LocalDateTime.now().getYear() - birthyear;
        System.out.println(name+"Your age is ==> " + ags);
        System.out.println("Oveloaded age calculater ");
        return ags;
    }

    public static void main(String[] args) {//i create main method here and i m do same method
        MethodPractice object = new MethodPractice();
        object.age(2000);
        object.sumOfArray(new int[]{3, 4, 2, 1});
    }
    /*
        Create a method that will take int array as a parameter
        it will calculate sum of the numbers int his array
        it will return the sum as double
     */

    public double sumOfArray(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        System.out.println("Sum of the arrays ==> " + sum);
        return sum;
    }

}
