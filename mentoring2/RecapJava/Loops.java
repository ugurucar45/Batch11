package mentoring2.RecapJava;

import java.util.Scanner;

public class Loops {
    /*
    Possible Interview Questions:
    1)Many technical questions they require to use loops to solve the questions.

    LOOPS: is a way to iterate the elements one by one
           is cycle for reptititive actions.

    TYPE OF LOOPS:
    *Do While
    *While
    *For Loop
    *For Each

    DO WHILE: WE NEED IT ONCE WE NEED TO RUN THE CODES AT LEAST ONE TIME.


     */
    public static void main(String[] args) {
        int x=6;
        int y=7;
        do {
            System.out.println("hello");
        }while (y<x);

        int input;
//        do {
//            Scanner scan=new Scanner(System.in);
//            System.out.println("1)Continue\n2)Exit");
//            input=scan.nextInt();
//        }while (input!=2);

        //while loop(int number=1234; reverse it and get multiplication)
        //output:4321
        //multi:24;      sum:10;
        int reverse=0;
        int ss;
        int sum=0;
        int multi=1;
        int a=1234;
        while(a>0){
            ss=a%10;
            a=a/10;
            sum=sum+ss;
            multi*=ss;
            reverse=(reverse*10)+ss;
        }
        System.out.println(reverse);
        System.out.println(sum);
        System.out.println(multi);

//        int number = 1234;
//        int multiplication =1;
//
//        String str=Integer.toString(number);
//        String str1="";
//        int i=str.length()-1;
//        while(i>=0){
//            str1+=str.charAt(i);
//            multiplication*=Integer.parseInt(str.substring(i,i+1));
//            i--;
//        }
//        System.out.println(str1);
//        System.out.println(multiplication);

        // Can you find the PRIME NUMBER between1-100;
        for (int hu=0,aa=0;hu<=100;hu++,aa=0){
            for(int j=hu/2;j>0;j--){
                if (hu%j==0){
                    aa++;
                }
            }
            if(aa==1){
                System.out.print(hu+", ");
            }
        }

        System.out.println();


        //FOREACH:
        int array[]={1,2,3,5};
        for(int z:array){
            System.out.print(z+", ");
        }
    }
}
