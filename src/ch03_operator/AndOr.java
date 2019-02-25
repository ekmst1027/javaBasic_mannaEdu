package ch03_operator;

public class AndOr {
	public static void main(String[] args) {
		int a = 7;
		// A && B => A, B 모두 True
		// A || B => 둘 중 하나만 True
		System.out.println(a > 5 && a < 0);
		System.out.println(a > 5 || a < 0);
	}
}
