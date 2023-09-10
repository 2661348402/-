package day06;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayTest {
    public static void main(String[] args) {
        int[][] arr=new int[6][3];
        for (int i = 0; i <6; i++) {
            for (int j = 0; j <3; j++) {
                arr[i][j]=(int)(Math.random()*20);
            }
        }
        for (int[] arrSorted : arr) {
            System.out.println(Arrays.toString(arrSorted));
        }
        System.out.println(arr.length);
        HashSet set=new HashSet();
        for (Object o : set) {
            System.out.println(0);
        }
        System.out.println("程序执行完毕");
    }
}
