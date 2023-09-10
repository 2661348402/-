package 算法训练;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        String res="";
        for (int i = 0; i <N; i++) {
            int m=sc.nextInt();
            for (int j = 0; j <m; j++) {
                String s=sc.next();
                res=merge(s,res);
            }
            System.out.println(res);
            res="";
        }

    }
    public static String  merge(String s,String s2){
      return (s+s2).compareTo(s2+s)<0?s+s2:s2+s;
    }

}
