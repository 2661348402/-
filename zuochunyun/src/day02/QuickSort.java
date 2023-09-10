package day02;

public class QuickSort {
    public static void quickSort(int[]arr,int left,int right){
        if(left>=right)
            return;
       int index=partition(arr,left,right);
       quickSort(arr,left,index-1);
       quickSort(arr,index+1,right);

    }
    public static int  partition(int[]arr,int left,int right){
        int pivot=left;
        int  index=left+1;
       while(index<=right){
           if(arr[index]<arr[pivot]){
               swap(arr,index,(++left));
           }
           index++;
       }
       swap(arr,pivot,left);
       return left;
    }
    public static void swap(int[]arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}
