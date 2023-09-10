package StringTest;

/*给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
说明：本题中，我们将空字符串定义为有效的回文串。
示例 1:
输入: "A man, a plan, a canal: Panama"
输出: true
解释："amanaplanacanalpanama" 是回文串
*/
//方法一：双指针
class Solution5_1 {
    public boolean isPalindrome(String s) {
       int left=0;
      int  n=s.length();
       int right=n-1;
       s=s.toLowerCase();
       while(left<right){
           while(left<right&&(!Character.isLetterOrDigit(s.charAt(left)))){
               left++;
           }
           while (left<right&&!Character.isLetterOrDigit(s.charAt(right))){
               right--;
           }
           if(s.charAt(left)!=s.charAt(right)){
               return false;
           }
           left++;
           right--;
       }
       return true;
    }
}
//方法二：使用正则表达式
class Solution5_2 {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]","");
        return new StringBuffer(s).reverse().toString().equalsIgnoreCase(s);
    }
}