package primitives;

public class TruthTable1 {
    public static void main(String[] args) {
        // visa and ticket
        boolean visa=true,
                ticket=true;

        boolean myvisa=false,
                myticket=true;

        boolean canTravel= visa == myvisa&&ticket==myticket;
        //                  true==false&&true==true
        //                        false&&true ----> false
        System.out.println(canTravel);  //false

        //ask question
        boolean online=true,
                campus=true,
                student=true;

        boolean askQuestion=student==online||student==campus;
        System.out.println("Can I ask question? ---> "+askQuestion);

        //%90 or more attendance and score of 80 or more to pass this class
        int reqAttence=9,
            reqScore=80;
        int yourAttendance=100,
            yourScore=90;
        boolean pass =yourAttendance>=reqAttence&&yourScore>=reqScore;
        System.out.println("can i pass the course ------> "+pass);


    }
}
