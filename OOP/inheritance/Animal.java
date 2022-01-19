package OOP.inheritance;

public class Animal {

    String name="xxx";
    String gender;
    int age;

    public Animal run(){
        System.out.println("Animal is running");
        return new Animal();
    }
    public void eat(){
        System.out.println("Animal is eating");
    }



}
