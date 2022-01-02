package primitives;

public class BooleanPractice {
    public static void main(String[] args) {
        boolean isHungry= true;
        System.out.println(isHungry);
        boolean isLightOn=false;
        System.out.println("isLightOn ="+isLightOn);

        System.out.println(true);
        System.out.println(isHungry == isLightOn); // true not equals false after that false
        isLightOn = isHungry; // right side always copied
        isLightOn = false;

        System.out.println("Last version for isHungry  >> "+isHungry); //true
        System.out.println("Last version for isLightOn >> "+isLightOn); //false

    }
}
