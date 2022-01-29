package mentoring2.RecapJava.OOP;

public class Exceptions {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1)How do you handle the exceptions?
        I can handle the exceptions with try and catch blocks
    2)Can you use more than catch block
        Yes you can use more than one catch block
    3)What do you know about final, finally, finalize
        Final   : is a keyword to make the variable or methods unchangeable.
        Finally : is a block that comes after try and catch to show final executions(statement)
        Finalize(): is a method which works with garbage collector to make sure it is manually worked.(System.gc)
    4)Throw and Throws?



     */
    public static void main(String[] args) {
        System.out.println("Today is the last day of Java");
        try{
            String num="35c";
            int realnumbers=Integer.parseInt(num);
        }catch (IllegalArgumentException ex){
            System.out.println("There is an illegal argument exception");
        }catch (IndexOutOfBoundsException ex1){
            System.out.println("There is a index out of bound exception");
        }finally {
            System.out.println("Finally block");
        }

        String num="35c";
        int sum=0;
        for(int i=0;i<num.length()+2;i++){
            sum+=num.charAt(i);
        }
        System.out.println(sum);
    }
}
