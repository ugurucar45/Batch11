package OOP.inheritanceTask;

public class Car extends Vehicle{
    String model;
    String engineType;
    public Car() {
        super("Carry", 2022, "Toyota");
    }


    @Override
    public void drive() {
        super.drive();
    }

    @Override
    Car accelerate() {
        System.out.println(super.model);
        System.out.println("Car is accelerating");
        Car car=new Car();
        return car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car car= new Car();

        Car c1=car.accelerate();
        System.out.println(c1);
    }
}
