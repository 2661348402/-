package summer_day08;
/*
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。

示例：

输入："Let's take LeetCode contest"
输出："s'teL ekat edoCteeL tsetnoc"
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