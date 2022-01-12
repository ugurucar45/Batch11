package map;

import java.util.HashMap;
import java.util.Map;

public class CountAndStore {
    public static void main(String[] args) {
        String[] drinks = {"coke", "water", "coke", "coffee", "ayran", "ayran", "ayran", "ayran", "ayran", "ayran", "water","lime juice"};

        HashMap<String, Integer> map = new HashMap();

        for (String a : drinks) {
            if (!map.containsKey(a)) {
                map.put(a, 1);
            } else {
                map.put(a,map.get(a)+1);
            }
        }

        System.out.println(map);
    }

}
