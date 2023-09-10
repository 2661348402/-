package summer_day03;
import java.util.Scanner;
public class SolutionDemo {

	public static void main(String[] args) {
		int []nums= {1,3,5,6};
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		Solution sd=new Solution();
		System.out.println(sd.searchInsert(nums,target));

	}

}
