package ArraysTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*给定一个整数数组，判断是否存在重复元素。
如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
示例 1:
输入: [1,2,3,1]
输出: true
*/
//方法一：用set集合的唯一性
class Solution4_1 {
    public boolean containsDuplicate(int[] nums) {
        Set hashset=new HashSet();
        for (int num : nums) {
            if(!hashset.add(num)){
                return true;
            }
        }
        return false;
    }
}
//方法二：暴力遍历
class Solution4_2 {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i <nums.length-1; i++) {
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
//方法三：排序(最优解）
class Solution4_3 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-1; i++) {
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}

