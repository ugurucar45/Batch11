package strings;

public class PracticeChar0 {
    // We will ask user to enter a letter
    // abcdefghijklmopqrstuvwxyz
    // If user enters char that is not an English letter
    // code should pront false
    // If user enters English letter code should print true
    public static void main(String[]args){
        //ASCII table
        //The table that all chars has a unique value
//        int charvalueA='a';
//        System.out.println(charvalueA);
//        char a=97;
//        char a2='a';
//        System.out.println(a);
        //if the value of the char between char a and char z
        //ot means this char is a letter

        System.out.println("Please enter a char letter");
        char ch='a';
        //if this ch is a letter or not.
        // if the value of the char between char a and char z
        // it means this char is a letter

        boolean isLetter= ch>='a'&&ch<='z'||ch>='A'&&ch<='Z';
        System.out.println(isLetter);
    }
}
