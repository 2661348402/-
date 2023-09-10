package ArraysTest;

import java.util.*;

/*给定两个数组，编写一个函数来计算它们的交集。
示例 1：
输入：nums1 = [1,2,2,1], nums2 = [2,2]
输出：[2,2]
*/
class Solution6_1 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list=new LinkedList<Integer>();

        for(int left=0,right=0;left<nums1.length&&right<nums2.length;){
            if(nums1[left]<nums2[right]){
                left++;
            } else if (nums1[left] > nums2[right]){
                right++;
            }else{
                list.add(nums1[left]);
                left++;
                right++;
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
//方法二：map储存
class Solution6_2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        List list=new LinkedList();
        for (int i = 0; i <nums1.length; i++) {
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int j=0;j<nums2.length;j++){
            if(map.containsKey(nums2[j])){
                if(map.get(nums2[j])>0) {
                    list.add(nums2[j]);
                    map.put(nums2[j], map.get(nums2[j]) - 1);
                }
            }
        }
        int[] arr=new int[list.size()];
        for (int k=0;k<arr.length;k++){
            arr[k]=(int)list.get(k);
        }
        return arr;
    }
}