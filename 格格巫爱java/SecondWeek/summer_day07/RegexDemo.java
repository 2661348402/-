package summer_day07;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 7.分隔功能案例
我有如下一个字符串:"91 27 46 38 50"
 请写代码实现最终输出结果是："27 38 46 50 91"

 * 正则表达式：是指一个用来描述或者匹配一系列符合某个句法规则的字符串的单个字符串。其实就是一种规则。有自己特殊的应用。
 * 1、判断：String类的public boolean matches(String regex)
 * 2、分割：String类的public String[] split(String regex)
 * 3、替换：String类的public String replaceAll(String regex,String replacement)
 * 
 */
public class RegexDemo {
	public static void main(String[] args) {
		String regex="1[38]\\d{9}";
//		Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();//包含空格，只有enter作为分隔符
//		//String s=sc.next();//不包含空格,遇到有效字符后，空格也可作为分隔符
//		System.out.println(s);
//		System.out.println(s.matches(regex));
//		
//		String ss="91 27 46 38 50";
//		regex=" ";
//		String[] str=ss.split(regex);
//		int []nums=new int [str.length];
//		for(int i=0;i<str.length;i++) {
//			nums[i]=Integer.valueOf(str[i]);
//			System.out.print(nums[i]+" ");
//		}
//		Arrays.sort(nums);
//		System.out.println();
//		for(int i:nums) {
//			System.out.print(i+" ");
			
		String s="266145fadfsaf53asdf";
		regex="\\w";
		System.out.println(s);
		String ss=s.replaceAll(regex, "*");
		System.out.println(s);
		System.out.println(ss);
			
			
			
			
		}
	}


