package practiceMyself;

import java.util.Scanner;

public class sss {
    public static boolean isValidPhone(String pho) {

        if (pho.length() == 12 && pho.substring(0, 1).equals("7") || pho.substring(0, 1).equals("8") ||
                pho.substring(0, 1).equals("9") && pho.substring(3, 4).equals("-") && pho.substring(7, 8).equals("-") &&
                        Character.isDigit(pho.charAt(1)) && Character.isDigit(pho.charAt(2)) &&
                        Character.isDigit(pho.charAt(4)) && Character.isDigit(pho.charAt(5)) &&
                        Character.isDigit(pho.charAt(6)) && Character.isDigit(pho.charAt(8)) &&
                        Character.isDigit(pho.charAt(9)) && Character.isDigit(pho.charAt(10)) &&
                        Character.isDigit(pho.charAt(11))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
        String pho = sc.next();
        System.out.println(isValidPhone(pho));}while(true);
    }
}
