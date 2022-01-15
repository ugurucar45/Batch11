package immutable;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone =new Phone();

        double price= phone.getPrice();
        System.out.println(price);

        System.out.println(phone.getPrice());//i use getter and i reach private object here
        System.out.println(phone.getColor());
        System.out.println(phone.getBrand());

        Phone phone1=new Phone(900,"white","iPhone"); //in did it if i dont do it this class call a immutable
        System.out.println(phone1.getBrand()+" - "+phone1.getColor()+" - "+phone1.getPrice()+"$");


    }
}
