package summer_day06;
/*
 * �ҳ��������ظ������֡�

��һ������Ϊ n ������ nums ����������ֶ��� 0��n-1 �ķ�Χ�ڡ�������ĳЩ�������ظ��ģ�����֪���м��������ظ��ˣ�Ҳ��֪��ÿ�������ظ��˼��Ρ����ҳ�����������һ���ظ������֡�

ʾ�� 1��
���룺
[2, 3, 1, 0, 2, 5, 3]
�����2 �� 3 
 */
//����һ�������ƽ�
//class Solution2 {
//    public int findRepeatNumber(int[] nums) {
//    	int n=nums.length;
//    	for(int i=0;i<n-1;i++) {
//    		for(int j=i+1;j<n;j++) {
//    			if(nums[i]==nums[j]) {
//    				return nums[i];
//    			}
//    		}
//    	}
//    	return -1;
//    }
//}
class Solution2 {
    public int findRepeatNumber(int[] nums) {
    	int n=nums.length;
    	int []arr=new int[10000];
    	for(int i:nums) {
    		arr[i]++;
    	}
    	for(int i=0;i<n;i++) {
    		if(arr[i]>=2) {
    			return i;
    		}
    	}
    	return -1;
    }
}
