package OOP.Abstraction.Interfaces;

public class Test {
    public static void main(String[] args) {
        //CanFly canFly=new CanFly(); you cannot create an interfaces object

        Shark shark=new Shark();
        shark.swim(4);

        Eagle eagle=new Eagle();
        eagle.fly();
        eagle.color="White";
        eagle.info();

        Duck duck=new Duck();
        duck.fly();
        duck.swim(1);
        duck.info();

        System.out.println(shark);
        System.out.println(eagle);
        System.out.println(duck);
        System.out.println(duck.NUMOFWINGS);
        System.out.println(duck.FIN);
//        duck.FIN=3; you cannot re-initialize variables which are coming from interfaces
//        interfaces variables are public and final by default

        duck.info();

        System.out.println(duck.name);
        duck.name="puffin";
        System.out.println(duck.name);

        Puffin puffin=new Puffin();
        puffin.run();
    }
}
