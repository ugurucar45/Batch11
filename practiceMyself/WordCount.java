package practiceMyself;

import java.util.ArrayList;
import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String str="We love coding";
        WordCount obj=new WordCount();
        System.out.println(obj.wordCount(str));
    }
    public int wordCount(String str){
    int a=1;
        for (int i=0;i<str.length();i++){
           if(str.charAt(i)==' '){a++;}
        }
    return a;}
}