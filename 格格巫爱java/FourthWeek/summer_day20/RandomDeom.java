package summer_day20;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomDeom {
	public static void main(String[] args) {
		Random r=new Random();
	
		for(int x=0;x<100;x++) {	
		int i=r.nextInt(3);
		System.out.println(i);
		}
		
	}

}
