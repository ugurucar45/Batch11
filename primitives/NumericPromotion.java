package primitives;

public class NumericPromotion {
    public static void main(String[] args) {
        byte b1=12;
        short sh1=b1, sh2=3;
        // byte b2=sh2; compile time error
        // you cannot store larger data type into smaller data type
        int result1=b1+sh2;// short+byte must be bigger than big ones
        //short result1=b1+sh2; compile time error
        byte b2=2;
        //byte result2=b1+b2; compile time error
        int result2=b1+b2;// numeric promotion happens and java promotes smaller data types to int

        int i1=4;
        double d1=i1;
        //int i2=d1; compile time error( you cannot store double another integer
        float f1=1.2f,f2=3.4f;

        float result3=f1+f2;

        double d3=result3;
        //float f3=d3; compile time error

        double d4=1.2;
        //float result4=f1+d4;// it says provided double
        double result5 =f1+d4;//numeric promotion happens and java promotes to the larger data type

        char c=23;



    }
}
