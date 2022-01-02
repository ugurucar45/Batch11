package practiceMyself;

public class deneme {
    public static void main(String[] args) {
        // 12345
        // 54321
        long number = 12345593958398L;
        long reversed=0L;
//        int sum = 0, x = 1000000000;
//        for (int i = 0; i < 6; i++) {
//            c = a % 10;
//            a = a / 10;
//            for (int j=i+1; j > i; --j) {
//                x /= 10;
//            }
//            sum += c * (x);
//        }
        while(number >0){
            reversed *=10;
            long lastDigit= number%10;
            reversed += lastDigit;
            number = number / 10;
        }
        System.out.println(reversed);
    }
}
