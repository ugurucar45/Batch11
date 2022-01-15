package ternary;

import accessModifiers.Animal;

public class Bird extends Animal {
    public static void main(String[] args) {
        Bird animal=new Bird();
        animal.speakPublic();   // i see public and protected
        animal.runProtected();
        animal.getColorPrivate();       //i use getter and settler in variables class and i see color private
        animal.setColorPrivate("white");
    }
}
