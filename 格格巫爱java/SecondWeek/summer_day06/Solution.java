package summer_day06;
/*
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
示例:
输入: [0,1,0,3,12]
输出: [1,3,12,0,0]
说明:
    必须在原数组上操作，不能拷贝额外的数组。
    尽量减少操作次数。
*/


class Solution {
    public void moveZeroes(int[] nums) {
    	int left=0,right=1;
    	while(right<=nums.length-1) {
    		if(nums[left]==0) {
    			if(nums[right]==0) {
    				right++;
    			}else {
    				nums[left]=nums[right];
    				nums[right]=0;
    				right++;
    				left++;
    				
    			}
    		}else {
    		right++;
    		left++;
    		}
    	}
    	
    }
}
