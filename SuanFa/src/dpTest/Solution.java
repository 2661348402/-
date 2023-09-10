package dpTest;

/*假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

        每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

        注意：给定 n 是一个正整数。*/
//方法一：尾递归
class Solution1 {
    public int climbStairs(int n) {
        return recursion(n,1,1);
    }
    public int recursion(int n,int a,int b){
        if(n<2){
            return b;
        }else{
            return recursion(n-1,b,a+b);
        }
    }
}
//方法二：动态规划
class Solution {
    public int climbStairs(int n) {
        int a=1;
        int b=1;
        for(int i=2;i<=n;i++){
           int temp=b;
           b=a+b;
           a=b;
        }
        return b;
    }
}

