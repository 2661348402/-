package summer_day04;
/*给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。

示例 1：
输入：nums = [-4,-1,0,3,10]
输出：[0,1,9,16,100]
解释：平方后，数组变为 [16,1,0,9,100]
排序后，数组变为 [0,1,9,16,100]

同样地，我们可以使用两个指针分别指向位置 0 和 n−1，每次比较两个指针对应的数，
选择较大的那个逆序放入答案并移动指针。这种方法无需处理某一指针移动至边界的情况
，读者可以仔细思考其精髓所在
 */
class Solution {
    public int[] sortedSquares(int[] nums) {
    	int n=nums.length;
    	int i=0,j=n-1,k=1;
    	int []arr=new int [n];
    	while(i<=j) {
    		if(nums[i]*nums[i]<nums[j]*nums[j]) {
    			arr[n-k]=nums[j]*nums[j];
    			j--;
    		}
    		else {
    			arr[n-k]=nums[i]*nums[i];
    			i++;
    		}
    		k++;
    	}
    	return arr;
    }
}
