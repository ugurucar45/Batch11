package Object;

public class Car {
    String brand;
    public  Car(String brand){
        this.brand=brand;
    }
    public void move(){
        System.out.println("Car is moving");
    }
    public boolean move(String dest){
        System.out.println(brand+" Moving to "+dest);
        return true;
    }
    public String toString() {//change hashcode in sout
                              //it calls overloading
        return "My car's brand is "+brand;
    }

    @Override
    protected void finalize() {//ends of the code shows something or do shomething
                               // it calls override
        System.out.println("Finalize");
    }
}
