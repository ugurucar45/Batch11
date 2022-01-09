package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Dima");
        names.add("Diana");
        names.add("Aizat");
        names.add("Samir");

        System.out.println(names);

        // convert this arrayList to array
        Object[] arrayNames= names.toArray();

        System.out.println(Arrays.toString(arrayNames));

        ArrayList<Flower> flowersList=new ArrayList<>();

        Flower flower1 =new Flower("Rosa","Red",10.99);
        Flower flower2 =new Flower("Lily","White",10.99);
        Flower flower3 =new Flower("Rosa","Red",10.99);

        flowersList.add(flower1);
        flowersList.add(flower2);
        flowersList.add(flower3);
        Object[] arrayFlowers=flowersList.toArray();

        System.out.println(Arrays.toString(arrayFlowers));
        for (Object o:arrayFlowers){
            System.out.println(o);

        }

    }
}
