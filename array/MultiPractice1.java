package array;

import java.util.Arrays;

public class MultiPractice1 {
    public static void main(String[] args) {
        /*
        if you create multidimentional array by using 'new keyword, inner arrays will have same size
            ex= String[][] states=new String[5][7];

        if you create multi dimentional array by using curly brackets, size of the inner arrays can vary
            ex= String[][] states= {{"IL","OH"},{"CA","WA","OR","UT"},{"TX"}}
         */
        // states of different regions in US
        String[][] states= {{"IL","OH"},{"NY","FL","NC"},{"CA","WA","OR","UT"}};   //or this method ===> new String[3][4];
        for (String[] location:states){
            for(String state:location){
                System.out.println(state);
            }
        }
        System.out.println(Arrays.deepToString(states));
    }
}
