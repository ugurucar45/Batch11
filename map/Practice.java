package map;

import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap();



        //put()
        map.put(1,"Enes");
        map.put(2,"Alex");
        map.put(3,"David");
        map.put(4,"Alex");
        map.put(6,"Enes");
        System.out.println(map);

        map.put(1,"Yusuf");         // if you try to same key multiple times,
                                    // it will update the value for it
        System.out.println(map);

        map.put(null,"Enes");
        System.out.println(map);
        map.put(null,"David");
        System.out.println(map);



        // get()
        System.out.println(map.get(2));//alex     // it will get the calue for key 2
        System.out.println(map.get(3));//david
        System.out.println(map.get(null));//david



        //remove()
        map.remove(null);
        System.out.println(map);
        System.out.println(map.remove(1,"Yusuf"));
        System.out.println(map);



        //replace()
        map.replace(2,"Jennifer");
        System.out.println(map);

        map.replace(2,"Jennifer","Zack");
        System.out.println(map);

        //containsKey()
        System.out.println(map.containsKey("Zack"));
        System.out.println(map.containsKey(6));
        System.out.println(map.containsKey(19));

        //containsValue()
        System.out.println(map.containsValue("Enes"));
        System.out.println(map.containsValue(false));

        //size()
        System.out.println(map.size());//4

        //isEmpty()
        System.out.println(map.isEmpty());// its not ewpty false

        //putAll()
        HashMap <Integer,String> map1=new HashMap<>();//string string yaptik not provided it must tobe same
        map1.put(1,"White");
        System.out.println(map1);

        map1.putAll(map);
        System.out.println(map1);

        map1.put(9,"Brain");
        System.out.println(map1);





    }
}
