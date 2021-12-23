package Object;

import java.util.Locale;

public class MathPractice {
    //int a = 11;
    //int b = 22;

    public void sum() {
        int a = 11;
        int b = 22;

        int sum = a + b;

        System.out.println(a + " + " + b + " = " + sum);
    }

    public void total(int num1, int num2) {//double click select
        // left click refactor
        // change all same name
        int total = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + total);

    }

    public int sum2(int number1, int number2) {
        int res = number1 + number2;
        System.out.println("--->>" + res);
        return res;
    }

    public String speak() {
        String aa = "Test";
        aa = aa.toUpperCase(Locale.ROOT);
        int i = 23;
        i++;
        boolean z=true;
        return z+(i + " This is example of String return type" + aa);
    }

    public String numberToString(double d){
        return ""+d;
    }
}
