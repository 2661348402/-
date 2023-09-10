package day02;
//1：给定一个数组和一个num，请把小于等于num的数放在数组的左边，大于num的数放在数组的右边。
//要求空间复杂度O（1），时间复杂度O（N）
//2:进阶:小于num的放左边，等于的放中间，大于的放右边；
public class DutchNationalFlagProblem {
    public static void main(String[] args) {
        int[]arr={40,33,90,93,54,30,65,79,33,33,33,82,6,14,12,33,99,6,18};
        printArray(arr);
        method1(arr,33);
        System.out.println();
        printArray(arr);
    }
    public static void method1(int[]arr,int num){
        int index=0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]<=num){
                swap(arr,index++,i);
            }
        }
    }
    //双指针
    public static void method2(int[]arr,int num){
        int left=0;
        int right=arr.length-1;
        int index=0;
        while(index<right){
            if(arr[index]<num){
                swap(arr,index++,left++);
            }else if(arr[index]>num){
                swap(arr,index,right--);
            }else{
                index++;
            }
        }
    }
    public static void swap(int[]arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
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
