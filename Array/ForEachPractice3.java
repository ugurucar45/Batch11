package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ForEachPractice3 {
    public static void main(String[] args) {
        String[] names={"James","Brian","Easy","Nina","David"};
        //create e-mail address for each of the names in the array
        //john@gmail.com, mark@gmail.com, .............
        for(String a:names){
            System.out.println(a.toLowerCase()+"@gmail.com");
            System.out.println(a.toUpperCase().concat("@yahoo.com"));
        }
        Scanner sc= new Scanner(System.in);
        String[] mails=new String[names.length];
        String answer="";
        int z=0;
        for(String a:names){
//            System.out.println("Are you "+a+" y/n");
//            answer= sc.nextLine();
//            if(answer.equals("y")||answer.equals("Y")){
                System.out.println(a+" Please enter your email adress");
                mails[z]= sc.nextLine();
                        z++;
//            }else{
//                System.out.println("You are not "+a);
//                z++;
//            }
        }
        String[] gmails=new String[names.length];
        String[] yahoo=new String[names.length];
        int i=0,j=0;
        for(String s:mails){
            if(s.substring(s.indexOf("@")+1).contains("gmail.com")){
                gmails[i]=s;
                i++;
            }else if(s.substring(s.indexOf("@")+1).contains("yahoo.com")){
                yahoo[j]=s;
                j++;
        }}
        System.out.println(Arrays.toString(mails));
            System.out.println("gmails---> "+Arrays.toString(gmails));
            System.out.println("yahoos---> "+Arrays.toString(yahoo));
     //=======================================Efe do it this one
        String gma[]=new String[names.length];
        String yah[]=new String[names.length];
        for(int l=0;l< names.length ;l++) {
            gma[l]=names[l]+"@gmail.com";
            yah[l]=names[l]+"yahoo.com";
        }
        System.out.println("Efe's code ======================");
        System.out.println(Arrays.toString(gma));
        System.out.println(Arrays.toString(yah));
    }
}
