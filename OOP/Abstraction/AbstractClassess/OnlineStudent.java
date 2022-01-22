package OOP.Abstraction.AbstractClassess;

public class OnlineStudent extends Student {
    public void attend(){
        System.out.println("Online Student is attending via zoom");
    }
    public void watch(){
        System.out.println("Online Student is watching Java");
    }
    public OnlineStudent(){
        super("Marry",25);
    }

    public void sleep(int hour){
        System.out.println("Online student is sleeping");
    }

}
