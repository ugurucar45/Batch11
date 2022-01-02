package ifStatement;

import java.util.Scanner;

public class Hired {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Are you know java ys/no");
        String a= sc.nextLine();
        if(a.equalsIgnoreCase("yes")){
            System.out.println("Are you know selenium yes/no");
            String b=sc.nextLine();
            if (b.equalsIgnoreCase("yes")){
                System.out.println("Are you know api testing experience");
                String c=sc.nextLine();
                if(c.equalsIgnoreCase("yes")||c.equalsIgnoreCase("learn")){
                    System.out.println("Are you has sql knowledge");
                    String d=sc.nextLine();
                    if(d.equalsIgnoreCase("yes")) {
                        System.out.println("Congrats!! You are Hired");
                    }
            else if (b.equalsIgnoreCase("no")){
                System.out.println("Are you know api testing experience");
                String e=sc.nextLine();
                    if(e.equalsIgnoreCase("yes")) {
                        System.out.println("Are you has sql knowledge");
                        String f = sc.nextLine();
                        if (f.equalsIgnoreCase("yes")) {
                            System.out.println("Congrats!! You are Hired");
                        }
                    }else{
                        System.out.println("We call you later");}
                        }
                    }else{
                        System.out.println("We need someone who has sql knowledge");
                    }
                }else{
                    System.out.println("we need some who is familiar with selenium");
                }
            }else{
                System.out.println("we call you later");
            }
    }
}

