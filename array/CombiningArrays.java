package array;

import java.util.Arrays;

public class CombiningArrays {
    public static void main(String[] args) {
        int[] nums1 ={3,4,5,8,9};
        int[] nums2 ={6,7,8,9};
        int[] res=new int[nums1.length+nums2.length];
        for(int i=0; i<nums1.length; i++){
            res[i]=nums1[i];
        }
        for(int j= nums1.length,k=0; j<(nums1.length+ nums2.length); k++,j++){
            res[j]=nums2[k];

        }
        System.out.println(Arrays.toString(res));
    }
}
