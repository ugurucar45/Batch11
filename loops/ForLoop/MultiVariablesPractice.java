package loops.ForLoop;

public class MultiVariablesPractice {
    public static void main(String[] args) {
        /*
        int a=3;
        int b=3;
        for (int a=3,b=10 ; a<8 && b>0; a++,b--){
                //code
        }


         */

        for (int a = 3, b = 10; a < 8 && b > 0; a++, b--) {
            System.out.println("a is " + a + " b is " + b);
        }
        System.out.println("*******************");

        for (int a = 3, b = 2; a < 8 && b > 0; a++) {
            System.out.println("a is " + a + " b is " + b--);
        }
        System.out.println("*******************");
        int x = 1, y = 5;
        for (/* skip this part because i created before*/; x < 10 && y > 0; x++, y--) {
            System.out.println("Hello");
        }
        System.out.println("===================");
        int k;
        for (x=1,y=5,k=9; x < 10 || y > 0; x++, y--,k++) {
            System.out.println("BYE");
            System.out.println("k-->"+k);
            System.out.println(x*k);
            String str=k>= y?"Saturday":"Sunday";
            System.out.println(str);
            System.out.println("$$$$$$$$$$$");
        }
    }
}