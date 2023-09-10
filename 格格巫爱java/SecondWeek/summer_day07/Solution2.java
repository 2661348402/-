package summer_day07;
/*
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。

不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。

你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
示例 1：

输入：["h","e","l","l","o"]
输出：["o","l","l","e","h"]
 */
//
//class Solution2 {
//    public void reverseString(char[] s) {
//    	String str=String.valueOf(s);
//    	StringBuilder sb=new StringBuilder(str);
//    	s=sb.reverse().toString().toCharArray();
//    	//这里实际上是创造了一个新的字符数组，并使其指向了本类中的变量s；
//    	//但是测试类中的s仍然指向原地址，且内容未改变
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