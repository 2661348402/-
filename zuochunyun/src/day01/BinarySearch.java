package day01;
//练习一：在一个有序数组中找一个数
//练习二：在一个有序数组中找到>=某个数最左侧的位置
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={6,6,12,12,18,33,33,33,54,65,79,82,90,93,99};
        System.out.println(test2(arr,18));
    }
    public static int test1(int[] arr,int num){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<num) {
                left = mid + 1;
            }else if(arr[mid]>num){
                right=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static int test2(int[] arr,int num){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(num>=arr[mid]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
}
