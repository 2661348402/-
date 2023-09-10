package summer_day09;
/*
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 * ����һ����������������һ����ת�������ת�������СԪ�ء�
 * ���磬���� [3,4,5,1,2] Ϊ [1,2,3,4,5] ��һ����ת�����������СֵΪ1��  

ʾ�� 1��

���룺[3,4,5,1,2]
�����1
 */
//class Solution {
//    public int minArray(int[] numbers) {
//        for(int i=0;i<numbers.length-1;i++) {
//        	if(numbers[i+1]<numbers[i]) {
//        		return numbers[i+1];
//        	}
//        }
//        return numbers[0];
//    }
//}

class Solution2 {
    public int minArray(int[] numbers) {
    	int n=numbers.length;
    	int left=0,right=n-1;
    	while(left<=right) {
    		int mid=left+(right-left)/2;
    		if(numbers[mid]<numbers[right]) {
    			right=mid-1;
    		}
    		else if(numbers[mid]>numbers[right]) {
    			left=mid+1;
    		}
    		else {
    			right--;
    		}
    		
    	}
    	return numbers[left];
    }
}