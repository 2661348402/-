package day03;

/*
练习一：已知一个几乎有序的数组，几乎有序是指，
如果把数组排好顺序的话，每个元素移动的距离不可以超过k,
并且k相对数组来说比较小，请选择合适的数据算法针对这个数据进行排序。
练习二：一个数据流中随时可取得中位数
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapTest {
    public static void main(String[] args) {
        int[]arr={3,4,1,2,7,8,5,6,10,9};
        test(arr,3);
        System.out.println(Arrays.toString(arr));
        System.out.println(test2(arr));
    }
    //练习一
    public static void test(int[]arr,int k){
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        int index=0;
        for (;index<Math.min(k,arr.length) ;index++) {
            heap.add(arr[index]);
        }
        int i=0;
        for (; index<arr.length;++index,i++) {
            heap.add(arr[index]);
            arr[i]=heap.poll();
        }
        while(!heap.isEmpty()){
            arr[i++]=heap.poll();
        }
    }
    //练习二
    public static double test2(int[] arr){
        PriorityQueue<Integer> minNum=new PriorityQueue<>();
        PriorityQueue<Integer> maxNum=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        maxNum.add(arr[0]);
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]<maxNum.peek()){
                maxNum.add(arr[i]);
            }else{
                minNum.add(arr[i]);
            }
            if(maxNum.size()-minNum.size()>1){
                minNum.add(maxNum.poll());
            }else if(minNum.size()-maxNum.size()>1){
                maxNum.add(minNum.poll());
            }
        }
        double result;
        if(maxNum.size()<minNum.size()){
            result=minNum.poll();
        }else if(minNum.size()<maxNum.size()){
            result=maxNum.poll();
        }else{
            result=(double) (minNum.poll()+maxNum.poll())/2;
        }
        return result;
    }

}
