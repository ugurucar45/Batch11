package Object;

import java.util.Scanner;

public class TestAnimal {
    public static void main(String[] args) {
        String str = new String("test");
        Scanner sc = new Scanner(System.in); //How to create any object?

        Animal cat = new Animal();           //Create animal object

        System.out.println(cat.name);       //null
        cat.name = "Leo";
        System.out.println(cat.name);       //Leo
//        cat.lastName;   //it is in the main we dont see    , it is in the local block
        System.out.println(cat.age);        //0
        System.out.println(cat.color);      //null
        cat.age = 9;
        cat.color = "orange";
        System.out.println(cat.age);        //9
        System.out.println(cat.color);      //orange

        // create a dog animal, try yo use instance variables with your new object

        Animal dog = new Animal();
        System.out.println(dog.name + "\t" + dog.age + "\t" + dog.color);//     null    0   null
        dog.name = "Max";
        dog.age = 5;
        dog.color = "White";
        System.out.println(dog.name + "\t" + dog.age + "\t" + dog.color);//     Max 	1	White

        System.out.println(dog.breed);      //boxer means default
        System.out.println(cat.breed);      //boxer (default because animal class you assign to default)
        cat.breed = "Scottish";
        System.out.println(cat.breed);      //Scottish
        cat.sleep();                        //Leo is sleeping
        dog.sleep();                        //Max is sleeping

        cat.eat();                          //Leo is eating
        dog.eat();                          //Max is eating

        cat.run();
        System.out.println(dog.energy);     //100
        dog.run();                          //100
        System.out.println(dog.energy);     //90

        cat.run();cat.run();cat.run();cat.run();cat.run();cat.run();cat.run();cat.run();cat.run();

        // charge up the animal when sleep

        cat.run();
        cat.sleep();
        System.out.println(cat.energy+" cats energy SOUT;dan gelen");
        cat.run();

        //Another day

        System.out.println(cat.name);
        System.out.println(cat);        //Object.Animal@523884b2
        cat.info();




    }
}
