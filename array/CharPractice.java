package array;

import java.util.Arrays;

public class CharPractice {
    public static void main(String[] args) {
        //print out only digits from this array
        //store other than digits in a new array
        char[] chs = {'A', '4', '&', 'z', '3', 'u', '*', 55};
        char[] others = new char[chs.length ];
        char[] otherss=new char[chs.length];
        int count = 0,say=0;
        for (int a = 0; a < chs.length; a++) {
            if (chs[a] >= '0' && chs[a] <= '9') {
                System.out.print(chs[a] + ", ");
                count++;
            } else {
                others[a]=chs[a];
                otherss[say]=chs[a];
                say++;
            }
        }
        System.out.println();
        char[] other=new char[chs.length-count];
        for(int a=0 ;a< other.length;a++){
            other[a]=otherss[a];
        }
        System.out.println(Arrays.toString(others));
        System.out.println("without null"+Arrays.toString(other));


    }
}
