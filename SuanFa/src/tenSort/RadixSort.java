package tenSort;

import java.util.Arrays;

public class RadixSort {
    public static int[] sort(int[]arr){
        int[]as= Arrays.copyOf(arr,arr.length);
        int digit=getDigit(as);
        return radixSort(as,digit);
    }
    private static int getDigit(int[]as){
        int max=as[0];
        int min=as[0];
        for(int i=1;i<as.length;i++){
            if(max<as[i]){
                max=as[i];
            }else if(min>as[i]){
                min=as[i];
            }
        }
        int digit=0;
        if(max<=0){
            digit++;
            while(min<-10){
                min/=10;
                digit++;
            }
        }else {
            while (max > 0) {
                max /= 10;
                digit++;
            }
        }
        return digit;
    }
    private static int[] radixSort(int[]as,int digit){

        int radix=1;
        for(int i=0;i<digit;i++){
            int[][] buckets=new int[20][0];
            for (int a : as) {
                int index = (a / radix) % 10+10;
                buckets[index] = arrAppand(buckets[index], a);
            }
            int index=0;
            for(int[]a:buckets){
                if(a.length==0){
                    continue;
                }
                for(int value:a){
                    as[index++]=value;
                }
            }
            radix*=10;

        }
        return as;
    }
    private static int[] arrAppand(int[]as,int i){
        as=Arrays.copyOf(as,as.length+1);
        as[as.length-1]=i;
        return as;
    }
}
