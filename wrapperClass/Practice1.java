package wrapperClass;

import object.Car;
import object.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        byte b=2;
        Byte bt=new Byte(b);
        System.out.println(bt);//2

        Student st=new Student();
        System.out.println(st);//hash code
        Car car5=new Car("Honda");
        System.out.println(car5);//My car's brand is Honda

        short s=7;
        Short sh=new Short(s);//7

        char c='b';
        Character ch=new Character('a');
        System.out.println(ch);//a

        Integer in=new Integer(4);
        Integer integer1 = new Integer("4");
        System.out.println(integer1);
        int integer2 = new Integer("4");
        System.out.println( integer2+9);

        Float fl=new Float(3.4);
        Double db= new Double(4.5);
        Long lg=new Long(1234);

        Boolean bl= new Boolean(true);
        System.out.println();
        Boolean bl1 = new Boolean("123");
        System.out.println(bl1);

        //object version of primitives


        int i=new Integer(22);  //UnBoxing  --->  when java converts Wrapper class object to primitive data
        Integer number =3;          //AutoBoxing   --> when you store primitive data to Wrapper
        Integer number1 =i;
        System.out.println(number.toString().concat(" hi number"));

        Student sts=new Student();
        //array
        int[] numbers ={i,number/*,sts*/};//sts not working because not turn to the int version

        System.out.println(number*25);//75
        Practice1 p= new Practice1();
        p.add(2);//32


    }
    public void add(Integer i){
        System.out.println(34-i);
    }
}
