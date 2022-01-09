package arrayList;

import practiceMyself.WeeklyProject8.VentraCard;

import java.util.ArrayList;

public class Flower {
    String name;
    String color;
    double price;

    public Flower(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }


    @Override
    public String toString() {
        return "FlowerClass{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    // create a method that will take a parameter as ArrayList of Flowers
    // this method will return total prices of the flowers

    public static double sum1(ArrayList<Flower> vase) {
        double sum = 0;
        for (Flower fl : vase) {
            sum += fl.price;
        }
        return sum;
    }
}
