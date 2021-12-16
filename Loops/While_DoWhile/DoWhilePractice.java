package Loops.While_DoWhile;

public class DoWhilePractice {
    public static void main(String[] args) {
        //show your age from 21 to 26
        int age=21;
        do{
            System.out.println("Your age is "+age);
        age++;
        }while (age<=15);//if condutions false do 1 times, if true do again and again
        System.out.println("=============");

        age=21;
        do{
            System.out.println("Your age is "+age);
            age++;
        }while (age<=26);
    }
}
