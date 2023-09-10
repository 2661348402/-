package day02;
//递归
/*
练习一：找一个数组中的最大值:{40,90,93,54,30,65,79,33,82,6,14,12,99,6,18}
 */
public class Recursion {
    public static void main(String[] args) {
        int[] arr={40,90,93,54,30,65,79,33,82,6,14,12,99,6,18};
        System.out.println(findMax(0,arr.length-1,arr));
    }
    public static int  findMax(int left,int right,int[]arr){
        if(left==right){
            return arr[left];
        }
        int mid=left+((right-left)>>1);
        return Math.max(findMax(left,mid,arr),findMax(mid+1,right,arr));
    }
}
