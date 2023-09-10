package tenSort;

import java.util.Arrays;

public class QuickSort {
    public static int[] sort(int[] arr) {
        int length = arr.length;
        int[] as = Arrays.copyOf(arr, length);
        return quickSort(as, 0, length - 1);
    }

    private static int[] quickSort(int[] as, int left, int right) {
        if (left < right) {
            int pivot = partition(as, left, right);
            quickSort(as, left, pivot - 1);
            quickSort(as, pivot + 1, right);
        }
        return as;
    }
    private static int partition(int[]as,int left,int right) {

        int temp=as[left];
        while (left < right) {
            while (as[right] >=temp &&left<right) {
                right--;
            }
            as[left]=as[right];

            while(as[left]<=temp &&left<right){
                left++;
            }
            as[right]=as[left];

        }
        as[left]=temp;
        return left;

    }
}
