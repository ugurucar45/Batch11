package accessModifiers;

public class Bird extends Animal {//extends Animal child class subclass
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.speakPublic();
        animal.runProtected();
        animal.sleepDefault();          //i see 3of them  only i cant see private
    }
}
