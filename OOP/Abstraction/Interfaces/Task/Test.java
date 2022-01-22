package OOP.Abstraction.Interfaces.Task;

public class Test {
    public static void main(String[] args) {

        Shape shape=new Triangle(4,5,3,3);

        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());

        Triangle triangle=new Triangle(1,1,1,1);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

    }
}
