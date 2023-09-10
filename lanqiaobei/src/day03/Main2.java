package day03;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]arr=new int[n][n];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <n; i++) {
            for (int j =0; j <n; j++) {
              if(i==0&&j==0){
                  continue;
              }
              if(i==0){
                  arr[i][j]=arr[i][j-1]+arr[i][j];
              }else if(j==0){
                  arr[i][j]=arr[i-1][j]+arr[i][j];
              }else{
                 if( arr[i][j-1]>arr[i-1][j]){
                     arr[i][j]=arr[i][j-1]+arr[i][j];
                 }else{
                     arr[i][j]=arr[i-1][j]+arr[i][j];
                 }
              }
            }
        }
        System.out.println(arr[n-1][n-1]);
    }
}
