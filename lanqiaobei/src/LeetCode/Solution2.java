package LeetCode;

class Solution4 {
    public String restoreString(String s, int[] indices) {
        int len=s.length();
        char[] res=new char[len];
        for (int i = 0; i <len; i++) {
            res[indices[i]]=s.charAt(i);
        }
        return String.valueOf(res);
    }
}