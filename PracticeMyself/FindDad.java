package PracticeMyself;
import java.util.Scanner;

public class FindDad {
        public static void main(String[] args) {
            System.out.println("Enter a string value");
            Scanner sc=new Scanner(System.in);
            //String str=sc.nextLine();
            String str="yuieiieieiiedkkkdldee";
            int a=0;
            do{
                if(str.charAt(a)=='d'){
                    if(str.charAt(a+2)=='d'){
                        System.out.println("dad");
                    }
                }
                a++;
            }while(a<str.length());
    }
}
