package tenSort;

import java.util.Arrays;

public class ShellSort {
    public static int[] sort(int[] arr){
        int length=arr.length;
        int[] as= Arrays.copyOf(arr,length);
        for(int step=length/2;step>=1;step/=2){
            for(int i=step;i<length;i++){
                int temp=as[i];
                int j=i-step;
                while(j>=0&&as[j]>temp){
                    as[j+step]=as[j];
                    j-=step;
                }
                as[j+step]=temp;
            }
        }
        return  as;
    }
}
