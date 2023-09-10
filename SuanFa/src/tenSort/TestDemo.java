package tenSort;

public class TestDemo {
    public static void main(String[] args) {
        int[]arr={83,36,1,33,44,87,3,47,73,10,38,30,67,92,5};
      // int[] arrSorted=BubbleSort.sort(arr);//冒泡排序
      //  int[] arrSorted=SelectSort.sort(arr);//选择排序
       // int[] arrSorted=InsertSort.sort(arr);//插入排序
       // int[] arrSorted=ShellSort.sort(arr);//希尔排序
       // int[] arrSorted=MergeSort.sort(arr);//归并排序
        //int[] arrSorted=QuickSort.sort(arr);//快速排序
       // int[] arrSorted=HeapSort.sort(arr);//堆排序
       // int[] arrSorted=CountingSort.sort(arr);//计数排序
       // int[] arrSorted=BubbleSort.sort(arr);//桶排序
        int[] arrSorted=RadixSort.sort(arr);//基数排序
        printArr(arrSorted);

    }
    public static void printArr(int[]arr){
        System.out.print("{");
        for (int i : arr) {
            System.out.print(i+",");
        }
        System.out.println("}");
    }
}
