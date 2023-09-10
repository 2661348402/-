package summer_day04;
/*
 * ����һ�����飬�������е�Ԫ�������ƶ� k ��λ�ã����� k �ǷǸ�����
���ף�

    �������������Ľ�����������������ֲ�ͬ�ķ������Խ��������⡣
    �����ʹ�ÿռ临�Ӷ�Ϊ O(1) �� ԭ�� �㷨������������

ʾ�� 1:

����: nums = [1,2,3,4,5,6,7], k = 3
���: [5,6,7,1,2,3,4]
����:
������ת 1 ��: [7,1,2,3,4,5,6]
������ת 2 ��: [6,7,1,2,3,4,5]
������ת 3 ��: [5,6,7,1,2,3,4]
*/
class Solution2 {
    public void rotate(int[] nums, int k) {
    	int n=nums.length;
    	int m=k%n;
    	reverse(nums,0,n-1);
    	reverse(nums,0,m-1);
    	reverse(nums,m,n-1);
    	
    }
     int[] reverse(int []nums,int i,int j){
    	while(i<j) {
    		int temp=nums[i];
    		nums[i]=nums[j];
    		nums[j]=temp;
    		i++;
    		j--;
    	}
    	return nums;
    }
}
