package ch02;

import java.math.BigDecimal;

public class Ex08_big {
	// 실수값을 연산할 때 발생하는 오차
	public static void main(String[] args) {
		double a = 1.6;
		double b = 0.1;
		System.out.println(a+b);
		System.out.println(a*b);
		
		BigDecimal c = new BigDecimal("1.6");
		BigDecimal d = new BigDecimal("0.1");
		
		System.out.println(c.add(d));
		System.out.println(c.multiply(d));
		
	}

}
