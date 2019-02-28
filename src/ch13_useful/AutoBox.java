package ch13_useful;

public class AutoBox {
	public static void main(String[] args) {
		int num1 = 10;
		int num2;
		Integer i1;
//		Integer i2 = new Integer(20);
		Integer i2 = 20;
		i1 = num1;
		num2 = i2;
		System.out.println(num1 + "\t" + i1);
		System.out.println(num2 + "\t" + i2);
	}
}
