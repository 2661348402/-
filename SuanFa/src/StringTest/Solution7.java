package StringTest;
/*实现 strStr() 函数。
给你两个字符串 haystac
k 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
说明：当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。
示例 1
输入：haystack = "hello", needle = "ll"
输出：2
*/
//方法一：双指针
class Solution7_1 {
    public int strStr(String haystack, String needle) {
       if(needle.length()==0)
           return 0;
        int right=0;
        int left=0;
        while(right<haystack.length()&&left<needle.length()){
            if(haystack.charAt(right)==needle.charAt(left)){
                right++;
                left++;
            }else{
                right=right-left+1;
                left=0;
            }
            if(left==needle.length())
                return right-left;
        }
       return -1;
    }
}
//方法二：滑动窗口
class Solution7_2 {
    public int strStr(String haystack, String needle) {
        int n=needle.length();
        int m=haystack.length()-n;
        if(n==0)
            return 0;
        for (int i = 0; i <=m; i++) {
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
//