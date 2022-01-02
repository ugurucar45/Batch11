package strings;

import java.util.Locale;

public class MethodsTask2 {
    public static void main(String[] args) {
//        ===Task==
//                String str = " Zero to Ten  ";
//        - change 'Ten' with/to 'HERO'
//                - make all of the string uppercase
//                - remove all spaces
//        - get only first three letter
//        - print the length of those three letters as ==> "The length of final verison is: +  <length>"
        String str = " Zero to Ten  ";
        str=str.replace("Ten","HERO");  // Zero to HERO
        System.out.println(str);
        str=str.toUpperCase(Locale.ROOT);               // ZERO TO HERO
        System.out.println(str);
        str=str.trim();                                 //ZERO TO HERO
        System.out.println(str);
        str=str.replace(" ", "");       //ZEROTOHERO
        System.out.println(str);

        str=str.substring(0,3);                         //ZER
        System.out.println(str);

        int x=str.length();
        System.out.println("The length of final version is: "+x);//3

        //method chain if ===> you can use method
        /*
            -change/ replace 'Ten' with/to 'HERO'
            -make all of string uppercase
            -remove all spaces
            -get only first three letters
            -print the length of those three letter as==> "The length of final version is: + <length>"
         */

        str= " Zero to Ten  ";

       System.out.println(str.replace("Ten","HERO").toUpperCase(Locale.ROOT)
               .trim().replace(" ", "").substring(0,3)+" ===> "+"The length of final version is : "
               +str.length());


    }
}
