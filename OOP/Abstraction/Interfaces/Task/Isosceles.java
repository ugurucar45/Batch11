package OOP.Abstraction.Interfaces.Task;

public class Isosceles extends Triangle{

    public Isosceles(double base, double height, double side1, double side2) {
        super(base, height, side1, side2);
    }

    @Override
    public Double getArea() {
        double area=base*height/2;
//        System.out.println("Area is "+area);
        return area;
    }


}
