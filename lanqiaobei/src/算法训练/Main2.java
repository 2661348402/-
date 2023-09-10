package 算法训练;
//无聊的逗（0-1背包问题，分割等和子集问题）


import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        List<Integer> list=new LinkedList<>();
        int sum=0;
        for (int i = 0; i <n; i++) {
            int a=sc.nextInt();
            list.add(a);
            sum+=a;
        }
        Collections.sort(list);
        while ((sum&1)==1){
            sum-=list.remove(0);
        }
        int[] temp =toIntArray(list);
        int res=0;
        while (list.size()>1&&res==0){
            res=getPartitionValue(temp,sum);
            sum-=list.remove(0);
            temp=toIntArray(list);
        }
        System.out.println(res);
    }
    public static int getPartitionValue(int[]weight,int sum){
        int maxWeight=sum/2;
        int[][] dp=new int[weight.length][maxWeight+1];
        for (int i = 0; i <weight.length; i++) {
            dp[i][0]=0;
        }
        for (int j = 0; j <maxWeight+1; j++) {
            dp[0][j]=0;
        }
        for (int i =1; i <weight.length; i++) {
            for (int j = 1; j <maxWeight+1; j++) {
                if(j<weight[i]){
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]= Math.max(dp[i-1][j],dp[i-1][j-weight[i]]+weight[i]);
                }
            }
        }
        return dp[weight.length-1][maxWeight]==maxWeight?sum/2:0;
    }
    public static int[] toIntArray(List list){
        int[] res=new int[list.size()];
        for (int i = 0; i <list.size(); i++) {
            res[i]=(int)list.get(i);
        }
        return res;
    }
}
