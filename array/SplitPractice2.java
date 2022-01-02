package array;

import java.util.Arrays;

public class SplitPractice2 {
    public static void main(String[] args) {
        String str = "Hummingbirds split from their sister group, the swifts and treeswifts, around 42 million years ago. " +
                "The common ancestor of extant hummingbirds is estimated to have lived 22 million years ago in South " +
                "America. They are known as hummingbirds because of the humming sound created by their beating wings, " +
                "which flap at high frequencies audible to humans. They hover in mid-air at rapid wing-flapping rates, " +
                "which vary from around 12 beats per second in the largest species to around 80 per second in small " +
                "hummingbirds. Of those species that have been measured during flying in wind tunnels, their top speeds " +
                "exceed 15 m/s (54 km/h; 34 mph). During courtship, some male species dive from 30 metres (100 ft) of " +
                "height above a female at speeds around 23 m/s (83 km/h; 51 mph).[1][2]";
        //find the words that has even amount of letters
        String text = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)) || str.charAt(i) == ' ') {
                text += str.charAt(i);
            }
        }
        String[] word = text.split(" ");
        int i=0,j=0;
        for (int a = 0; a < word.length; a++) {
            if (word[a].equals("")) {
            } else {
                if (word[a].length() % 2 == 0) {
                  //  even[i] = word[a];
                    i++;
                } else if (word[a].length() % 2 == 1) {
                   // odd[j] = word[a];
                    j++;
                }
            }
        }
        String[] even = new String[i];
        String[] odd = new String[j];
        int z=0,x=0;
        for (int a = 0; a < word.length; a++) {
            if (word[a].equals("")) {
            } else {
                if (word[a].length() % 2 == 0) {
                    even[z] = word[a];
                    z++;
                } else if (word[a].length() % 2 == 1) {
                    odd[x] = word[a];
                    x++;
                }
            }
        }
        System.out.println(Arrays.toString(even));
        System.out.println("even words --> " + (even.length));
        System.out.println(Arrays.toString(odd));
        System.out.println("odd words --> " + (odd.length));
        System.out.println(word.length);
    }
}
