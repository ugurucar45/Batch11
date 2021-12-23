package Object;

public class TestMath {

    public static void main(String[] args) {
        MathPractice object= new MathPractice();
        object.sum();                      //11 + 22 = 33
            //object.a=12;                         //if a and b are instance variable i am reassigned like this
            //object.b=44;
            //object.sum();                        //12 + 44 = 56
        object.total(4,5);           //4 + 5 = 9
        object.total(10,5);          //10 + 5 = 15
        object.total(31731,123441);


        //System.out.println(object.sum());
        // you can not use method which has void return type in the sout
        int a=object.sum2(4,5);
        //int b=object.total(4,5);              // error because total methods return type is just shows not take number
        System.out.println(object.sum2(5,3));
        int x=a*a;                              //if you want you will use;




    }
}
