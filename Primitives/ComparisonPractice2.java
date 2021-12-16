package Primitives;

public class ComparisonPractice2 {
    public static void main(String[] args) {

        //there is an event for kids if a child's height is 48" or more they can attend this event
        // print out the result if kid can attned or not
        int reqHeight =48,kidHeight=52;
        boolean result=kidHeight>=reqHeight;
        System.out.println("Can kid join this event ---> "+result);

        //if the age of child 6 or less it will be free
        int reqAges=6;
        int kidAges=9;
        boolean freeTicket=kidAges<=reqAges;
        System.out.println("is the event free? ---> "+freeTicket );
    }
}
