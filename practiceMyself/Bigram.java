package practiceMyself;

import java.util.ArrayList;
import java.util.HashMap;

public class Bigram<hashMap> {
    public static void main(String[] args) {
        String ss = "The quick brown fox and the quick blue hare The quick The quick";
//        Bigram s=new Bigram();
//        s.bigram(a);
        Bigram s = new Bigram();
        System.out.println(s.bigram(ss));

    }

    public HashMap bigram(String ss) {
        HashMap<String, Integer> map = new HashMap();
        ArrayList<String> map1 = new ArrayList();
        ss = ss.toLowerCase();
        ss = " " + ss+" ";
        for (int a = 0; a < ss.length(); a++) {
            if (ss.charAt(a) == ' ') {
                for (int i = a + 1; i < ss.length(); i++) {
                    if (ss.charAt(i) == ' ') {
                        for (int j = i + 1; j < ss.length(); j++) {
                            if (ss.charAt(j) == ' ') {
                                map1.add(ss.substring(a + 1, j));
                                i = ss.length() - 1;
                                j = ss.length() - 1;
                            }
                        }
                    }
                }
            }
        }
        ArrayList<String> map2 = new ArrayList();
        map2.addAll(map1);
        for (int in = 0; in < map2.size(); in++) {
            for (int de = in + 1; de < map2.size(); de++) {
                if (map2.get(in).equals(map2.get(de))) {
                    map2.remove(de);
                }
            }
        }

        for (int i = 0,a=0; i < map2.size(); i++) {
            for (int k = 0; k < map1.size(); k++) {
                if (map2.get(i).equals(map1.get(k))) {
                    a++;
                }
            }
            map.put(map2.get(i), a);
            a = 0;
        }
        return (HashMap) map;
    }
}
