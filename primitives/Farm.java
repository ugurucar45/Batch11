package primitives;

public class Farm {
    public static void main(String[] args) {
        /*
        in a farm, there are 12 cows and 23 chicken
        1 find the total legs of the animals in the farm an print
        2 if each cow 2345 each chicken 23.99 find total worth
         */

        int cow=12, chi=23;
        int cowleg=4, chileg=2;
        int sum1 = (cow*cowleg)+(chi*chileg);
        System.out.println("Total legs is = "+sum1);
        double cowprice=2345, chiprice=23.99;
        double total=cow*cowprice+chi*chiprice;
        System.out.println("Total worth is = "+ total);
    }
}
