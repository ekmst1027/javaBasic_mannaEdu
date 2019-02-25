package ch03_operator;

public class BitNot {
	public static void main(String[] args) {
		// ~ 연산자(비트값을 반전시킴, 0을 1로, 1을 0으로)
		byte a = 10;
		System.out.println(a); // 00001010 => 11110101
		System.out.println(~a); // bit not
	}
}
