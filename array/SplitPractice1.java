package array;

import java.util.Arrays;

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
//==============================================================================
        //print out every single word as: .....***
        String[] words1 = str.split(" ");
        for (String x : words1) {
            System.out.println(x.concat("***"));
        }
//==============================================================================
        System.out.println("=================");
        System.out.println("\"x\"" + "              use \" here in the sout");
        System.out.println("=================");
//==============================================================================
        String[] words2 = str.split("a");
        System.out.println(Arrays.toString(words2));
//==============================================================================
        String[] words3 = str.split("a", 2);// have 2 elements right now
        System.out.println(Arrays.toString(words3));
//==============================================================================
        String[] words4 = str.split("af");       // we have just one af 2 element in array
        System.out.println(Arrays.toString(words4));
//==============================================================================
        System.out.println("======================================");
        //12/17/2021
        //12.17.2021
        //12-17-2021
        //12_17_2021
        String date = "12/17/2021";
        String[] dates = date.split("/");

        for (String as : dates) {
            if (as == dates[dates.length - 1]) {
                System.out.print(as);
            } else
                System.out.print(as + ".");
        }
        date = "12.17.2021";
        String[] dates2=date.split("\\."); // here you use \\ because if you use just . its not understand us
        System.out.println("This is for dot exapmple");


        System.out.println("\"something\"");
        for (String d:dates2){
            System.out.println("\""+d+"\"");
        }

    }
}
