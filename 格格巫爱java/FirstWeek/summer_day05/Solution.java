package summer_day05;

/*
 * ����һ�� n ��Ԫ������ģ������������� nums ��һ��Ŀ��ֵ target  
 * ��дһ���������� nums �е� target�����Ŀ��ֵ���ڷ����±꣬���򷵻� -1��
 * 
 * 
ʾ�� 1:
����: nums = [-1,0,3,5,9,12], target = 9
���: 4
����: 9 ������ nums �в����±�Ϊ 4

 */
class Solution {
    public int search(int[] nums, int target) {
    	int left=0,right=nums.length-1,mid=0;
    	while(left<=right) {
    		mid=(right+left)/2;
    		if(target<nums[mid]) {
    			right=mid-1;
    			
    		}else if(target>nums[mid]) {
    			left=mid+1;
    			
    		}else {
    			
    			return mid;
    		}
    	}
    	
    	
    	return -1;
    }
}
