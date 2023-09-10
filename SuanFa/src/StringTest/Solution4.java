package StringTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
示例 1:
输入: s = "anagram", t = "nagaram"
输出: true
*/
//方法一：哈希表
class Solution4_1 {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>map=new HashMap<>();
        for (int i = 0; i <s.length(); i++) {
           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(map);
        for (int j = 0; j <t.length(); j++) {
            if(map.containsKey(t.charAt(j))){
                map.put(t.charAt(j),map.get(t.charAt(j))-1);
            }else{
                return false;
            }
        }
        for (Integer value : map.values()) {
            if(value!=0){
                return false;
            }
        }
        return true;
    }
}
//方法二：用数组改进哈希表
class Solution4_2 {
    public boolean isAnagram(String s, String t) {
        int[] court=new int[26];
        for (int i = 0; i <s.length(); i++) {
            court[s.charAt(i)-'a']++;
        }
        for (int j = 0; j <t.length(); j++) {
            court[t.charAt(j)-'a']--;
        }
        for (int i : court) {
           if(i!=0){
               return false;
           }
        }
        return true;
    }
}
//方法三：排序
class Solution4_3 {
    public boolean isAnagram(String s, String t) {
        char[] cs=s.toCharArray();
        char[] ct=t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        return Arrays.equals(cs,ct);
    }
}
