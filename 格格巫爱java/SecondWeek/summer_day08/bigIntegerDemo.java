package summer_day08;
/*
 * 18.BigInteger类---可以让超过Integer范围内的数据进行运算(即超过2147483647)
  java.math.BigInteger
  public BigInteger add(BigInteger val):加
  public BigInteger subtract(BigInteger val):减
  public BigInteger multiply(BigInteger val):乘
  public BigInteger divide(BigInteger val):除
  public BigInteger[] divideAndRemainder(BigInteger val):返回商和余数的数组

 */
import java.math.BigInteger;
public class bigIntegerDemo {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		Integer i=2147483647;
		BigInteger bi=new BigInteger("21474836410");
		BigInteger bi2=new BigInteger ("21474836411");
		System.out.println(bi.add(bi2));
		System.out.println(bi.subtract(bi2));
		System.out.println(bi.multiply(bi2));
		System.out.println(bi.divide(bi2));
		System.out.println(bi.divideAndRemainder(bi2));
	}

}
