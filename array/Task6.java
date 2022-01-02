package array;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        String[] strArr={"white","black","red","pink","orange"};
        //sout every element in reverse order from the given array
//        String[] str2=new String[str.length];
        int c=0;
//        for(String a:str){
//            str1="";
//            for (int b=a.length()-1;b>=0;b--){
//                str1+=a.substring(b,b+1);
//            }
//            str2[c]=str1;
//            c++;
//        }
        for (int i =0; i< strArr.length; i++){
            strArr[i] = new StringBuilder(strArr[i]).reverse().toString();
        }
        System.out.println(Arrays.toString(strArr));
    }
}




