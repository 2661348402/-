package summer_day03;
/*
 * ����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�
����Լ������������ظ�Ԫ�ء�
ʾ�� 1:
����: [1,3,5,6,8,9], 5
���: 2
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1,mid=0;
        
        while(left<=right) {
        	 mid=(right+left)/2;//ûע������/������������;round���ص���һ��long��Ҫǿ��ת��
        	if(target<nums[mid]) {
        		right=mid-1;
        		
        	}
        	else if(target>nums[mid]){
        		
        		
        		if(left==right) {
        			mid++;
        		}
        		left=mid+1;
        	}
        	else {
        		
        		break;
        	}
        } 
        return mid;	
    }
}