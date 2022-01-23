package OOP.Abstraction.Interfaces.Task;

public class Test {
    public static void main(String[] args) {

        Shape shape=new Triangle(4,5,3,3);

        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());

        Triangle triangle=new Triangle(1,1,1,1);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

        Isosceles isosceles= new Isosceles(2,2,2,2);
        isosceles.getArea(); // this is executed from parent which is Triangle,
                                // but it wants to call getArea method from Isosceles if there is no implement in Isosceles
        System.out.println(isosceles.getArea());


        Triangle triangle1=new Isosceles(3,3,3,3);
        triangle1.getArea();
        System.out.println(triangle1.getArea());

        Shape shape1=new Isosceles(4,4,4,4);
        shape1.getPerimeter();
        System.out.println(shape1.getArea());

        Shape shape2=new Triangle(5,5,5,5);
        System.out.println(shape2.getArea());

        System.out.println(((Triangle)shape2).getArea());
        System.out.println(((Isosceles)shape1).getArea());
        System.out.println(((Triangle)shape1).getArea());
        System.out.println(((Shape)triangle).getArea());


    }
}
