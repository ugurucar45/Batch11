package SwitchStatement;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        /*
        1- IT dept
            David,Time
        2- Admin
            Alex,Jessi
        3- Customer
            Zack, Ana, John
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Techtorial! Which departmant do you want to connect? " +
                "\n 1- IT Department\n 2- Admin\n 3- Customer Care");
        int department = sc.nextInt();
        int hour = LocalDateTime.now().getHour();// get time
        switch (department) {
            case 1:
                System.out.println("Which one you want to talk David/Tima");
                sc = new Scanner(System.in);
                String itdep = sc.nextLine().toLowerCase();
                switch (itdep) {
                    case "david":
                        // want to differ moning and afternoon hours
                        if (hour > 7 && hour < 12) {
                            System.out.println("Good Morning You Speak With " + itdep);
                        } else if (hour >= 12 && hour < 18) {
                            System.out.println("Good Afternoon You Speak With " + itdep);
                        } else
                            System.out.println(itdep + " dont work right now");
                        break;
                    case "tima":
                        if (hour > 7 && hour < 12) {
                            System.out.println("Good Morning You Speak With " + itdep);
                        } else if (hour >= 12 && hour < 18) {
                            System.out.println("Good Afternoon You Speak With " + itdep);
                        } else
                            System.out.println(itdep + " dont work right now");
                        break;
                    default:
                        System.out.println("We dont have" + itdep);
                        break;
                }
                break;
            case 2:
                System.out.println("Which one you want to talk Alex/Jessi");
                sc = new Scanner(System.in);
                String admindep = sc.nextLine().toLowerCase();
                switch (admindep) {
                    case "alex":
                        //if want to alex only work after noon we add one
                        // more switch here
                        if (hour > 7 && hour < 12) {
                            System.out.println("Good Morning You Speak With " + admindep);
                        } else if (hour >= 12 && hour < 18) {
                            System.out.println("Good Afternoon You Speak With " + admindep);
                        } else
                            System.out.println(admindep + " dont work right now");
                        break;
                    case "jessi":
                        if (hour > 7 && hour < 12) {
                            System.out.println("Good Morning You Speak With " + admindep);
                        } else if (hour >= 12 && hour < 18) {
                            System.out.println("Good Afternoon You Speak With " + admindep);
                        } else
                            System.out.println(admindep + " dont work right now");
                        break;
                    default:
                        System.out.println("We dont have" + admindep);
                        break;
                }
                break;
            case 3:
                System.out.println("Which one you want to talk Zack/Ana/John");
                sc = new Scanner(System.in);
                String cusdep = sc.nextLine().toLowerCase(Locale.ROOT);
                switch (cusdep) {
                    case "zack":
                        if (hour > 7 && hour < 12) {
                            System.out.println("Good Morning You Speak With " + cusdep);
                        } else if (hour >= 12 && hour < 18) {
                            System.out.println("Good Afternoon You Speak With " + cusdep);
                        } else
                            System.out.println(cusdep + " dont work right now");
                        break;
                    case "ana":
                        if (hour > 7 && hour < 12) {
                            System.out.println("Good Morning You Speak With " + cusdep);
                        } else if (hour >= 12 && hour < 18) {
                            System.out.println("Good Afternoon You Speak With " + cusdep);
                        } else
                            System.out.println(cusdep + " dont work right now");
                        break;
                    case "john":
                        if (hour > 7 && hour < 12) {
                            System.out.println("Good Morning You Speak With " + cusdep);
                        } else if (hour >= 12 && hour < 18) {
                            System.out.println("Good Afternoon You Speak With " + cusdep);
                        } else
                            System.out.println(cusdep + " dont work right now");
                        break;
                    default:
                        System.out.println("We dont have" + cusdep);
                        break;
                }
                break;
            default:
                System.out.println("We dont have this dep");
                break;
        }
    }
}
