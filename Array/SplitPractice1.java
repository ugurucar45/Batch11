package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SplitPractice1 {
    public static void main(String[] args) {
//        String Method
//                split();    //it will seperate given string from desired char/index
//                            //return type of the split() methot is string array
//        String str= "Today is Saturday";
//
//        str.split(" ");//Today, is, Saturday
//        str.split("a");//Tod, y is S, turd, y
        String str = "Stay safe and Healthy";

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));//[Stay, safe, and, Healthy]

        //print out every single word as: .....***
        String[] words1 = str.split(" ");
        for (String x : words1) {
            System.out.print(x.concat("***"));
        }

    }
}
