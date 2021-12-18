package Array;

public class ForEachPractice1 {
    public static void main(String[] args) {
        double[] checks={2540,10000,100000,65.50,1.99};
        //by using for each loop, find and print out the total amount of checks
        double sum=0;
        for(double i:checks){
            sum+=i;
        }
        System.out.println(sum);
    }
}
