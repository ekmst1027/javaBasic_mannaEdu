package ch03_operator;

public class AndOr {
	public static void main(String[] args) {
		int a = 7;
		// A && B => A, B ��� True
		// A || B => �� �� �ϳ��� True
		System.out.println(a > 5 && a < 0);
		System.out.println(a > 5 || a < 0);
	}
}
