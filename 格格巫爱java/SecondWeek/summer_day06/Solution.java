package summer_day06;
/*
 * ����һ������ nums����дһ������������ 0 �ƶ��������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��
ʾ��:
����: [0,1,0,3,12]
���: [1,3,12,0,0]
˵��:
    ������ԭ�����ϲ��������ܿ�����������顣
    �������ٲ���������
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
