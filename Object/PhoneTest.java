package Object;

public class PhoneTest {
    public static void main(String[] args) {

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
