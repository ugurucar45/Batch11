package primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {
        //find the product of digits from given number
        //456 ===> 4*5*6=120 sout them
        int num= 456;
        int a=num%10;
        num=num/10;
        int b=num%10;
        num=num/10;
        int c=num%10;
        num=num/10;

        int sum= a*b*c;
        System.out.println("The product is="+ a*b*c);
        System.out.println("The product is="+ sum);
    }
}
