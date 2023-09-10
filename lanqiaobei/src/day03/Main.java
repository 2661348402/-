package day03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
            sum+=arr[i];
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
