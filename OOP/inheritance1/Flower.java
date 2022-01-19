package OOP.inheritance1;

public class Flower {
    String color;
    double price;
    int size;

    public Flower(String color, double price, int size) {
        this.color = color;
        this.price = price;
        this.size = size;
    }

    public Flower() {
        this("White",1,1);
    }

    public double getPrice() {
//        this.color="www";
        return price;
    }

    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
