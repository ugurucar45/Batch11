package OOP.Abstraction.Interfaces;

public class Puffin extends CanRun implements CanFly,CanSwim{

    public void run(){
        System.out.println("Puffin is running");
    }

    @Override
    public void fly() {
        System.out.println("Puffin is flying");
    }

    @Override
    public int swim(int mile) {
        System.out.println("Puffin is swimming");
        return mile;
    }

    @Override
    public void info() {
        System.out.println("Info of puffin");
    }
}
