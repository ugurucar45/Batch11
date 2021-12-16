package Array;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        /*
        Array
        =size is fixed(static)
        =type of the data has to be same
        =default values/null,0,false

        *object[] array={1,"test", true}
            int[] arr ={1,2,3,4,5};
            String[] arr1={"same","data","type"}'

            arr[0]=7;
            _________
            int[] nums=new int[3];
            nums[0]=11;
            nums[1]=;
            nums[2]=;
            Array.toString(arr);    ----->    [same,data,type]
```
         */
        int[] studentIds= new int[5];//this is capacity


        studentIds[0]=21;//this is attachment first index=21
        studentIds[1]=31;//second index number=31
        studentIds[2]=41;
//        studentIds[3]=51;
//        studentIds[4]=61;
//        System.out.println(studentIds);//[I@2ac1fdc4
        System.out.println(studentIds[0]);//21
        System.out.println(studentIds[1]);//31
        System.out.println(studentIds[2]);//41
        System.out.println(studentIds[3]);//0
        System.out.println(studentIds[4]);//0
        studentIds[1]=99;
        System.out.println(studentIds[1]);//99
            //studentIds[5]=51;         //Exception         Index 5 out of bonds for length


        System.out.println(studentIds.length);//it shows total size of array
        System.out.println(Arrays.toString(studentIds));
//============COPY FROM ALEX========= I MISSED SOME PARTS AFTER CHECK IT===============================================
        studentIds[0] =21;
        studentIds[1] = 31;
        studentIds[2] = 41;
        //  studentIds[3] = 51;
        //  studentIds[4] = 61;
        System.out.println(studentIds);//[I@29453f44 --> hash code , showing memory location of your data(array).(reference of object
        System.out.println(studentIds[0]);//21
        System.out.println(studentIds[1]);//31
        System.out.println(studentIds[2]);//41
        System.out.println(studentIds[3]);//0
        System.out.println(studentIds[4]);//0
        // System.out.println(studentIds[5]);//exeption
        studentIds[1] = 99;//reassign.
        System.out.println( studentIds[1]);//99
        // studentIds[5] = 51;//index 5 out of bounds for length 5.
        //  System.out.println(studentIds[5]);//exception
        System.out.println("========");
        for(int i =0; i<studentIds.length; i++){
            System.out.println(studentIds[i]);
        }
        System.out.println("********");
        System.out.println(Arrays.toString(studentIds));//it will print out all elements as array from array --> [21, 99, 41, 0, 0]

        Arrays.sort(studentIds);













    }
}
