package Strings;

public class Methods5 {
    public static void main(String[] args) {
        String word="Sunday";
    //replace();    it changes some letter to another letter

        String updatedWords=word.replace('a','$'); // single cotasions only for the char
        System.out.println(updatedWords);       //Sund$y

        String update2=word.replace("Sun","Satur");
        System.out.println(update2);            //Saturday

        String update2Shows=updatedWords.replace("Sun","Satur");
        System.out.println(update2);            //Saturd$y

        String update3=word.replace("day","*");
        System.out.println(update2);            //Sun*

        System.out.println(word.replace("sun","Satur"));    //Sunday dont change becase lowercase sun cant found

        String code="java";
        System.out.println(code.replace('a','%'));


    }
}
