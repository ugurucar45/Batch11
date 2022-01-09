package arrayList;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {

        //store 5 computer objects into an ArrayList
        Computer com1=new Computer("Mac",1100,16,"Silver",500);
        Computer com2 =new Computer("Hp",1920,15,"Black",200);
        Computer com3 =new Computer("Dell",1920,18.0,"Black",200);
        Computer com4 =new Computer("Lenovo",1920,20.0,"Black",200);
        Computer com5 =new Computer("Mac",1920,15.0,"Black",200);

        ArrayList<Computer>list=new ArrayList<>();
        com1.getClass();
        list.add(com1);
        list.add(com2);
        list.add(com3);
        list.add(com4);
        list.add(com5);
        System.out.println(list);

        String str1="Java";
        String str2="easy";
        String str3="don't make it tough";
        System.out.println(str1);

        // reach out all mac computers and show them
        ArrayList<Computer> macComputers=new ArrayList<>();

        for (Computer device:list) {
            if(device.brand.equals("Mac")){
                System.out.println(device);
                System.out.println(device.brand);
                System.out.println(device.price);
                macComputers.add(device);
            }
        }
        System.out.println(macComputers);
    }
}
