package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        HashMap <Integer,String> cookies= new HashMap<>();
        cookies.put(8,"Chocolate");
        cookies.put(2,"Oreo");
        cookies.put(3,"Browne");
        cookies.put(6,"Orange");


        printKeysOneByOne(cookies);
        printValuesOneByOne(cookies);
    }
    //create a method that will take a map<Integer,String> as a parameter
    // and it will print out keys from that map one by one
    public static void printKeysOneByOne( Map<Integer,String> key){
        for (Integer num:key.keySet()){
            System.out.println(num);
        }
    }    public static void printValuesOneByOne( Map<Integer,String> key){
        for (String num:key.values()){
            System.out.println(num);
        }
    }

}
