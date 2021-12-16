package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
-ask user, how many names that s/he wants to store in array
-store those names by getting it from user in to array that is called 'names'
-print them out by using ->Arrays.toString(); method
         */
        Scanner sc = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.println("How many names want to store");
        int number = sc.nextInt();
        String[] names = new String[number];
        int count = 0;
        for (int a = 0; a < names.length; a++) {
            System.out.println("input index of " + a);
            names[a] = str.nextLine();
            if (names[a].length() >= 5) {
                count++;
            }
        }
        int i = 0, j = 0;
        String[] shortNames = new String[count];
        String[] longNames = new String[number-count];
        for (int a = 0; a < names.length; a++) {
            if (names[a].length() > 4) {
                longNames[i] = names[a];
                i++;
            } else if(names[a].length() < 5){
                shortNames[j] = names[a];
                j++;
            }

        }
        //System.out.println(Arrays.toString(names));
        System.out.println("Short names is " + Arrays.toString(shortNames));
        System.out.println("Long names is " + Arrays.toString(longNames));
    }
}
