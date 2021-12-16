package Loops.ForLoop;

public class PerfectNumber {
    public static void main(String[] args) {
        //perfect number
        //if sum of the divisors (except number itself) equals to number, it is called perfect number > ex: 28

        //1,2,4,7,14
        int num = 34, sum = 0;
        for (int divisor = 1; divisor <= num / 2; divisor++){
            if (num % 2 == 0) {
                sum += divisor;
            }
        }
        if (num == sum) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is NOT a perfect number");
        }

    }
}
