package day04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print((char) (65+Math.abs(i-j)));
            }
            System.out.println();
        }
    }

}
