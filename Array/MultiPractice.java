package Array;

import java.util.Arrays;

public class MultiPractice {
    public static void main(String[] args) {
        /*
        ================Multi Dimentional Arrays=====================
        int[] zipCodes=new int[5];      //regular array
        int[] zipCodes1={1,2,3,4,5};    //regular array
        =============================================================
        int [][] numbers = new int[2][3];  // left array capacity must be bigger than right array
                                           // i take ss in ders folder

                            new int[a][b]   a is satir
                                            b is sutun

         */
        int[][] numbers = new int[2][3];
        System.out.println(numbers);                    // hashcode 1 all of numbers
        System.out.println(Arrays.toString(numbers));   // hashcode's 2 elements in the array 2 objects

        System.out.println(numbers[0][0]);              //first arrays first element
        System.out.println(numbers[0][1]);              //0 first arrays second element
        numbers[0][0] = 22;
        numbers[0][1] = 33;
        numbers[0][2] = 44;
        numbers[1][0] = 55;
        //numbers[1][1] = 66;
        numbers[1][2] = 77;
        System.out.println(numbers[1][1]);              //66

        //numbers[0][3]=88;                             //Exception
        //System.out.println(numbers[0][3]);            //Exception
        System.out.println(numbers[1][2]);              //i blocked attachment shows default

        System.out.println(Arrays.deepToString(numbers));//Show all elements


        for (int i = 0; i < numbers.length; i++) {              //take all elements seperately
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }
        for (int i = 0; i < numbers.length; i++) {              //take groups
            System.out.println(Arrays.toString(numbers[i]));
        }
        System.out.println("===================================================================================");
        //[[22, 33, 44], [55, 0, 77]]                           //for each take all elements

        for (int[] numsArr : numbers) {
            for (int num : numsArr) {
                System.out.println(num);
            }

        }
    }
}