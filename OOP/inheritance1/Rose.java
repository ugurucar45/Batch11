package OOP.inheritance1;

public class Rose extends Flower {
    String smell;
    double price;

    public Rose(String smell) {
        super("Red", 4.99, 4);
        this.smell = smell;
    }

    //    public Rose(String color, double price, int size) {//generate otomatic
    //        super(color, price, size);
    //    }
    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Flower flower = new Flower("Yellow", 2.99, 5);
        System.out.println(flower.color);   //yellow

        Rose rose = new Rose("sweet");
        System.out.println(rose.color);     //red

        System.out.println(flower.price);       //2.99
        System.out.println(flower.getPrice());  //2.99 but if change 0.99 you see 0.99
        System.out.println(rose.getPrice());    //4.99
        System.out.println(rose.price);         //0.00

        Flower flower1 = new Flower();

        System.out.println(flower1.getPrice()); //0.0
        System.out.println(flower1.size);       //0
        flower1.price = 8.99;

        System.out.println(flower1.getPrice()); //8.99

        System.out.println(flower1);            //Flower{color='null', price=8.99, size=0}
        // i use the toString on flower class

        System.out.println(rose);

    }

}
