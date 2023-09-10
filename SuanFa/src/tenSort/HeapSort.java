package tenSort;

import java.util.Arrays;

public class HeapSort {
    public  static int[] sort(int[] arr){
        int length=arr.length;
        int[] as= Arrays.copyOf(arr,length);
        buildMaxHeap(as,length);
        for(int i=length-1;i>=0;i--){
            swap(as,0,i);
            heapAdjust(as,0,i);
        }
        return as;
    }
    private static void buildMaxHeap(int[]as,int length){
        for(int j=length/2;j>=0;j--){
            heapAdjust(as,j,length);
        }

    }
    private  static void heapAdjust(int[]as,int i,int length){
        int left=2*i+1;
        int right=2*i+2;
        int largest=i;
        if(left<length&&as[largest]<as[left]){
            largest=left;
        }
        if(right<length&&as[largest]<as[right]){
            largest=right;
        }
        if(largest!=i){
            swap(as,i,largest);
            heapAdjust(as,largest,length);
        }
    }
    private  static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
