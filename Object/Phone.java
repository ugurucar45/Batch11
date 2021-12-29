package Object;

public class Phone {

    String brand;
    double price;
    String color;




    //  left click generate getter and settler


        // constructor
    public Phone(){
        System.out.println("This no argument constructor");
    }
        // method to set color
    public void setColor(String color1){
        color=color1;
    }
        // method to call
    public void call(int number){
        System.out.println(number+" is being called");
    }



}
