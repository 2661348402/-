package summer_day08;
/*
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

示例 1：

输入：s = "We are happy."
输出："We%20are%20happy."
 */
class Solution2 {
    public String replaceSpace(String s) {
    	char[] ch=new char[s.length()*3];
    	int j=0;
    	for(int i=0;i<s.length();i++) {
    		if(s.charAt(i)==' ') {
    			ch[j]='%';
    			ch[j+1]='2';
    			ch[j+2]='0';
    			j+=3;
    			
    		}
    		else {
    			ch[j]=s.charAt(i);
    			j++;
    			
    		}
    	}
    return String.valueOf(ch).trim();		
    		
    	
    }
 }
