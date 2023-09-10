package tenSort;

import java.util.Arrays;

public class InsertSort {
    public static int[] sort(int[]arr){
        int length=arr.length;
        int[]as= Arrays.copyOf(arr,length);
        for (int i = 1; i <length ; i++) {
            int temp=as[i];
            int j=i-1;
            while(j>=0&&as[j]>temp){
                as[j+1]=as[j];
                j--;
            }
            as[j+1]=temp;
        }
        return as;
    }
}
