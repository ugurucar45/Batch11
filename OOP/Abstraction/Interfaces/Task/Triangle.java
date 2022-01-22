package OOP.Abstraction.Interfaces.Task;

import javax.xml.crypto.dom.DOMCryptoContext;

public class Triangle implements Shape{

    double base;
    double height;
    double side1;
    double side2;

    @Override
    public Double getArea() {
        double area=base*height/2;
//        System.out.println("Area is "+area);
        return area;
    }

    @Override
    public int getPerimeter() {
        double pre=base+side1+side2;
//        System.out.println("Perimeter is "+(int) pre);
        return (int)pre;
    }

    public Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    private void walk(String direction){
        System.out.println("I  am walking to "+direction);
    }
}
