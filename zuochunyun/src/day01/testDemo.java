package day01;
 import day02.MergeSort;

import java.util.Random;
public class testDemo {
    public static void main(String[] args) {
        Random random=new Random(101);
        int[] arr=new int[15];
        for (int i = 0; i <15; i++) {
           arr[i]=random.nextInt(100);
        }
        printArray(arr);
        //  BubbleSort.bubbleSort(arr);
        //  SelectSort.selectSort(arr);
        //InsertSort.insertSort(arr);
        System.out.println();
        System.out.println(sumMin(arr));
        MergeSort.sort(arr,0,arr.length-1);
        System.out.println(MergeSort.sum);
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
    //暴力求解最小和

    public static int sumMin(int[]arr){
        int sum=0;
        for (int i = 1; i <arr.length; i++) {
            for (int j =i-1; j>=0; j--) {
                if (arr[i]>arr[j]){
                    sum+=arr[j];
                }
            }
        }
        return sum;
    }
}
