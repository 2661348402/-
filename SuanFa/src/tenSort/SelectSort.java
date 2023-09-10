package tenSort;

import java.util.Arrays;

public class SelectSort {
    public static int[] sort(int []arr){
        int length=arr.length;
        int[] arrSorted= Arrays.copyOf(arr,length);
        for (int i = 0; i <length-1 ; i++) {
            for(int j=i+1;j<length;j++){
                int temp=arrSorted[i];
                if(arrSorted[j]<temp){
                    arrSorted[i]=arrSorted[j];
                    arrSorted[j]=temp;
                }
            }
        }
        return arrSorted;
    }
}
