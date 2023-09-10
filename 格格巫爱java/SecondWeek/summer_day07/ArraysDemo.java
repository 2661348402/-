package summer_day07;

import java.util.Arrays;

/*
 * Arrays常用功能
 * 				1、sort
 * 				2、toString//没有重写toString方法
 * 				3、binarySeacher();
 * 
 */

public class ArraysDemo {
	public static void main(String[] args) {
		String s="bdacfehg";
		char[] ch=s.toCharArray();
		int []nums= {1,6,9,2,4,3,7,8,5};
		System.out.println(String.valueOf(ch));
		printplus(nums);
		
		Arrays.sort(ch);
		Arrays.sort(nums);
		System.out.println();
		System.out.println(String.valueOf(ch));
		printplus(nums);
		
		System.out.println();
		System.out.println(Arrays.binarySearch(ch, 'e'));
		System.out.println(Arrays.binarySearch(nums,3 ));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		
	}
	static void printplus(int[]nums) {
		for(int i:nums) {
			System.out.print(i);
		}
	}
	

}
