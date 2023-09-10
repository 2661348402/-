package tenSort;

import java.util.Arrays;

public class BubbleSort {
    public static int[] sort(int[]arr){
        int length=arr.length;
        int[] arrSorted= Arrays.copyOf(arr, length);
        for(int i=0;i<length;i++){
            //添加判断
            boolean flag=true;
            for(int j=0;j<length-i-1;j++){
                if(arrSorted[j]>arrSorted[j+1]){
                    arrSorted[j]=arrSorted[j]^arrSorted[j+1];
                    arrSorted[j+1]=arrSorted[j]^arrSorted[j+1];
                    arrSorted[j]=arrSorted[j]^arrSorted[j+1];
                    flag=false;
                }
            }
            if(flag){
                break;
            }
        }
        return  arrSorted;
    }
}
