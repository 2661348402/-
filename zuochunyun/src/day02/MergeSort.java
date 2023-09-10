package day02;
//并归排序
//1:排序练习
//2:求一个数组的小和问题
public class MergeSort {
     public static int sum;
   public static  void sort(int[]arr,int left,int right){
       if(left==right)
           return;
       int mid=left+((right-left)>>1);
       sort(arr,left,mid);
       sort(arr,mid+1,right);
       merge(arr,left,mid,right);
   }
   public static void merge(int[] arr,int left,int mid,int right){
       int[] temps=new int[right-left+1];
       int L=left;
       int R=mid+1;
       int index=0;
       while(L<=mid&&R<=right){
           if(arr[L]<arr[R]){
               sum+=(right-R+1)*arr[L];
               temps[index++]=arr[L++];
           }else{
               temps[index++]=arr[R++];
           }
       }
       while(L<=mid){
           temps[index++]=arr[L++];
       }
       while(R<=right){
           temps[index++]=arr[R++];
       }
       for (int i =0; i <temps.length; i++) {
           arr[left++]=temps[i];
       }
   }

}
