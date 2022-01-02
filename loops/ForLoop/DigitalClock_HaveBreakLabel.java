package loops.ForLoop;

public class DigitalClock_HaveBreakLabel {
    public static void main(String[] args) {
        /*
        print hours and minutes for 12 hours of a day
        ex: 0:0     0:1.....0:50 1:0 1:1.......11:59
         */

        for (int hour = 0; hour < 24; hour++) {
            System.out.println("");
            if (hour < 13) {
                for (int min = 0; min < 60; min++) {
                    for (int sec = 0; sec < 60; sec++) {
                        System.out.print(hour + ":" + min + ":" + sec + " AM ");
                    }
                }
            } else {
                for (int min = 0; min < 60; min++) {
                    for (int sec = 0; sec < 60; sec++) {
                        System.out.print((hour - 12) + ":" + min + ":" + sec + " PM ");
                    }
                }
            }
        }



        //if in the loop input break; your code stop
        // if input break label this stop this loop, before for input label
        // if the input break inner;  before loop input inner

//        label:
//        for (int a=0 ;a<12;a++){
//            if (a>6){
//                break label;
//            }
//            System.out.println(a);
//        }
//        System.out.println("");
//
//        for (int hour = 0; hour < 13; hour++) {
//            System.out.println();
//
//            label:
//            for (int min = 0; min < 60; min++) {
//                if (min >= 3 && min <= 28) {
//                    continue;   // its skipping 10-11-12
//                }
//                if (min > 30) {
//                    break label;//not working second loop is skipping min is always 0
//                }
//                inner:
//                for (int sec = 0; sec < 60; sec++) {
//                    if (sec > 10) {
//                        break inner;//working but if touch 10 stopped and skipping
//                    }    System.out.print(hour + ":" + min + ":" + sec+"  ");
//
//                }
//            }
//        }






    }
}
