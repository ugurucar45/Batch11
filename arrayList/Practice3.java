package arrayList;

import java.util.ArrayList;

public class Practice3 {
    /*===TASK===:
    -Create an ArrayList that will store 5 fruit names
    -Print out stored values by using for Loop
    */
    public static void main(String[] args) {

        ArrayList <String> fruits= new ArrayList<>();
        fruits.add("Strawberry");
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Watermelon");
        fruits.add("Kiwi");
        for(String fruit:fruits){
            System.out.println(fruit);
        }
        System.out.println(fruits);
        System.out.println("===================");
        //create a method that will take arrayList as a parameter of fruits
        //this method will print out fruits if has 5 or more letters
        Practice3 ss =new Practice3();
        System.out.println();
    }
    public void arrayLetter(ArrayList <String> c){
        for (String a:c) {
            if(a.length()>4){
                System.out.println(a);
            }
        }
    }
    public void sum(int i1,int i2){
        System.out.println(i1+i2);
    }
}
