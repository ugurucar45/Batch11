package Array;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String[] names = new String[6];
        System.out.println(Arrays.toString(names));//[null, null, null, null, null, null]
        names[5]="Alex";
        names[4]="Dinara";
        names[2]="Ana";
        names[0]="Mary";
        System.out.println(Arrays.toString(names));//[Mary, null, Ana, null, Dinara, Alex]

        //show all values from the 'names' array one by one
for(int a=0;names.length>a;a++){
    System.out.println(names[a]);
}
    }
}
