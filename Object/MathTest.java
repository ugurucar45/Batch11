package Object;

public class MathTest {

    public static void main(String[] args) {
        MathPractice object = new MathPractice();
        object.sum();                      //11 + 22 = 33
        //object.a=12;                         //if a and b are instance variable i am reassigned like this
        //object.b=44;
        //object.sum();                        //12 + 44 = 56
        object.total(4, 5);           //4 + 5 = 9
        object.total(10, 5);          //10 + 5 = 15
        object.total(31731, 123441);


        //System.out.println(object.sum());
        // you can not use method which has void return type in the sout
        int a = object.sum2(2, 3);
        //int b=object.total(4,5);              // error because total methods return type is just shows not take number
        System.out.println(object.sum2(5, 3));
        int x = a * a;                              //if you want you will use;
        object.sum2(x, 12);

        String str = object.speak();
        System.out.println(str);
        System.out.println(object.speak());

        //call numberToString method, and do concetenation
        //with your first and last name and print it out
        String dd = object.numberToString(3.33).concat(" ugur ucar");
        System.out.println(dd);
    }
}
