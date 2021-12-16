package IfPractice;

import java.util.Scanner;

public class ElseTask2 {
    public static void main(String[] args) {
        // find out if your zipcode is even or odd number
        Scanner scan =new Scanner(System.in);
        System.out.println("enter our zipcode");
        //double a= scan.nextDouble();
        //if ((a/2)==((int)a/2)){
        int a=scan.nextInt();
        if (a%2==0){
            System.out.println("Your zip code is even number");
        }
        else
            System.out.println("Your zipcode is odd number");
    }
}
