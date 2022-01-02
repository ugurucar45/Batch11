package ifStatement;

public class CurlyBracketPractice {
    public static void main(String[] args) {
        int number= 1234;
        if (number==1234)
            System.out.println("Number is equals to 1234");
            System.out.println("Number is not equals to 1234");

        if(number==5)
            System.out.println("Hello World");
            System.out.println("Hello JAVA");
            System.out.println("Hello Selenium");
            System.out.println("Hello Alex");
            System.out.println("Hell All");
        int num1=6;
        if(num1<10)
            num1++;
        System.out.println(num1);
        int num2=4;
        if(num2>20)//if false but shows sout because it has not curly brakes
            num2++;
        System.out.println(num2);
        if(num2>20)/*false */ {//have curly and i skip all steps in curly because if false
            num2++;
            int x = number + num2 + 67;
            x = x * 7;
            x += num2;
            System.out.println("I m in the curly ===>" + num2);
        }


            // i THINK This is good examples
            int a;
        if(1==1)
            a=2+2;// if true this line effective, if false this line not effective( no curly)
            System.out.println("==========");
            System.out.println(a);




        int capacity=20,studentNumber=25;
        if (capacity>studentNumber)                                     //False
            System.out.println("There is enought space in classroom");  //not effective
        studentNumber++;                                                //effective
            System.out.println(studentNumber);                          //effective

    }
}
