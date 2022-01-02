package wrapperClass;

import object.Car;
import object.Student;

public class Practice1 {
    public static void main(String[] args) {
        byte b=2;
        Byte bt=new Byte(b);
        System.out.println(bt);//2
        Student st=new Student();
        System.out.println(st);//hash code
        Car car5=new Car("Honda");
        System.out.println(car5);//My car's brand is Honda
    }
}
