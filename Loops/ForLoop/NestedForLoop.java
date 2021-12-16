package Loops.ForLoop;

public class NestedForLoop {
    public static void main(String[] args) {
        /*
        if(1){                      for(;;){
            if(2){                      for(;;){
                if(3){                      for(;;){
                code                        code
                }}}                         }}}

                you use many for loop in the for loop (inception?)
         */
        for(int a=0;a<=3;a++){                     //0
            System.out.println(a);                 //0 1 2 3 4 5
            for(int b=0;b<=5;b++){                 //1
                System.out.print(b+" ");           //0 1 2 3 4 5
            }                                      //2
            System.out.println("");                //0 1 2 3 4 5
        }                                          //3
                                                   //0 1 2 3 4 5


    }
}
