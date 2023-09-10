package summer_day08;
/*
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：

F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), 其中 N > 1.

斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。

答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。


示例 1：

输入：n = 2
输出：1
问题：大数越界： 随着 n 增大, f(n) 会超过 Int32 甚至 Int64 的取值范围，导致最终的返回值错误
 */
//方法一：数组储存
//class Solution3 {
//    public int fib(int n) {
//    	int[]nums=new int [n+1];
//    	nums[0]=0;
//    	nums[1]=1;
//    	for(int i=2;i<n+1;i++) {
//    		nums[i]=(nums[i-1]%1000000007+nums[i-2]%1000000007)%1000000007;
//    		
//    	}
//    	return nums[n];
//    }
//}
//方法二：
class Solution3 {
	public int fib(int n) {
		int a=0,b=1,sum=0;
		for(int i=1;i<n;i++) {
			sum=(a+b)%1000000007;
			a=b;
			b=sum;
		}
		return b;

}
}


