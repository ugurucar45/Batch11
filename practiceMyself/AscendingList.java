package practiceMyself;

import java.util.Arrays;

public class AscendingList {
    public static void main(String[] args) {
        int[] ss = {2, 3, 4, 4, 7, 2, 1};
        int[] ss1 = {42, 42, 24, 24};
        AscendingList aa=new AscendingList();
        System.out.println(Arrays.toString(ascending(ss)));
        System.out.println(Arrays.toString(ascending(ss1)));
    }
    public  static int[] ascending(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i] != 984598454) {
                    arr[j] = 984598454;
                    count++;
                }
            }
        }
        Arrays.sort(arr);
        int[] a = new int[arr.length - count];
        for (int j = 0, k = 0; j < arr.length; j++) {
            if (arr[k] != 984598454&& arr[k]!=0) {
                a[j] = arr[k];
                k++;
            } else {
                k++;
            }
        }
        Arrays.sort(a);
        return a;
    }
}
