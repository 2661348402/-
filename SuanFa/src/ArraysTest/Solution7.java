package ArraysTest;

/*给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
你可以假设除了整数 0 之外，这个整数不会以零开头。
示例 1：
输入：digits = [1,2,3]
输出：[1,2,4]
解释：输入数组表示数字 123。
示例 2：
输入：digits = [4,3,2,1]
输出：[4,3,2,2]
解释：输入数组表示数字 4321。
*/
class Solution7_1 {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        for (int i = 1; i <=len; i++) {
            if(digits[len-i]==9){
                digits[len-i]=0;
            }else{
                digits[len-i]+=1;
                break;
            }
        }
        if(digits[0]==0){
            int[]arr=new int[len+1];
            arr[0]=1;
            for(int i=0;i<len;i++){
                arr[i+1]=digits[i];
            }
            return arr;
        }
        return digits;
    }
}