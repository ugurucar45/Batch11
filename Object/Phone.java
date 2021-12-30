package Object;

public class Phone {

    String brand;
    double price = 1000;
    String color;


    //  left click generate getter and settler


    // constructor
    public Phone() {//don t have return type because constructor
        System.out.println("This no argument constructor");
    }

    // constructor
    public Phone(String newColor){
        this.color=newColor;
        System.out.println("This One argument constructor");

    }










    // method to set color
    public void setColor(String color1, int i) {
        color = color1;
    }

    // method to call
    public void call(int number) {
        System.out.println(number + " is being called");
    }

    public void Phone() {//have return type
        int a = 5;
        a = 9;
    }


}
