package summer_day03;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("hello").append("world").append("java");
		sb.insert(5,5);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append(12346).append(789);
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.substring(16));
		System.out.println(sb.substring(0,15));
	
}
}
