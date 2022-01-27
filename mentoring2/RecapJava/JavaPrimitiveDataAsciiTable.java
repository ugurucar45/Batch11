package mentoring2.RecapJava;

public class JavaPrimitiveDataAsciiTable {
    /*
    What is Java    ---->   Java is a programming language which is help people communicate with the computer(program).
    (BRIDGE BETWEEN HUMAN AND COMPUTER)
    Possible Interview Questions:

    1)What is JDK, JVM, JRE?
    2)What do you know about JDK, JVM, and JRE(American Style)
    3)There is no possible directly asking questions about PRIMITIVE but most of the technical questions require
    Primitive DATA

    JDK :       Java Development Kid        --> is a software development kit required to develop application in
    java with specific libraries.

    JRE :       Java RunTime Environm       --> is a set of software tools responsible for EXECUTION.

    JVM :       Java Virtual Machine        --> is responsible for converting byte to binary code to the machine.

    PRIMITIVE DATA:     -->     is a way to store data and reuse it.


    WHOLE NUMBERS:
    int
    byte
    long
    shor

    DECIMAL NUMBER:
    double
    float

    CONDITION:
    Boolean     --> TRUE OR FALSE

    CHARACTER:
    Char        --> ASCII TABLE

     ASCII TABLE:
     is the table that contains all of the characters(numbers,symbols,letters etc..)

     short a =5;
     short b =6;
     short c= (a+b);
     sout(c);
     */
    public static void main(String[] args) {
            short a=5;
            short b=6;
            short c=(short) (a+b);// his is going to give you compile error because whenever
            //do any with below int. it will automatically converts to the int
            System.out.println(c);

            double numbers =5.643534534534d;
            float numbers2 =12.543534f;
            char letter=65;     //ascii table something
            char letter2='g';   //h
            System.out.println(letter);
            System.out.println(letter2);
    }
        }
