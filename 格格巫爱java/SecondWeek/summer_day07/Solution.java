package summer_day07;
/*
 * ����һ���Ѱ��� ��������  ���������� numbers ��������������ҳ��������������֮�͵���Ŀ���� target ��

����Ӧ���Գ���Ϊ 2 �������������ʽ���������������±�ֵ��numbers ���±� �� 1 ��ʼ���� �����Դ�����Ӧ������ 1 <= answer[0] < answer[1] <= numbers.length ��

����Լ���ÿ������ֻ��ӦΨһ�Ĵ𰸣������㲻�����ظ�ʹ����ͬ��Ԫ�ء�
ʾ�� 1��

���룺numbers = [2,7,11,15], target = 9
�����[1,2]
���ͣ�2 �� 7 ֮�͵���Ŀ���� 9 ����� index1 = 1, index2 = 2 ��
 */
//����һ�������ƽ�
//class Solution {
//    public int[] twoSum(int[] numbers, int target) {
//    	int n= numbers.length;
//    	for(int i=0;i<n;i++) {
//    		for(int j=i+1;j<n;j++) {
//    			if(numbers[i]+numbers[j]==target) {
//    				int []twosum= {i+1,j+1};
//    				return twosum;
//    			} 
//    		}
//    	}
//    	return null;
//    }
//}
//��������˫ָ�루��С��Χ��
class Solution {
    public int[] twoSum(int[] numbers, int target) {
    	int left=0,right=numbers.length-1;
    	while(left<right) {
    		if(numbers[left]+numbers[right]<target) {
    			left++;
    		}
    		else if(numbers[left]+numbers[right]>target) {
    			right--;
    		}
    		else {
    			int[]sum={left+1,right+1};
    			return sum;
    		}
    	}
    	return null;
    }
}






















