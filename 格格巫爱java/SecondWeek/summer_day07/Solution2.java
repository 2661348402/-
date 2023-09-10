package summer_day07;
/*
 * ��дһ���������������ǽ�������ַ�����ת�����������ַ������ַ����� char[] ����ʽ������

��Ҫ�����������������Ŀռ䣬�����ԭ���޸��������顢ʹ�� O(1) �Ķ���ռ�����һ���⡣

����Լ��������е������ַ����� ASCII ����еĿɴ�ӡ�ַ���
ʾ�� 1��

���룺["h","e","l","l","o"]
�����["o","l","l","e","h"]
 */
//
//class Solution2 {
//    public void reverseString(char[] s) {
//    	String str=String.valueOf(s);
//    	StringBuilder sb=new StringBuilder(str);
//    	s=sb.reverse().toString().toCharArray();
//    	//����ʵ�����Ǵ�����һ���µ��ַ����飬��ʹ��ָ���˱����еı���s��
//    	//���ǲ������е�s��Ȼָ��ԭ��ַ��������δ�ı�
//    }
//}


class Solution2 {
    public void reverseString(char[] s) {
    	int left=0,right=s.length-1;
    	while(left<right) {
    		char temp=s[left];
    		s[left]=s[right];
    		s[right]=temp;
    		left++;
    		right--;
    	}
    }
}