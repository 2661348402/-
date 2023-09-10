package tenSort;

import java.util.Arrays;

public class BucketSort {
    public static int[] sort(int[]arr){
        int[]as=Arrays.copyOf(arr,arr.length);
        return bucketSort(as,10);
    }
    private static int[] bucketSort(int[]as,double bucketSize){
        int max=as[0];
        int min=as[0];
        for (int i : as) {
            if(i<min){
                min=i;
            }else if(i>max){
                max=i;
            }
        }
        int bucketNum=(int)Math.ceil((max-min)/bucketSize);
        int[][] buckets=new int[bucketNum][0];
        //放入桶中
        for(int num:as){
            int index= (int) Math.ceil((num-min)/bucketSize);
            buckets[index]=arrAppend(buckets[index],num);
        }
       // 给桶中的元素排序
        int index=0;
        for(int[] arr:buckets){
            if(arr.length==0){
                continue;
            }
           arr=InsertSort.sort(arr);
            for(int i:arr){
                as[index++]=i;
            }
        }
        return as;
    }
    private static int[] arrAppend(int[]arr,int i){
        arr= Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1]=i;
        return  arr;
    }

}
