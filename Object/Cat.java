package Object;

public class Cat {
    String name;
    int age;
    String color;
    int foodAmount;
    /*
    Create a method named as run() it will take a parameter as destination
    it will reduce food amount by 1 for every execution
    it will print out as "Cat is running ...<west>"
     */

    public void run(String destination) {// i dont need any return i use void
        foodAmount -= 1;
        System.out.println(name + " is running to " + destination);
    }

    /*
    Create a method names as setColor(), it will take a parameter and initialize the color of the cat
     */
    public void setColor(String newColor) {
        color = newColor;
    }

    /*
    Create a method that will return color of cat, name it as getColor()
     */
    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Leo";
        cat1.age = 2;
        cat1.color = "Red";
        cat1.foodAmount = 100;

        cat1.run("West");
        System.out.println(cat1.foodAmount);

        System.out.println(cat1.color);     //old color red
        cat1.setColor("White");             //set color
        System.out.println(cat1.color);     //new color white

        Cat cat2 = new Cat();
        cat2.setColor("Black");
        System.out.println(cat2.getColor());
        String cat2color = cat2.getColor();
        System.out.println(cat2color);
    }
}
