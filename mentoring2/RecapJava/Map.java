package mentoring2.RecapJava;

import javax.sound.midi.Track;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Map {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1)Can you tell me about map and why do you use map in your project?
        map is an awesome interface that I used in my framework to store my data as KEY-VALUE pairs.
        for example: in my finance company i was verifying the customers name with their SSN number. At this time
        all data was coming from our HashMap.

    2)What is the connections between map and collection?

        They are all usefull for the framework for different purposes. As i mentioned before set is all about uniquess,
        list is all about dublication and efficiency(indexing). map is all about key-value pairs.
        #HASHMAP:--> random order
        #LINKHASHMAP:--> insertion order
        #TREEMAP: --> ascending order
        SHOWOFF:Do you know sir/madam that is the combination of
        LIST AND SET --> the key part of the Map is referring to SET:
                         the value part of the Map is referring to LIST.
    3)What is the type of map and differences between them

    ***What is the difference between Hashmap and Hashtable?
     *Hashtable is synchronized .
     *Hashtable is slower.

     *-HashMap is non-synchronized.
     *HashMap is faster.

     */
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Peach", "Apple", "Orange", "Strawberry", "Banana", "Apple", "Cherry", "Orange"};
        // I want you get the numbers if fruits with a key-and value
        // output: Apple =3 , Banana =2, ...

        //i think you are asking me to find the numbers of each fruits ands want me show them like this output?
        //i am going to use loops to access each of the fruits
        // then I am going to put if conditions for a specific map.
        // and then print them out

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < fruits.length; i++) {
            if (!map.containsKey(fruits[i])) {
                map.put(fruits[i], 1);
            } else {
                map.put(fruits[i], map.get(fruits[i])+1);
            }
        }
        System.out.println(map);


        //HOMEWORK: String ="HELLO WORLD HOW IS IT GOING I AM GOOD OVERHERE";

        String str="HELLO WORLD HOW IS IT GOING I AM GOOD OVERHERE";
        TreeMap<String,Integer> map1=new TreeMap();

        for(int a=0;a<str.length();a++){
            if (!map1.containsKey(str.substring(a,a+1))){
                map1.put(str.substring(a,a+1),1);
            }
            else{map1.put(str.substring(a,a+1),map1.get(str.substring(a,a+1))+1);}
        }
        System.out.println(map1);
    }
}