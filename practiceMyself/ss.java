package practiceMyself;

import java.util.Arrays;

public class ss {

    public static void main(String[] args) {
        String name = "Hello Java is so cool";
        String rev = "";
        String[] name1 = name.split(" ");
        for (int i = name.length() - 1; i >= 0; i--) {
            name.split(" ");
            rev += name.charAt(i);
        }
        String[] array=rev.split(" ");
        for (int a= array.length-1;a>=0;a--){
            System.out.println(array[a]);
        }
    }

}
