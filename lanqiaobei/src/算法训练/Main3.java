package 算法训练;
//礼物（贪心算法）

//9 221190369764
//        481476446 428909213 489387402 578388541 575810354 884595820 355462380 731858497 877375633
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long S=sc.nextLong();
        long[] prefix=new long[N+1];
        for (int i = 0; i <N; i++) {
            prefix[i+1]=prefix[i]+sc.nextLong();
        }
        for (int i =N/2; i >=0; i--) {
            if(prefix[i+1]<=S&&prefix[i+i+1]<=2*S){
                System.out.println(i*2);
                return;
            }
        }
    }
}
