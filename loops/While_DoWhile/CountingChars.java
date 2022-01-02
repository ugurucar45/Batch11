package loops.While_DoWhile;

import java.util.Scanner;

public class CountingChars {
    public static void main(String[] args) {
//        -count letters, digits and other characters in the String
//        String str = "$3%GTlk64mn^y?";
//        sout("There are <..> letters in the string");
//        sout("There are <..> digits in the string");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter");
        String str= sc.nextLine();
        int a=0,countletter=0,countdigit=0,specialchars=0;
        do {
            if(str.charAt(a)>='a'&&str.charAt(a)<='z'||str.charAt(a)>='A'&&str.charAt(a)<='Z'){
                countletter++;
            }
            else if (str.charAt(a)>='0'&&str.charAt(a)<='9'){
                countdigit++;
            }
            else{
                specialchars++;
            }
            a++;
        } while (a<str.length());
        System.out.println("sum of digit is "+countdigit);
        System.out.println("sum of letter is "+countletter);
        System.out.println("sum of special char is "+specialchars);

    }
}
