package summer_day07;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 7.�ָ����ܰ���
��������һ���ַ���:"91 27 46 38 50"
 ��д����ʵ�������������ǣ�"27 38 46 50 91"

 * ������ʽ����ָһ��������������ƥ��һϵ�з���ĳ���䷨������ַ����ĵ����ַ�������ʵ����һ�ֹ������Լ������Ӧ�á�
 * 1���жϣ�String���public boolean matches(String regex)
 * 2���ָString���public String[] split(String regex)
 * 3���滻��String���public String replaceAll(String regex,String replacement)
 * 
 */
public class RegexDemo {
	public static void main(String[] args) {
		String regex="1[38]\\d{9}";
//		Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();//�����ո�ֻ��enter��Ϊ�ָ���
//		//String s=sc.next();//�������ո�,������Ч�ַ��󣬿ո�Ҳ����Ϊ�ָ���
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


