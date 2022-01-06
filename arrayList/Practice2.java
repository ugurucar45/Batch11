package arrayList;

import java.text.CharacterIterator;
import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        ArrayList <String> cities=new ArrayList<>();
        cities.add("Houston");
        cities.add("Houston");
        cities.add(1,"Boston");

        System.out.println(cities.get(1));
        System.out.println(cities);
        System.out.println("==============");

        cities.remove("Houston");
        System.out.println(cities);
        System.out.println("==============");

        ArrayList <String> shoes= new ArrayList<>();

        shoes.add("Nike");
        shoes.add("Adidas");
        shoes.addAll(cities);
        System.out.println(shoes);
        System.out.println("==============");

        shoes.remove("Boston");
        System.out.println(shoes);
        System.out.println(cities);
        System.out.println("==============");

        shoes.removeAll(cities);
        System.out.println(shoes);
        System.out.println("==============");

        shoes.remove(1);
        System.out.println(shoes);
        System.out.println("==============");

        shoes.addAll(cities);
        System.out.println(shoes);
        System.out.println("==============");

        ArrayList <String> animals=new ArrayList<>();

        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Monkey");
        animals.add("Giraffe");

        //set();    ----->
        System.out.println(animals);
        animals.set(1,"Fox");
        System.out.println(animals);



    }
}
