package OOP.FinalPractice;

public class Shirt {

    final String COLOR="White";
    double price;
    char size;
    String material;

    public Shirt(/*String color,*/ double price, char size, String material) {
//        this.color = color;   --> its final you cannot change because its final
        this.price = price;
        this.size = size;
        this.material = material;
    }
    public Shirt(){
        System.out.println("This is no argument constructor");
    }
    public void setCOLOR(String color){
        //this.COLOR=color;     >> it will not compile, since COLOR is final
    }
    final public void wash() {
        System.out.println("You can wash this shirt");
    }

    public boolean fit(char size) {
        if (this.size == size) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Shirt shirt=new Shirt();
        System.out.println(shirt.COLOR);
    }
}
