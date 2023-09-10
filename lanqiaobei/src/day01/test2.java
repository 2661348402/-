package day01;

//　共有n种图案的印章，每种图案的出现概率相同。小A买了m张印章，求小A集齐n种印章的概率。
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(m<n) {
            System.out.printf("%.4f",0.0);
            return;
        }

        double [][]dp=new double[m+1][n+1];
        double p=1.0/n;
        dp[1][1]=1;
        for (int i = 2; i <m+1; i++) {
            dp[i][1]=Math.pow(p,i-1);
        }
        for (int i = 1; i <m+1; i++) {
            for (int j = 2; j <n+1; j++) {
                if (i<j){
                    dp[i][j]=0.0;
                }else{
                    dp[i][j]=dp[i-1][j]*(j*p)+dp[i-1][j-1]*((n-j+1)*p);
                }
            }
        }
        System.out.printf("%.4f",dp[m][n]);
    }
}
