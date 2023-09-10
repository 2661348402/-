package ArraysTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
说明：你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
示例 1:
输入: [2,2,1]
输出: 1
示例 2:
输入: [4,1,2,1,2]
输出: 4
*/
//方法一：用额外的数组
class Solution5_1 {
    public int singleNumber(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for (int num : nums) {
            if(max<num){
                max=num;
            }else if(min>num){
                min=num;
            }
        }
        if(min<0){
            int[]arr=new int[max-min+1];
            for (int num : nums) {
                arr[num-min]++;
            }
            for (int num : nums) {
                if(arr[num-min]==1){
                    return num;
                }
            }
        }else {
            int[] arr = new int[max + 1];
            for (int num : nums) {
                arr[num]++;
            }
            for (int num : nums) {
                if(arr[num]==1){
                    return  num;
                }
            }
        }
        return 0;
    }
}
//方法二：排序
class Solution5_2 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-1; i+=2) {
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
//方法三：位运算（没想到）
class Solution5_3 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^=num;
        }
        return result;
    }
}
//:方法四：set集合
class Solution5_4 {
    public int singleNumber(int[] nums) {
        Set set=new HashSet();
        for (int num : nums) {
            if(!set.add(num)){
                set.remove(num);
            }
        }
        return (int) set.toArray()[0];
    }
}