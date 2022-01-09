package set;

import java.util.*;

public class UniquePractice1 {
    public static void main(String[] args) {

        String[] letters ={"a","b","c","d","d"};

        // store these elements in to a set
        Set<String> sets = new HashSet<>(Arrays.asList(letters));
        System.out.println(sets);

        // convert array to ArrayList >> ArrayList to Set

        List listOfLetters1=new ArrayList((Arrays.asList(letters)));
        listOfLetters1.add("e");
        System.out.println(listOfLetters1);

        List listofLetter = Arrays.asList(letters);
        //listofLetter.add("t");    //exception
        System.out.println(listofLetter);
        TreeSet setOfLetters=new TreeSet(listofLetter);
        setOfLetters.add("x");      // it works
        System.out.println(setOfLetters);


        HashSet set =new HashSet(Arrays.asList(letters));
        String[] letters1 ={"a","a","b","c","d","d","t","t","a"};

        //show/print duplicate elements
        HashSet <String> hashSet=new HashSet<>();
        ArrayList duplicateStorage= new ArrayList();


        for (String letter:letters1){
            if(!hashSet.add(letter)){
                System.out.println("This is repeating element "+ letter);
            duplicateStorage.add(letter);
            }
        }
        System.out.println("ssss "+hashSet);
        System.out.println(duplicateStorage);

    }
}
