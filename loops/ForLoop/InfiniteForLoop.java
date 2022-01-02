package loops.ForLoop;

public class InfiniteForLoop {
    public static void main(String[] args) {
        for(int k=0;k<5;k++){
            System.out.println("David");

    }
        // infinite loop
        int x=0;
        for(;;x++){
            System.out.println("Zack");

        //    System.out.println(x);//infinite loop , goes forever
        }
        //System.out.println(x); //this statement will not be reached out since there is infinite loop before it
    }
}
