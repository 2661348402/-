package summer_day04;

public class SolutionDemo {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		Solution2 s=new Solution2();
		s.rotate(nums, 8);
		for(int i:nums) {
			System.out.println(i);
		}
	}

}
