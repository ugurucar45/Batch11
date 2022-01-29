package mentoring2.RecapJava;

public class StringBuilders {
    /*
        POSSIBLE INTERVIEW QUESTIONS
    1) What is the difference between string builder and String?
        They are pretty useful for the framework in terms of mutability and
        immutability
        *String is immutable
        *String has more methods and special methods.(like concat, startswith, endswith)

        *StringBuilder is mutable
        *StringBuilder has also special methods like(append,reverse, insert..)

    2)What is the difference between string builder and String Buffer?
        *String Buffer is
     */
    public static void main(String[] args) {
        String name1="Ahmet";
        StringBuilder str= new StringBuilder("Ahmet");

        String name=new String("Ahmet");
        System.out.println(name.equals(name1));     //true      // check it values
        System.out.println(name==name1);            //false     // check it same area
        String name2="Ahmet";
        System.out.println(name1==name2);           //true
        String name3=new String("Ahmet");
        System.out.println(name3==name);            //false
        System.out.println(name3.equals(name));     //true

        System.out.println(name.equals(str));       //false
        name.concat(" Loves Java");
        str.append(" Loves Java");
        System.out.println(name.equalsIgnoreCase(String.valueOf(str))); //false
        System.out.println(name);                   //Ahmet
        System.out.println(str);                    //Ahmet Loves Java
    }
}
