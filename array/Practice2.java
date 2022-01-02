package array;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[]numbers={4,3,6,7,11,45};
        System.out.println(numbers[3]);//7
        //numbers[6]=66;// ArrayIndexOutOfBoundsException

        System.out.println(numbers[1]);//3
        numbers[1]=66;
        System.out.println(numbers[1]);//66
        System.out.println(numbers.length);//length of the array
        System.out.println(Arrays.toString(numbers));// Shows All of the numbers in array
        for(int m=0;m<numbers.length;m++){
            System.out.println(" index of "+m+" is "+numbers[m]);
        }

    }
}
