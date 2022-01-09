package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Practice1 {
    public static void main(String[] args) {
        HashSet <String> colorsHahs= new HashSet<>();
        LinkedHashSet <String> colorsLinked= new LinkedHashSet<>();
        TreeSet<String> colorsTree=new TreeSet<>();

        colorsHahs.add("White");    colorsLinked.add("White");       colorsTree.add("White");
        colorsHahs.add("Black");    colorsLinked.add("Black");       colorsTree.add("Black");
        colorsHahs.add("Blue");     colorsLinked.add("Blue");        colorsTree.add("Blue");
        colorsHahs.add("Purple");   colorsLinked.add("Purple");      colorsTree.add("Purple");
        colorsHahs.add("Red");      colorsLinked.add("Red");         colorsTree.add("Red");
        colorsHahs.add(null);       colorsLinked.add(null);          //colorsTree.add(null);

        System.out.println(colorsHahs);     // no order
        System.out.println(colorsLinked);   // insertion order
        System.out.println(colorsTree);     // ascending order

        colorsTree.descendingSet();
        System.out.println(colorsTree.descendingSet());

        Set<String> example= colorsTree.descendingSet();
        System.out.println(example);

    }
}
