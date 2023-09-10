package StringTest;

import java.util.HashMap;
import java.util.Map;

/*给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
示例：
s = "leetcode"
返回 0
s = "loveleetcode"
返回 2
*/
//方法一：哈希表
class Solution3_1{
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <s.length(); i++) {
          if(map.put(s.charAt(i),i)!=null){
              map.put(s.charAt(i),-1);
          }
        }
        for(int j=0;j<s.length();j++){
            if(map.get(s.charAt(j))!=-1){
                return j;
            }
        }
        return -1;
    }
}
//方法二：数组改进哈希表
class Solution3_2 {
    public int firstUniqChar(String s) {
        int[] court=new int[26];
        for (int i = 0; i <s.length(); i++) {
            court[s.charAt(i)-'a']++;
        }
        for (int j = 0; j <s.length(); j++) {
            if(court[s.charAt(j)-'a']==1){
                return j;
            }
        }
        return -1;
    }
}
//方法三：官方api
class Solution3_3 {
    public int firstUniqChar(String s) {
        for (int i = 0; i <s.length(); i++) {
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}