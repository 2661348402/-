package day02;

import java.math.BigInteger;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i <n; i++) {
            BigInteger a=sc.nextBigInteger(16);
            System.out.println(a.toString(8));
        }

    }
}
