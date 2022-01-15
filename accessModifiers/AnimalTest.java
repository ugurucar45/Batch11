package accessModifiers;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.runProtected();
        animal.sleepDefault();          //test methods are in the ternary and same package
        animal.speakPublic();           //i see 3 of them i cant see only private one
    }
}
