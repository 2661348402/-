package ArraysTest;

//方法一：动态规划
class Solution2_1{
    public int maxProfit(int[] prices) {
        int hold= -prices[0];
        int noHold=0;
        for (int i =1 ; i <prices.length ; i++) {
            hold=Math.max(hold,noHold-prices[i]);
            noHold=Math.max(noHold,hold+prices[i]);
        }
        return noHold;
    }
}
//方法二：贪心算法
class Solution2_2 {
    public int maxProfit(int[] prices) {
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                max+=prices[i]-prices[i-1];
            }
        }
        return max;
   }
}