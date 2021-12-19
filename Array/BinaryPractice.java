package Array;

import java.util.Arrays;

public class BinaryPractice {
    public static void main(String[] args) {
        int[] numbers ={4,6,10,23,1,12};
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));               //[1, 4, 6, 10, 12, 23]
        System.out.println(Arrays.binarySearch(numbers,23));    //5
        System.out.println(Arrays.binarySearch(numbers,1));     //0
        System.out.println(Arrays.binarySearch(numbers,50));    //-7
        System.out.println(Arrays.binarySearch(numbers,3));     //-2

    }
}
