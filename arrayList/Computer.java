package arrayList;

public class Computer {

    String brand;
    double price;
    double screenSize;
    String color;
    int storage;

    public Computer(String brand, double price, double screenSize, String color, int storage){
        this.brand=brand;
        this.screenSize=screenSize;
        this.price=price;
        this.color=color;
        this.storage=storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", screenSize=" + screenSize +
                ", color='" + color + '\'' +
                ", storage=" + storage +
                '}';
    }

}
