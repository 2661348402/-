package day04;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double p=(1.0+n)/2;
        Long sum=(long)(n*p);
        System.out.println(sum);
    }
}
