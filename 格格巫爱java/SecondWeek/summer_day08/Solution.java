package summer_day08;
/*
 * ����һ���ַ���������Ҫ��ת�ַ�����ÿ�����ʵ��ַ�˳��ͬʱ�Ա����ո�͵��ʵĳ�ʼ˳��

ʾ����

���룺"Let's take LeetCode contest"
�����"s'teL ekat edoCteeL tsetnoc"
 */


class Solution {
    public String reverseWords(String s) {
    	s=s+" ";
    	char[] ch=s.toCharArray();
    	int start=0,end=1;
    	while(end<ch.length) {
    		if(ch[end]==' ') {
    			reverse(ch,start,end);
    			start=end+1;
    			end+=1;
    		}
    		end++;
    	}
    	return String.valueOf(ch).trim();
    }
    public void reverse(char[] ch,int start,int end) {
    	while(start<end) {
    		char temp=ch[start];
    		ch[start]=ch[end];
    		ch[end]=temp;
    		start++;
    		end--;
    		
    	}
    }
}