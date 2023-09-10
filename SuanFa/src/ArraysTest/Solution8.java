package ArraysTest;

import java.util.LinkedList;
import java.util.List;

/*给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
示例:
输入: [0,1,0,3,12]
输出: [1,3,12,0,0]
说明:
    必须在原数组上操作，不能拷贝额外的数组。
    尽量减少操作次数。
*/
//方法一：双指针
class Solution8_1 {
    public void moveZeroes(int[] nums) {
        int len=nums.length;
        for(int right=1,left=0;left<len&&right<len;left++,right++){
            if(nums[right]==0&&nums[left]==0){
                left--;
            }else if(nums[right]!=0&&nums[left]==0){
                nums[left]=nums[right];
                nums[right]=0;
            }
            }
        }
    }
//方法二：
class Solution8_2 {
    public void moveZeroes(int[] nums) {
        List list=new LinkedList();
        for (int num : nums) {
            if(num!=0){
                list.add(num);
            }
        }
        for (int i = 0; i <nums.length; i++) {
            if(i<list.size()){
                nums[i]=(int)list.get(i);
            }
            else{
                nums[i]=0;
            }
        }
    }
}
//方法三：双指针改进
class Solution8_3 {
    public void moveZeroes(int[] nums) {
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=0){
               int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
            }
        }
    }
}