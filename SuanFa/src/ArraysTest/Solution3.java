package ArraysTest;

import java.util.Arrays;

/*
* 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
进阶：

    尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
    你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？
示例 1:
输入: nums = [1,2,3,4,5,6,7], k = 3
输出: [5,6,7,1,2,3,4]
解释:
向右旋转 1 步: [7,1,2,3,4,5,6]
向右旋转 2 步: [6,7,1,2,3,4,5]
向右旋转 3 步: [5,6,7,1,2,3,4]*/
//方法一：额外的数组
class Solution3_1 {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        int[] arr= Arrays.copyOf(nums,len);
        for(int i=0;i<len;i++){
            nums[(i+k)%len]=arr[i];
        }
    }
}
//旋转数组
class Solution3_2 {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k%=len;
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);

    }
    private  void reverse(int[]nums,int left,int right){
        while(left<right){
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            left++;
            right--;
        }
    }
}
//使用一个临时变量
class Solution3_3 {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        int temp=nums[0];
        int court=0;
        for(int i=k,crt=0;crt<len;i+=k,crt++){
            int t=nums[i%len];
            nums[i%len]=temp;
            temp=t;
            if(i%len==court){
                court++;
                i=court;
                temp=nums[i%len];
            }
        }
    }
}

