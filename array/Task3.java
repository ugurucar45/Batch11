package array;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        //print out numbers that are greater than 10

        int[] arr = {4, 24, 10, 100, 5, 78, 11, 25, 55};
        //Arrays.sort(arr);
        int count = 0;
        for (int b = 0; b < arr.length; b++) {
            if (arr[b] > 10) {
                count++;
            }
        }
        int[] largeNum = new int[arr.length];
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] > 10) {
                System.out.print(arr[a] + ", ");

                largeNum[a] = arr[a];

            }
        }
        System.out.println("\n"+Arrays.toString(largeNum));
        Arrays.sort(largeNum);
        System.out.println(Arrays.toString(largeNum));

    }
}
