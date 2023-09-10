package day02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <arr.length; i++) {
            int m=i;
            arr[i]=sc.nextInt();
            while(m>0){
                if(arr[m]<arr[m-1]){
                    int temp=arr[m];
                    arr[m]=arr[m-1];
                    arr[m-1]=temp;
                    m--;
                }else {
                    break;
                }
            }
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
