package Array;

public class Task5 {
    public static void main(String[] args) {
        //find missing number form sequence
        int[] numbers={4,5,7,8,9};
int sum=0,sum1=0;
        for (int a:numbers){
            sum+=a;
        }
        for(int i=4;i<10;i++){sum1+=i;}
        System.out.println(sum1+" expected");
        System.out.println(sum+" actual");
        System.out.println((sum1-sum)+" missing number ");




    }
}
