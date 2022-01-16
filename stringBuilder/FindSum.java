package stringBuilder;

public class FindSum {
    public static void main(String[] args) {
        /*
        create a method find sum of digits from a StringBuilder parameter
        StringBuilder -> numbers= "tsur4o_9_i_2"
         */
        StringBuilder sumOf=new StringBuilder("tsur4o_9_i_2");
        System.out.println(findSum(sumOf));
        sum(sumOf);
    }
    public static int findSum(StringBuilder ss){
        int sum=0;
        for (int i=0;i<ss.length();i++){
            if(Character.isDigit(ss.charAt(i))){
                sum +=Character.getNumericValue(ss.charAt(i));
            }
        }
        return sum;
    }
    public static void sum (StringBuilder num){
        int total = 0;
        for(int i=0; i<num.length(); i++){
            if(Character.isDigit(num.charAt(i))){
                total+=Integer.parseInt("" +(num.charAt(i)));
            }
        }
        System.out.println(total);
    }
}
