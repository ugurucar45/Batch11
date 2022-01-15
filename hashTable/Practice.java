package hashTable;

import java.util.Hashtable;

public class Practice {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(4, "cherry");
        hashtable.put(5, "kiwi");
        hashtable.put(1, "apple");

        System.out.println(hashtable);

        System.out.println(hashtable.get(2));       //null
        System.out.println(hashtable.get(1));       //apple

        System.out.println(hashtable.keySet());     //[5, 4, 1]
        System.out.println(hashtable.values());     //[kiwi, cherry, apple]
        System.out.println(hashtable.entrySet());   //[5=kiwi, 4=cherry, 1=apple]
        System.out.println(hashtable);              //{5=kiwi, 4=cherry, 1=apple}

        //adding null key or null value
        //  hashtable.put(null,"orange");
        //  hashtable.put(2,null);

        hashtable.put(3, "strawberry");
        System.out.println(hashtable);              //{5=kiwi, 4=cherry, 3=strawberry, 1=apple}

        Hashtable<String, String> hashtable1 = new Hashtable<>();
        hashtable1.put("a", "b");
        hashtable1.put("m", "x");
        hashtable1.put("k", "g");
        hashtable1.put("r", "a");
        System.out.println(hashtable1);             //{m=x, a=b, k=g, r=a}

    }
}
