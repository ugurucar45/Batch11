package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UniquePractice {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Zack");
        names.add("Zack");
        names.add("David");
        names.add("David");
        names.add("Jack");
        names.add("Jessi");

        System.out.println(names);

        //first idea
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(names);
        System.out.println(hashSet);

        //second idea
        HashSet <String> hashSet1=new HashSet<>();
        for(String name:names){
            hashSet1.add(name);
        }
        System.out.println(hashSet1);

        //use iterator

        //fourth idea --> use constructor of set, pass the source collection into the constructor of set
        HashSet<String> hashSet2=new HashSet<>(names);
        System.out.println(hashSet2);


    }
}
