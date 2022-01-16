package inheritance;

public class WildAnimal extends Animal {
    //i use extends Animal and its child of animal class
    public void hunting() {
        System.out.println(" Wild animal is hunting");
    }

    @Override
    public WildAnimal run() {

        System.out.println(name + " is running");
    return new WildAnimal();}
}
