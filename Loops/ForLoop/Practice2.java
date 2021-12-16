package Loops.ForLoop;

public class Practice2 {
    public static void main(String[] args) {
        //print out numbers between 0 to 5 decreasing by using for loop
        //5, 4, 3, ... 0
        for(int number=5 ; number>=0; --number){//int number=5  step 1
            System.out.println(number);         //number>0      step 2
        }                                       // curly brakes step 3
                                                //--number      step 4
                                                // again loop
        //find the sum of numbers between 1 to 5 by using loop
        //1+2+3+4 = 10
        int sum=0;
        for (int num=1/*,sum=0*/; num<5;num++){     // if i create sum in for paranthesis, we have a problem because out of for
            sum+=num;                               // this variables makes problem
            System.out.println("total >> "+sum);}
        System.out.println("Final total >> "+ sum);

}
}
