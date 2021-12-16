package Loops.ForLoop;

public class MultiplicationTable {
    public static void main(String[] args) {
        // create a multiplication table from 1 to 5

        for (int a=1;a<=5;a++){
            for(int b=1;b<11;b++){
                System.out.println(a+" * "+b+" = "+a*b);
            }
        }
    }
}
