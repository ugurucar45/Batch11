package loops.While_DoWhile;

public class DoWhilePractice1 {
    public static void main(String[] args) {
        //find and show sum of the number between 10 to 20 by using do-while loop
        int a = 10, b = 20,sum=0;
        do {
          sum+=a;
          a++;
        } while (a <= b);
        System.out.println("sum is "+sum);
    }
}
