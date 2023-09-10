package simple_review;

import java.util.Scanner;

public class input_test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个数字");
        int a =sc.nextInt();
        System.out.println("你输入的是"+a);//全部转化成字符串标准输出
        System.out.format("你输入的是的%d对不对",a);
        return;
    }

}
