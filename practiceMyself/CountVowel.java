package practiceMyself;

import java.util.HashMap;

public class CountVowel {
    public static void main(String[] args) {
        String str = "What a nice day to code";
        CountVowel obj=new CountVowel();
        System.out.println(obj.countVowel(str));

    }

    public HashMap countVowel(String str) {
        str=str.toLowerCase();
        HashMap<String, Integer> a = new HashMap<>();
        for (int i = 0, k = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                k++;
            }
            if (i == str.length() - 1) {
                a.put("a", k);
            }
        }
        for (int i = 0, k = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                k++;
            }
            if (i == str.length() - 1) {
                a.put("e", k);
            }
        }
        for (int i = 0, k = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'i') {
                k++;
            }
            if (i == str.length() - 1) {
                a.put("i", k);
            }
        }for (int i = 0, k = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') {
                k++;
            }
            if (i == str.length() - 1) {
                a.put("o", k);
            }
        }for (int i = 0, k = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'u') {
                k++;
            }
            if (i == str.length() - 1) {
                a.put("u", k);
            }
        }
        return (HashMap) a;
    }
}
