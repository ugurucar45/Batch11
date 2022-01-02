package ternary;

public class TernaryPractice2 {
    public static void main(String[] args) {
        int a=3,b=5,k=7;
        int r1=a>=k ? a + k++ : ++b + k;
        System.out.println(r1); //13
        // k=7 b=6

        int r2 =k<++b ? 2* ++k : --k*2-1;
        System.out.println(r2);//11

        System.out.println(k>=b?"i got this":false);

        System.out.println("test".equals("test")?"TEST".toLowerCase():99);
        //String x= "test".equals("test")?"TEST".toLowerCase():99;
    }
}
