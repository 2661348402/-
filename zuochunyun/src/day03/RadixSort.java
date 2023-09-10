package day03;
//基数排序：要用到桶的概念
public class RadixSort {

    public static void radixSort(int[]arr,int L,int R){
        //求最大值
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        //求最高位
        int digit=1;
        while (max/10>0){
            digit++;
            max/=10;
        }
        //进出桶
        for (int i = 0; i <digit; i++) {
            int[] count=new int[10];
            int[] help=new int[R-L+1];
            //按该位置的大小放入桶中
            for (int j = L; j <=R; j++) {
                count[getDigit(arr[j],i)]++;
            }
            //构造累加和数组
            for (int j = 1; j <count.length; j++) {
                count[j]=count[j]+count[j-1];
            }
            //从右往左取出
            for (int j = R; j >=L; j--) {
                int temp=getDigit(arr[j],i);
                help[count[temp]-1]=arr[j];
                count[temp]--;
            }
            //把数据放到arr数组中
            for (int j = 0; j <help.length; j++) {
                arr[L+j]=help[j];
            }

        }

    }
    public static int  getDigit(int num,int digit){
       int temp=(int)Math.pow(10,digit);
       return num/temp%10;
    }
}
