package OOP.FinalPractice;

public final class Tshirt extends Shirt {

//    public void wash() {  >> You can not override final method
//        System.out.println("You can wash this Tshirt");
//    }



    @Override
    public boolean fit(char size) {
        return true;
    }
}
