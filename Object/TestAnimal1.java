package Object;

public class TestAnimal1 {
    public static void main(String[] args) {

        Animal duck = new Animal();
        //we call animal class because behaivor is in animal

        duck.info();//all of is default
        System.out.println(duck.name);
        System.out.println(duck.age);

        Animal bird= new Animal();
        bird.name="Woody";
        bird.age=30;
        bird.breed="Husky";
        bird.energy=70;
        bird.run();         //ctrl+click run --> goes to the run method;
        bird.info();




    }
}
