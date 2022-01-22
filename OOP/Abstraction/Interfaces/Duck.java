package OOP.Abstraction.Interfaces;

import OOP.inheritance.Animal;

public class Duck extends Animal implements CanFly, CanSwim{
    String name;
    public Animal run(){
        System.out.println("Duck is running");
        return new Animal();
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public int swim(int km) {
        System.out.println("Duck is swimming");
        return km;
    }
}
