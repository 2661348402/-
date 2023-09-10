package summer_day07;
//����һ����ӹ���append()
//���ܶ������һ�ȡ��charAt()
/*			getChars()
 * 			indexOf(string)
 * 			indexOf(string,10)
 * 			substring()
 * 			
 */

/*			
 * ��������ɾ��delet()
 * 			deleteChatAt()
 * 
 * �����ģ���insert()
 * 		replace()
 * 		reverse()
 */





public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("hello");
		System.out.println(sb.length()+"----"+sb.capacity());
		
		sb.append("java").append("i").append("love").append("china");
		
		System.out.println(sb.charAt(5));
		
		char[]ch=new char[32];
		sb.getChars(0, 19, ch, 0);
		System.out.println(ch.length+"-----"+sb.length());
		String s=String.valueOf(ch);//���ַ�����װ�����ַ���
		System.out.println(s);
		
		sb.append("wsdsbwsfeiwu");
		sb.deleteCharAt(19);
		System.out.println(sb);
		sb.delete(19, 30);
		System.out.println(sb);
		
		sb.append("java").append("java");
		System.out.println(sb.indexOf("java"));
		System.out.println(sb.indexOf("java", 15));
		
		sb.insert(5, ch);
		System.out.println(sb);
		sb.insert(0, ch,5,10);
		System.out.println(sb);
		
		sb.replace(0, 20, "wwwwwwwwwwwww");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		String ss=sb.substring(20);
		System.out.println(ss);
		
	}

}
