package Exception;

public class Practice3 {
    public static void main(String[] args) {


//        throw -- is used to create a new exception

        double myMoney= 100;
        double costOfItem$=200;

        if(myMoney>costOfItem$){
            throw  new NullPointerException();
        }

        myMethods();
    }
    static void myMethods(){
        System.out.println("This is my method to blow up the memory");
    }
}
