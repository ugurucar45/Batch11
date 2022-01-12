package map;

import java.util.HashMap;

public class CountAndStore1 {
    public static void main(String[] args) {
        String string = "Ping Pong";
        string=string.replace(" ","");
        HashMap<Character, Integer> letterCount = new HashMap();
        for (int i = 0; i < string.length(); i++) {
            if (!letterCount.containsKey(string.charAt(i))) {
                letterCount.put(string.charAt(i), 1);
            } else {
                letterCount.put(string.charAt(i), letterCount.get(string.charAt(i)) + 1);
            }
        }
        System.out.println(letterCount);
    }
}
