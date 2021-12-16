package Array;

import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {
        int[] arr = {4, 24, 10, 100, 5, 78, 11, 25, 55};
        // find biggest number from given array
        int biggest = 0;
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] > biggest) {
                biggest = arr[a];
            }
        }
        System.out.println(biggest);
        //also
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]);  //biggest
        System.out.println(arr[0]);             //smallest


        int smallest = arr[0];
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] < smallest) {
                smallest = arr[a];
            }
        }
        System.out.println(smallest);

    }
}
