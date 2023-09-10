package day04;
/*
　123321是一个非常特殊的数，它从左边读和从右边读是一样的。
　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
 */

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


    }

    public static void method1(int n) {

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i * 2 + j * 2 + k == n) {
                        System.out.println("" + i + j + k + j + i);

                    }

                }
            }
        }


        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i * 2 + j * 2 + k * 2 == n) {
                        System.out.println("" + i + j + k + k + j + i);

                    }

                }
            }
        }

    }

    public static void method2(int n) {

        for (int i = 10000; i < 1000000; i++) {
            char[] ch = String.valueOf(i).toCharArray();
            int left = 0;
            int right = ch.length - 1;
            boolean flag = true;
            while (left < right) {
                if (ch[left++] != ch[right--]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                int sum = 0;
                int j = i;
                while (j > 0) {
                    sum += j % 10;
                    j /= 10;
                }
                if (sum == n) {
                    System.out.println(i);

                }
            }
        }


    }
}
