package summer_day20;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IndexDemo {
	public static void main(String[] args) {
		Random r1=new Random(5);
		Random r2=new Random(4);
		for(int i=0;i<10;i++) {
			System.out.print(r1.nextInt());
		}
		System.out.println();
		for(int i=0;i<10;i++) {
			System.out.print(r2.nextInt());
		}
		System.out.println();
		List<String> s=new ArrayList();
		s.add("ÎÒ");
		s.add("Òª");
		s.add("¼Ó");
		s.add("ÓÍ");
		for(int i=0;i<10;i++) {
			System.out.print(s.get(r1.nextInt(4)));
		}
		
	}

}
