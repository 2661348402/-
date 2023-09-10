package summer_day06;

public class SolutionDemo {
	public static void main(String[] args) {
		int []nums= {0,1,0,3,12};
		Solution2 s=new Solution2();
		for(int i:nums) {
			System.out.print(i+",");
		}
		int r=s.findRepeatNumber(nums);
		System.out.println();
		System.out.println(r);
		
	}
}
