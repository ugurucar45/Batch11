package Mentoring;

import java.util.Locale;

public class AlphaCharacter {
    public static void main(String[] args) {
        /*
        //PRINT OUT ALPHABETICAL,DIGIT, AND SPECIAL CHARACTERS FROM
//THE STRING SEPERATELY
//String given="ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
//1-Print out alphacharacter
//2-Print out digit
//3-Print out special character
//main method
         */
        String gi = "ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
        String alp = "";
        String digit = "";
        String special = "";
        for (int a = 0; gi.length() > a; a++) {
            if (gi.charAt(a) >= 'a' && gi.charAt(a) <= 'z' || gi.charAt(a) >= 'A' && gi.charAt(a) <= 'Z') {
                //if(Character.isAlphabetic(gi.charAt(a))
                alp += gi.charAt(a);
            } else if (gi.charAt(a) >= '0' && gi.charAt(a) <= '9') {
                //if(Character.isDigit(gi.charAt(a))
                digit += gi.charAt(a);
            } else {
                special += gi.charAt(a);
            }
        }
        System.out.println(alp+digit+special);
    }
}