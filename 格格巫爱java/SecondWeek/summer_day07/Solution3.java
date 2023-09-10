package summer_day07;
/*
 * ��һ�� n * m �Ķ�ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳�����������һ����Ч�ĺ���������������һ����ά�����һ���������ж��������Ƿ��и�������

 
ʾ��:

���о��� matrix ���£�

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]

���� target = 5������ true��
���� target = 20������ false��
*/
class Solution3 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
    	if(matrix.length==0){
    		return false;
    	}
    	int i=0,j=matrix[0].length-1;
    	
    	while(i<matrix.length&&j>=0) {
    		if(matrix[i][j]<target) {
    			i++;
    		}else if(matrix[i][j]>target) {
    			j--;
    		}else {
    			return true;
    		}
    	}
    	return false;
    }
}