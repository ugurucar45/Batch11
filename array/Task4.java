package array;

public class Task4 {
    public static void main(String[] args) {
        String str="Sayora";
        int[] arr = {4, 24, 10, 100, 5, 78, 11, 25, 55, str.length()};
        //find the sum of numbers which are less than 10 from given array
        int sum = 0;
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] < 10) {
                sum = sum + arr[a];
            }
        }
        System.out.println(sum);
    }
}
