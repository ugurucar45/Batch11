package blocks;

public class Practice {
    String name;
    String lastName;
    static String color;

    {
        //Instance block runs for every object
        //initialize instance variables
        this.lastName="Karol";
        name = "Joe";
        System.out.println("This is Instance block");
    }

    static {
        //Static block runs before everything in the class
        //initialize static variables
        color = "Orange";
        System.out.println("This is Static block");
    }

    public static void main(String[] args) {
        //run the code but static show instance not, instance waiting object

        Practice o = new Practice();        //i see this is instance variables right now
        Practice o1 = new Practice();       //show instance 2 times

    }
}
