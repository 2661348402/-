package day01;

public class InsertSort {
    public static void insertSort(int[]arr){
        for (int i = 1; i <arr.length; i++) {
            int j=i;
           while(j>0&&arr[j]<arr[j-1]){
               swap(arr,j,j-1);
               j--;
           }
        }
    }

    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
    }
}
