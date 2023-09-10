package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
暴力递归：就是尝试
1、把问题转换成同类的规模缩小的子类问题
2、有明确的不需要继续进行递归的条件（base case）
3、有当得到了子问题的结果之后的决策过程
4、不记录每一个子问题的解
练习一：打印n层汉诺塔从最左边移动到最右边的全部过程
（如图所示，像三个钢管串着盘子一样，但大盘子不能压在小盘子上面）
练习二：打印一个字符串的全部子序列，包括空字符序列
练习三：打印一个字符串的全部排列
        （升级版：去除重复序列）
练习四：纸牌问题
练习五：给你一个栈，请你将这个栈逆序，不使用任何额外的数据结构，只使用递归函数
练习六：如图
练习七：背包问题如图
 */
public class ForceRecursion {
    public static void main(String[] args) {
        //1
        hanoi(3);
        //2
       //printAllSonString("abcd");
        printAllSonString2("abc");
        //3
        List<String> res=AllSequence("abca");
        for (String re : res) {
            System.out.println(re);
        }
        //4
        int[]arr={1,2,100,4};
        System.out.println(win(arr));
        //5
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        reverse(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        //6
        System.out.println(digitTOLetter("111"));
        //7
        int[]weights={1,2,3,4};
        int[] values={2,4,4,5};
        int bag=5;
        System.out.println(maxValue(weights,values,bag));
    }
    //练习一：
    public static void hanoi(int n){
        if(n>0){
            process(n,"左","右","中");
        }
    }
    public static void process(int i,String from,String to,String other){
        if(i==1){
            System.out.println(i+": "+from+"-------->"+to);
        }else{
            process(i-1,from,other,to);
            System.out.println(i+": "+from+"-------->"+to);
            process(i-1,other,to,from);
        }

    }
    //练习二：方法一
    public static void printAllSonString(String str){
        if (str != null) {
            int i=0;
            char[] chars=str.toCharArray();
            process21(chars,i,new ArrayList<>());
        }
    }
    public static void process21(char[] chars, int i, List<Character> str){
        if(i==chars.length){
            System.out.println(Arrays.toString(str.toArray()));
        }else{
           List<Character> NotInclude=copyList(str);
           str.add(chars[i]);
           process21(chars,i+1,str);
           process21(chars,i+1,NotInclude);
        }

    }
    public static List<Character> copyList(List<Character> str){
        if (str == null) {
            return new ArrayList<>();
        }
        List<Character> list=new ArrayList<>();
        for (Character character : str) {
            list.add(character);
        }
        return list;
    }
    //练习二：方法二（省空间）
    public static void printAllSonString2(String str){
        if (str == null) {
           return;
        }
        char[] chars=str.toCharArray();
        process22(chars,0);
    }
    public static void process22(char[] chars,int i){
        if (i==chars.length){
            System.out.println(String.valueOf(chars));
        }else{
            //保留该字母
            process22(chars,i+1);
            //不保留该字母
            char temp=chars[i];
            chars[i]=0;
            process22(chars,i+1);
            chars[i]=temp;

        }
    }
    //练习三：
    public static List<String> AllSequence(String str){
        List<String> res=new ArrayList<>();
        if(str==null||str.length()==0){
            return res;
        }
        char[] chars=str.toCharArray();
        process31(chars,0,res);
        return res;
    }
    public static void process31(char[] chars,int i,List<String> res){
        if(i==chars.length){
            res.add(String.valueOf(chars));
        }
        //删除重复的二叉树节点
        boolean[] visit=new boolean[26];//
        for (int j = i; j <chars.length; j++) {
            if(!visit[chars[j]-'a']) {//
                visit[chars[j]-'a']=true;//
                swap(chars, i, j);
                process31(chars, i + 1, res);
                swap(chars, i, j);
            }
        }
    }
    public static void swap(char[] chars,int i,int j){
        char temp=chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
    }
    //练习四：
    public static int win(int[] arr){
        return Math.max(first(arr,0,arr.length-1),second(arr,0,arr.length-1));
    }
    public static int  first(int[]arr,int L,int R){
        if(L==R){
            return arr[L];
        }
        int a=arr[L]+second(arr,L+1,R);
        int b=arr[R]+second(arr,L,R-1);
        return Math.max(a,b);
    }
    public static int second(int[]arr,int L,int R){
        if(L==R){
            return 0;
        }
        return Math.min(first(arr,L+1,R),first(arr,L,R-1));
    }
    //练习五：
    public static void reverse(Stack<Integer>stack){
        if(stack.isEmpty()){
            return;
        }
        int i=removeLast(stack);
        reverse(stack);
        stack.push(i);

    }
    public static int removeLast(Stack<Integer> stack){
        int result=stack.pop();
        if (stack.isEmpty()){
            return result;
        }else{
            int last=removeLast(stack);
            stack.push(result);
            return last;
        }

    }
    //练习六：
    public static int digitTOLetter(String str){
        if (str == null) {
            return 0;
        }
        char[] chars=str.toCharArray();
        return process61(chars,0);
    }
    public static int process61(char[] chars,int i){
        if (i==chars.length){
            return 1;
        }
        if(chars[i]=='0'){
            return 0;
        }
        if(chars[i]=='1'){
            int res=process61(chars,i+1);
            if(i+1<chars.length){
                res+=process61(chars,i+2);
            }
            return res;
        }
        if(chars[i]=='2'){
            int res=process61(chars,i+1);
            if(i+1<chars.length&&chars[i+1]>'0'&&chars[i+1]<='6'){
                res+=process61(chars,i+2);
            }
        }
        return process61(chars,i+1);
    }
    //练习七：
    public static int maxValue(int[] weights,int[] values,int bag){
        return process71(weights,values,0,0,bag);
    }
    public static int process71(int[] weights,int[] values,int i,int existWeight,int bag){
        if(i== values.length){
            return 0;
        }
        if(existWeight+weights[i]>bag){
            return 0;
        }
        return Math.max(process71(weights,values,i+1,existWeight,bag),
                values[i]+process71(weights,values,i+1,existWeight+weights[i],bag));
    }
}
