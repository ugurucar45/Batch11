package primitives;

public class UnaryPractice {
    public static void main(String[] args) {
        int studentNumber=25;
        System.out.println(studentNumber++);//it shows 25 but it is 26
        System.out.println(studentNumber);//shows 26 still 26

//        studentNumber=studentNumber++;
//        System.out.println(studentNumber);//25
//
//        int num1=studentNumber++;
//        System.out.println(num1);
//        int num2=studentNumber++;
//        System.out.println(num2);
//        studentNumber=++studentNumber;
//        System.out.println(studentNumber);//26
        studentNumber++;
        System.out.println(studentNumber); //27


        int count=5;
        System.out.println(count++);//increases to 6 but shows 5
        System.out.println(++count);//increases to 7 and shows 7

        //=====================
        int number =8;
        System.out.println(number--);//shows 8 but it is 7
        System.out.println(number--);//shows 7 but is is 6
        System.out.println(--number);//shows 5 it is 5

        number++;//6
        System.out.println(number++ + number++);// shows 6 but it is 7 + shows 7 but it is 8
                                                // number is =8
        int result = --number + --number + 2 - number++ * 2; //shows 7 it is 7 + shows and it is 6+ 2 + shows 6 it is 7 *2
                                                             //7+6+2-6*2 ==>3
        System.out.println(result); //  result is 3
        System.out.println(number); //  number is 7
        //====================
        int b=++number;
        System.out.println(b);

        int donutPrice= 2;
        int Totalprice=(12*donutPrice);
        System.out.println("DD Option= Customer will pay --> " + Totalprice--);
        System.out.println("KK Option= Customer will pay --> " + --Totalprice);


        char ch='a';
        System.out.println(ch);//a
        System.out.println(++ch);//b
        ch++;//c
        ++ch;//d
        System.out.println(ch);//d
        System.out.println(--ch);//c


//        int a=25;
//        while (a<=30) {
//            System.out.println("Student Number ---> "+(a++));
//      }
    }
}
