package practiceMyself;

import java.util.Arrays;

public class duplicates {
    public  static int[] duplicates(int[]arr,int[] arr2){

        int[] arra=new int[arr.length+arr2.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr[i]==arr2[j]){
                    arr2[j]=94598745;
                    arra[k]=arr[i];
                    k++;
                }
            }
        }
        int[] ret=new int[k];
        for(int a=0;a<ret.length;a++){
            ret[a]=arra[a];
        }
        if(k>0){
            return ret;}else{return null;}
    }
    public static void main(String[] args) {
        int [] arr = {1,1,1,1,1,1,1,1};
        int [] arr2 = {1,2,3,9,10,11,12};

        int[] arra=new int[arr.length+arr2.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr[i]==arr2[j]){
                    arr2[j]=94598745;
                    arra[k]=arr[i];
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(arra));
        int[] ret=new int[k];
        for(int a=0;a<ret.length;a++){
            ret[a]=arra[a];
        }
        System.out.println(Arrays.toString(ret));

int[] res=duplicates(new int[]{1, 2, 3, 45, 6, 6, 7, 9, 8}, new int[]{2, 3, 9, 10, 11, 12});
        System.out.println(Arrays.toString(res));
    }
}
