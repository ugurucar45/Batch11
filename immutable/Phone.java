package immutable;

public class Phone {
    private double price = 500;
    private String color = "blue";
    private String brand = "own";

    public Phone(double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    public Phone() {
    }

    public Phone(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }


    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.price);
        phone.price = 900;
        System.out.println(phone.price);

    }


}
