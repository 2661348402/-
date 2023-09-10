package day03;
//不基于比较的排序，需要确定数据的范围
public class CountingSort {
    public static void main(String[] args) {

    }
    public static void countingSort(int[]arr){
        int max=0;
        //找到最大值
        for (int i = 0; i <arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        };
        int min=max;
        //找到最小值
        for (int i = 0; i <arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        //创建一个数组
        int[] temp=new int[max+1];
        //遍历将数据存入数组
        for (int i = 0; i <arr.length; i++) {
            temp[arr[i]]++;
        }
        //将数据按顺序取出
        for (int i = min,j=0; i <max+1; i++) {
            while((temp[i]--)>0){
                arr[j++]=i;
            }
        }
    }
}
