package tenSort;

public class CountingSort {
    public static  int[] sort(int[]arr){
        int max=getMax(arr);
        return countingSort(arr,max);
    }
    private static  int[] countingSort(int[]arr,int max){
        int[] temp=new int[max+1];
        for (int k : arr) {
            temp[k]++;
        }
        int[] result=new int[arr.length];
        int index=0;
        for (int j = 0; j <max+1 ; j++) {
            while(temp[j]>0){
                result[index++]=j;
                temp[j]--;
            }
        }
        return result;
    }
    private static int getMax(int[]arr){
        int max=arr[0];
        for (int i : arr) {
            if(i>max){
                max=i;
            }
        }
        return max;
    }
}
