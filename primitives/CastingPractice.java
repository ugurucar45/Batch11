package primitives;

public class CastingPractice {
    public static void main(String[] args) {
        int number1=23;
        long l1=number1;    //impilicit casting is happens by java
        short sh1= (short)number1; // explicit casting
        byte by1 =1,    by2=2;
        //short sum1=by1+by2; compile time error
        //java wants to store the result in to larger data type(int). thats why it is not compiling
        short sum2= (short)(by1+by2);   //explicit casting

        //short sum3=(short)by1+(short)by2; this is still individual casting for variable
                                            // result is not casted yet
        int price=(int)750.99; //
        System.out.println(price);

        double samsung=900.45;
        int pricesamsung=(int)samsung;
        System.out.println("samsung      ---->   "+samsung);
        System.out.println("samsungPrice ---->   "+pricesamsung);


    }
}
