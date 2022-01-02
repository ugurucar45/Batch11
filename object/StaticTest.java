package object;

public class StaticTest {
    public static void main(String[] args) {
        // you can call static methods from another class by using name of the class
        // no need to create object
        StaticPetPractice.eat();        //19
        System.out.println("==");
        StaticPetPractice pet =new StaticPetPractice();
        pet.eat();                      //18
        System.out.println("===");
        pet.play();                     //playing and 17 and food declaration 100
        System.out.println("===");
        System.out.println(pet.food);   //100


    }
}