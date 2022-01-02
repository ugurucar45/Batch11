package object;

import java.util.Random;

public class NetFlix {
//    create NetFlix-Class:
//            `create following instance fields in the NetFlix-Class
//        -accountName, userName, monthlyData
//    `create a method that will update monthlyData for every usage
//    `make sure this method takes parameter for data usage, and userName
//    `run your code in a Test-Class
    String accountName;
    String userName;
    static double monthlyData=100;

    public static double createHour(){//
        Random random=new Random();
        return random.nextDouble();
    }
    public static void usage(int usedData){
        //userName=user;    //we use static method we dont call non static variables
        monthlyData-=usedData;
        System.out.println("you have left "+monthlyData+" GB of monthly data ");
    }


}
