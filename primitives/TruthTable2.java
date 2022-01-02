package primitives;

public class TruthTable2 {
    public static void main(String[] args) {
        //there is an event for kids
        //if the age of child is 6 or less or if the height of child is 48 inc or less
        // the event is free for that child

        int reqHeight =48,kidHeight=52;
        boolean result=kidHeight>=reqHeight;

        int reqAges=6;
        int kidAges=9;
        boolean freeTicket=kidAges<=reqAges;

        System.out.println("Is event free ---> "+(freeTicket||result));

        // find out if student can pass a class
        // there are 3 test taken
        // average of those test has to be more than 70
        // attendance rate of the student has to be %80 or more

        int test1=60;
        int test2=100;
        int test3=85;
        int averageTest=(test1+test2+test3)/3;
        int reqAverage=70;
        int reqAtten=80;
        int myAtten=80;
        boolean pass= averageTest>=reqAverage && myAtten>=reqAtten;
        System.out.println("Can i pass ----> "+pass);
    }
}
