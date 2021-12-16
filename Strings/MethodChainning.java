package Strings;

import java.util.Locale;

public class MethodChainning {
    public static void main(String[] args) {
        String name="       David   ";

        String n=name.substring(5).substring(2).toUpperCase().replace("A","xxxx")
                .toUpperCase(Locale.ROOT).trim();
        char x=name.substring(5).substring(2).toUpperCase().replace("A","xxxx")
                .toUpperCase(Locale.ROOT).trim().charAt(1);
        System.out.println(n);
        System.out.println(x);

        int a=5;

    }
}
