package tenSort;

import java.util.Arrays;

public class MergeSort {
    public static int[] sort(int[] arr){
        int length=arr.length;
        if(length<2){
            return arr;
        }
        else{
            int middle=length/2;
            int[] left=Arrays.copyOfRange(arr,0,middle);
            int[] right=Arrays.copyOfRange(arr,middle,length);
            return mergeSort(sort(left),sort(right));
        }
    }
    public static int[] mergeSort(int[]left,int[]right){
        int[] result=new int[left.length+right.length];
        int lf=0;
        int rg=0;
        int i=0;
        while(lf<left.length&&rg<right.length){
            if(left[lf]<right[rg]){
                result[i++]=left[lf++];
            }else{
                result[i++]=right[rg++];
            }
        }
        while(lf<left.length){
            result[i++]=left[lf++];
        }
        while(rg<right.length){
            result[i++]=right[rg++];
        }
        return  result;
    }

}
