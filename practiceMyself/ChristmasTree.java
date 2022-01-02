package practiceMyself;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        String str="",star="*",space="",one="*";
        Scanner sc=new Scanner(System.in);
        System.out.println("How many line if you want");
        int input= sc.nextInt();
        for(int b=0;b<=input;b++){
            space=space.concat(" ");
        }
        for(int a=0;a<input;a++){
            if(a==0){
                System.out.println(space+star);
            }
            space=space.substring(1,space.length());
            str=str.concat(one);
            star=star.concat(one);
            System.out.println(space+star+str);
        }
    }
}
