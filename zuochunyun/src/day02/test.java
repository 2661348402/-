package day02;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random random=new Random(101);
        int[] arr=new int[15];
        for (int i = 0; i <15; i++) {
            arr[i]=random.nextInt(100);
        }
        printArray(arr);
       // QuickSort.quickSort(arr,0,arr.length-1);
        //CountingSort.countingSort(arr);
       // RadixSort.radixSort(arr,0,arr.length-1);
        System.out.println();
       printArray(arr);

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
