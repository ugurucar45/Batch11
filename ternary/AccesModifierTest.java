package ternary;

import accessModifiers.Animal;

public class AccesModifierTest {
    public static void main(String[] args) {
        Animal animal=new Animal(); // accesModifier test another package
        animal.speakPublic();       // i see only public one

    }
}
