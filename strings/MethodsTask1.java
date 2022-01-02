package strings;

import java.util.Scanner;

public class MethodsTask1 {
    public static void main(String[] args) {

        //Task
        //by using scanner ask user to provide his/her gender, full name and birth year in the following format
        // F- Jenny Brown- 1999
        // -check if the string starts with F
        //-check if the string ends with M
        //-check if the string contains your name
        //-check if the string ending with birth year of 2000
        //-replace '-' with '/'

        Scanner scan = new Scanner(System.in);
        System.out.println(" Please provide your gender, full name and birth year in the following format" +
                " F- Jenny Brown- 1999");
        String info= scan.nextLine();
        System.out.println(info.startsWith("F"));
        System.out.println(info.endsWith("M"));
        System.out.println(info.contains("Efe"));
        System.out.println(info.endsWith("2000"));
        System.out.println(info.replace("-","/"));

    }
}
