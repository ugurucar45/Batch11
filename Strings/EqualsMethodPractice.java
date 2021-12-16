package Strings;

public class EqualsMethodPractice {
    public static void main(String[] args) {
    String name1="David";
    String name2="David";

        System.out.println(name1==name2);               //true
        System.out.println(name1.equals(name2));        //true
    String name3= new String("David");
        System.out.println(name1==name3);               //false
        System.out.println(name1.equals(name3));        //true
    String name4=new String("David");
        System.out.println(name3==name4);               //false
        System.out.println(name3.equals(name4));        //true
    String name5=name3;
        System.out.println(name3==name5);               //true
        System.out.println(name3.equals(name5));        //true
    String name6="Jenny";
    String name7="Jenny";
    String name8=name1;
        System.out.println(name8==name2);               //true
        System.out.println(name8.equals(name5));        //true

        System.out.println(name8==name4);               //false
        System.out.println(name8.equals(name4));        //true
    }
}
