package array;

import java.util.Arrays;

public class ArrayMultiplicationTable {
    public static void main(String[] args) {


    int[][]multiplicationTable = new int[10][10];

        for(int i=1; i<multiplicationTable.length; i++){
        for(int j=1; j<multiplicationTable.length; j++){
            multiplicationTable[i][j] = i*j;
        }
    }

        for(int i=1; i<multiplicationTable.length; i++){
        for(int j=1; j<multiplicationTable.length; j++){
            System.out.print(multiplicationTable[i][j]+"\t");
        }
        System.out.println();
    }
        System.out.println(Arrays.deepToString(multiplicationTable));//shows all element two dimension type? i am confused here
                                                                     // what if i use 3 dimension and show 3 dimension,
                                                                     // how can understand people for 3 and more dimension?
    int[] intArr = new int[10];
    String[] stringArr = new String[10];
        System.out.println("\n\n");
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(stringArr));
}}
