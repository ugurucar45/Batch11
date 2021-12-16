package Strings;

import java.util.Locale;

public class Methods4 {
    public static void main(String[] args) {

        String text="Selenium";
        //contains(); it will if the string has given value or not, returns true/false

        boolean result1=text.contains("le");
        System.out.println(result1);                    //true
        System.out.println(text.contains("t"));         //false
        System.out.println(text.contains("selenium"));  //false
        System.out.println(text.contains("1"));         //false
        System.out.println(text.contains("lev"));       //false
        System.out.println(text.contains("nium"));      //true

        //equals(); it will check if the given string has exactly same order of char. will return true/false

        System.out.println(text.equals("Selenium"));    //true
        System.out.println(text.equals("nium"));        //false
        System.out.println(text.equals("Selen"));       //false

        //equalsignorecase();

        System.out.println(text.equalsIgnoreCase("SELeniUm"));  //true
        System.out.println(text.equalsIgnoreCase("SeLeNiUm"));  //true
        String text2="Java";
        System.out.println(text2.equalsIgnoreCase("jAvA"));     //true
        System.out.println(text.equalsIgnoreCase(text));//false
        String text3="SELENIUM";
        boolean result2=text3.equalsIgnoreCase(text);   //Selenium=SELENIUM
        System.out.println(result2);                    //True

        text3.concat(text);             //its happening but not saved, ignore this line
        text3.toLowerCase(Locale.ROOT); //assign lower case
        text=text3;                     //text=lowercase
        System.out.println(text3.equals(text));         //True


    }
}
