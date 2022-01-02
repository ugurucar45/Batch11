package practiceMyself;

public class Fibonacci {
    public static void main(String[] args) {

//	    for (int i=0; i<1000; i++) {
//            System.out.println("Ugur" + i);
//        }

        System.out.println("Fibonacci");
        int birinci = 1, ikinci = 1;
        while (ikinci < 1000) {
            System.out.println(ikinci);
            int temp = birinci;
            birinci = ikinci;
            ikinci = birinci + temp;

            //1,1,2,3
        }


    }
}
