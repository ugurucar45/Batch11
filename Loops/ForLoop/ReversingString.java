package Loops.ForLoop;

public class ReversingString {
    public static void main(String[] args) {
        // reverse given string
        String str="Lets do it";

        int a=str.length()-1;
        for (;a>-1;a--){
            System.out.print(str.charAt(a));
        }
    }
}
