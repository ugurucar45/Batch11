package ternary;

import java.util.Locale;

public class TernaryPractice {
    public static void main(String[] args) {
        int a=2, b=3;
        //      ?    :
        String result1= a<b ? "Hello" : "Bye";
        System.out.println(result1);

        //String result2=a>b ? a*b :"Text";
        // both options has to be same data type

        // String result3 = a<b ? System.out.println("dada"); : System.out.println("sad"); ;
        // it s not worked

        // ? : it is stored
        //like res1= a<b ? a+b :a*b
        boolean result4= a>=b ?a==b:a<b;
        System.out.println(result4);

        int result5= 'a'>'Z'? 5+6+7 :7-4-1 ;

        String str ="David";
        String result5a= str.substring(3).equals("id") ? str.toLowerCase(Locale.ROOT).concat(" is number") : str.toUpperCase(Locale.ROOT).concat(" is String");
        System.out.println(result5a);

        System.out.println(str.equalsIgnoreCase("DAVID") ? str.substring(3).toUpperCase(Locale.ROOT) : str.substring(3).toLowerCase(Locale.ROOT));

        int n1=2;
        int n2=3;
        int result6=n1%n2==0 ? 5 :6;
        System.out.println(n1%n2==0 ?5:6);

    }
}
