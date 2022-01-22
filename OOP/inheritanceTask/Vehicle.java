package OOP.inheritanceTask;
/*
===================TASK===================
-Vehicle
  Variables:
    protected  model;
    default year;
    public brand;
  Methods:
    drive(); --> vehicle is moving
    stop(); --> return true, vehicle is stopping
    protected start(); --> return true, vehicle is starting
    default accelerate(); --> return Object
  Constructor: create a constructor to initiliaze instance variables
-Car
  *extends Vehicle
  variables:
    model;
    engineType;
  Methods:
    Override drive(); --> Car is moving
    Override accelerate(); --> return Integer and calls model from parent class
 */

public class Vehicle {
    protected String model;
    int year;
    public String brand;

    void drive(){
        System.out.println(model+" vehicle is moving");
    }
    boolean stop(boolean isStopped){
        System.out.println(model+ "vehicle is stopping");
        return isStopped;
    }
    protected boolean start(boolean isStarting){
        System.out.println(model+" vehicle is starting");
        return isStarting;
    }
//    Vehicle accelerate(Vehicle ob){
//        System.out.println("Vehicle is accelarating >>>");
//        return ob;
//    }

    Vehicle accelerate(){
        System.out.println("Vehicle is accelarating >>>");
        Vehicle vehicle=new Vehicle(model,year,brand);
        return vehicle;
    }
    public Vehicle(String model, int year, String brand) {
        this.model = model;
        this.year = year;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
}
