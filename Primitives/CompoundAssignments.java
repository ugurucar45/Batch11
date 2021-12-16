package Primitives;

public class CompoundAssignments {
    public static void main(String[] args) {
        // +=       -=      *=      /=      %=

        int num1= 7;
        int num2= num1+7; //14
        num1 += num2; //14+7=21
        System.out.println(num1); //21

        num2-=8; // num2=num2-8   =14-8=6
        System.out.println(num2); //6
        int num3=num1+num2;
        num2+=num3;
        num1+=num3;
        System.out.println(num3); //27
        System.out.println(num2); //33
        System.out.println(num1); //48


        /*
        ch2*='3';
        System.out.println(ch2);

        ch1-=9;
        System.out.println(ch1);

        int remainder=ch1%3;
        System.out.println(remainder);

        ch1%=2;
        System.out.println(ch1);
        */
    }
}
