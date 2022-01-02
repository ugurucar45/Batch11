package array;

import java.util.Arrays;

public class SortPractice {
    public static void main(String[] args){
        int [] zipCode={61212,91213,11214,71215};
        System.out.println(Arrays.toString(zipCode));   //[61212,91213,11214,71215]

        Arrays.sort(zipCode);
        System.out.println(Arrays.toString(zipCode));   //[11214, 61212, 71215, 91213]

        String[] colors={"violet","pink","Red","white","black","red"};
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));    //[Red, black, pink, red, violet, white]
                                                        //R before the lowercases ascii table




    }
}
