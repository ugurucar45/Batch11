package Array;

import java.util.Arrays;

public class ForEachPractice2__CharacterOne {
    public static void main(String[] args) {
        char[] chs = {'A', '4', '&', 'z', '3', 'u', '*'};
        char[] c = new char[chs.length];
        for (char a : chs) {
            if (a >= 'a' && a <= 'z'||a >= 'A' && a <= 'Z'){
                System.out.print(a+" ");

            }
        }
        System.out.println("\n===========");//same code but has some method
        for(char letter:chs){
            if(Character.isAlphabetic(letter)){
                System.out.println(letter+" letter");
            }else if(Character.isDigit(letter)){
                System.out.println(letter+" digit");
            }else{
                System.out.println(letter+" symbol");
            }
        }





    }
}
