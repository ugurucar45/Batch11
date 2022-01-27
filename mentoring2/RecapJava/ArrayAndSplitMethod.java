package mentoring2.RecapJava;

import java.lang.invoke.StringConcatFactory;
import java.util.Arrays;

public class ArrayAndSplitMethod {

    /*
    POSSIBLE INTERVIEW QUESTION
    Some technical questions have array with the loops
    some of the technical questions have array with the split method

    ARRAY:
    1)Array is storage for PRIMITIVE AND OBJECTS
    **2)Array is a fixed size.
    3)Array has multidimensional form
    4)Array has a length to get the size
    *5)Array's elements cannot be manipulated.(there is no methods)
    6)int[] array=new int[5];
    int[] array1=new{1,2,3,5,6};

    */
    public static void main(String[] args) {
        String name = "Hello Java is so cool";
        //TASK:
        //reverse each of the words
        //output:olleH
        //avaJ
        //si
        //os
        //looc
        String[] array = name.split(" ");
        String temp = "";
        System.out.println(Arrays.toString(array));

        for (int a = 0; a < array.length; a++) {
            temp="";
            for (int i = array[a].length()-1; i >= 0; i--) {
                temp += array[a].charAt(i);
            }
            array[a] = temp;
        }
        System.out.println(Arrays.toString(array));


        StringBuilder sss=new StringBuilder("Hello Java is so cool");
        String[] array1=sss.reverse().toString().split(" ");
        System.out.println(Arrays.toString(array1));
        for (int a= array1.length-1;a>=0;a--){
            System.out.println(array1[a]);
        }


    }
}
