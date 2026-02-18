package daily_practice;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DataType {
	public static void main(String[] args) {
		BigInteger bi=new BigInteger("2345678312345673456789876542398234");
		BigInteger bi1=new BigInteger("741852858954");
		
		System.out.println(bi.add(bi1));
		System.out.println(bi.multiply(bi1));
		System.out.println(bi.divide(bi1));
		System.out.println(bi.mod(bi1));
		
		System.out.println("*********************************");
		BigDecimal bc=new BigDecimal(100);
		BigDecimal bc1=new BigDecimal("52369842584125841269842584265254.741585684584");
		
		System.out.println(bc.add(bc1));
		System.out.println(bc.multiply(bc1));
		System.out.println("----------------------------");
//		bc1.divide(bc);
		System.out.println(BigDecimal.ROUND_CEILING);
		System.out.println(bc1.movePointLeft(3));
	}
}
