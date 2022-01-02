package object;

public class CarTest {
    public static void main(String[] args) {
        Car car1=new Car("toyota");
        Car car2=new Car("Supra");
        Car car3=new Car("oyota");

        car1.move();
        car2.move("west");
        System.out.println(car1);//hashcode     but i add toString method and change
        System.out.println(car2.toString());
        car1=null;
        System.gc();
    }
}
