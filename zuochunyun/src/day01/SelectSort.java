package day01;

//选择排序
public class SelectSort {
        public  static void selectSort(int[] arr){
            for (int i = 0; i < arr.length-1; i++) {
                for (int j =i+1; j <arr.length ; j++) {
                    if(arr[i]>arr[j]) {
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
    }
}
