package day03;

import java.util.Random;

/*
堆：用数组实现的完全二叉树结构
大根堆：每颗子树的最大值都在顶部的堆
小根堆：每颗子树的最小值在顶部的堆（java中的优先级队列默认就是小根堆：）
左孩子是2*i+1,右孩子是2*i+2,父是（i—1）/2;
 */
public class HeapSort {
   public static void main(String[] args) {
      Random random=new Random(101);
      int[] arr=new int[15];
      for (int i = 0; i <15; i++) {
         arr[i]=random.nextInt(100);
      }
      printArray(arr);
      heapSort(arr);
      System.out.println();
      printArray(arr);
   }
   public static void heapSort(int[]arr){
      int heapSize=arr.length;
      //用数组构造一个堆
      for (int i = 0; i <heapSize; i++) {
         heapInsert(arr,i);
      }
      //排序
      while(heapSize>1) {
         swap(arr, 0, --heapSize);
         heap(arr, 0, heapSize);
      }
   }
   //向上找
   public static void heapInsert(int[]arr,int index){
       while(arr[index]>arr[(index-1)/2]){
          swap(arr,index,(index-1)/2);
          index=(index-1)/2;
       }
   }
   //向下找
   public static void heap(int[]arr,int index,int heapSize){
      //左孩子的坐标
      int left=index*2+1;
     while(left<heapSize){
        //最大值孩子的坐标
        int largest=left+1<heapSize&&arr[left]<arr[left+1]?left+1:left;
        largest=arr[index]>arr[largest]?index:largest;
        if(largest==index){
           break;
        }
        swap(arr,index,largest);
        index=largest;
        left=index*2+1;
     }

   }
   public static void swap(int[]arr,int i,int j){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
   }
   public static void  printArray(int[]arr){
      System.out.print("{");
      int index=0;
      while(index<arr.length-1){
         System.out.print(arr[index++]+",");
      }
      System.out.print(arr[index]+"}");
   }
}
