package Object;

public class Phone {

    String brand;
    double price = 1000;
    String color;


    //  left click generate getter and settler


    // constructor
    public Phone() {//don t have return type because constructor
        System.out.println("This NO argument constructor");
    }

    // constructor
    public Phone(String newColor) {
        this.color = newColor;
        System.out.println("This ONE argument constructor");
    }

    // constructor
    public Phone(String newColor,String newBrand){
        this.color=newColor;
        this.brand=newBrand;
        System.out.println("This TWO argument constructor");
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
    public static void main(String[]args){
        Phone phone = new Phone();
//        phone.brand = "iphone";
//        phone.call(5369752);
        Phone phone1=new Phone();
        Phone phone2=new Phone("Pink");
        System.out.println(phone2.color);
        System.out.println(phone1.color);   //null but if parameter is static change pink
        Phone phone3=new Phone("Black","Samsung");

    }



}
